/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datejunit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author tue51138
 */
public class theDate {

    final int day;
    final int month;
    final int year;

    theDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println(day + "-" + month + "-" + year);
    }

    public int getday() {
        return this.day;

    }

    public int getmonth() {
        return this.month;
    }

    public int getyear() {
        return this.year;
    }

    public int totalDays(theDate newDate) {
        int dateDif = newDate.getday();
        int monthDif = newDate.getmonth() * 30;
        int yearDif = newDate.getyear() * 365;

        int totalDays;
        totalDays = dateDif + monthDif + yearDif;

        int d1Days;
        d1Days = (this.day) + (this.month * 30) + (this.year * 365);

        return Math.abs(d1Days - totalDays);

    }

}

