/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datejunit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author tue51138
 */
public class DateJUnit {

    /**
     * @param args the command line arguments
     */
    static theDate d1 = new theDate(20, 02, 2017);
    static theDate d2 = new theDate(26, 03, 2017);
    static theDate d3 = new theDate(20, 02, 2016);

    public static void main(String[] args) {
        System.out.println("Day Difference");

        int subtractDay = d1.totalDays(d2);
        System.out.println(subtractDay);

        Result result = JUnitCore.runClasses(datejunit.DateJUnit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

    }

    @Test
    public void test1() {
        assertEquals(400, d1.totalDays(d2));
    }

    @Test
    public void test2() {
        assertEquals(200, d1.totalDays(d3));
    }

    @Test
    public void test3() {
        assertEquals(36, d1.totalDays(d2));
    }
    
     @Test
    public void test4() {
        assertEquals(10, d2.totalDays(d3));
    }
    

}
