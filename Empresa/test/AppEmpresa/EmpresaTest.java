/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEmpresa;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lozano
 */

public class EmpresaTest {
    Empresa emp;
    /**
     * Create a object Empresa
     */
    @Before
    public void before(){        
        emp = new Empresa();               
    }
    /**
     * Add a new Employee with negative increment
     */
    @Test   
    public void testAddNeg() {
        boolean ok;
        ok = emp.addEmp("Juan", -100);   
        assertTrue(ok);
    }
    /**
     * Add a new employee with correct data
     */
    @Test   
    public void testAdd() {
        boolean ok;
        ok = emp.addEmp("Juan", 100);   
        assertTrue(ok);
    }
    
    /**
     * Add more than max employees
     */
    @Test   
    public void testAddMoreEmp() {
        boolean ok;
        for(int i=0;i<=emp.getMaxEmp();i++){
            ok = emp.addEmp("Emp"+i, 100+i);   
            assertTrue(ok);
        }        
    }

    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
