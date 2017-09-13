/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayBefore;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Description: JUnit Test to testing the CalcDayBefore Class
 * @author lozano
 * @version 1.0
 */

@RunWith(value=Parameterized.class)
public class TestDayBefore {

    @Parameters
    public static Iterable<Object[]> getData(){
        List <Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{1,2,2000,"31/01/2000"});
        obj.add(new Object[]{31,2,1900,"Wrong date"});
        obj.add(new Object[]{1,1,2000,"31/12/1999"});
        obj.add(new Object[]{1,3,2000,"29/02/2000"});
        obj.add(new Object[]{1,3,1999,"28/02/1999"});
        return obj;

    }
    
    private int day;
    private int month;
    private int year;
    private String exp;
    
    public TestDayBefore(int day, int month, int year, String exp) {
        this.day=day;
        this.month=month;
        this.year=year;
        this.exp=exp;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testDay() {
     CalcDayBefore cY = new CalcDayBefore();
     String result = cY.dayBefore(day,month,year);
     assertEquals(exp, result);
    }
    
    
}
