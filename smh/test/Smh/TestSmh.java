/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smh;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author lozano
 */

@RunWith(value=Parameterized.class)
public class TestSmh {
    @Parameters
    public static Iterable<Object[]> getData(){
        List <Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{-2});
        obj.add(new Object[]{0});
        obj.add(new Object[]{"a"});
        return obj;
    }
    
    calcTime cT = new calcTime();
    private int secs;
    
    public TestSmh(int secs) {
        this.secs=secs;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void testSecs() {
        cT.setSeconds(secs);
        assertNotNull(cT.calcHMS());        
    }
}
