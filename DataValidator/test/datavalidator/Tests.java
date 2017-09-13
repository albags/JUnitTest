/**
 * Class where we will test our functions
 */
package datavalidator;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Joan Fernández & Jonathan Lozano
 */
public class Tests {
    
    Scanner scr = new Scanner(System.in);
    
    public Tests() {
    }
    
    /**
     * Test where we check if shows the name when its valid
     */
    @Test
    public void testCorrectName() {
        DataValidator dV = new DataValidator();
               
        dV.setName("Joan Fernandez");
        dV.validateName();
        String name=dV.getName();
        String expected="Joan Fernandez";      
        assertEquals(expected,name);

    }
    
    /**
     * Test where we check if returns a message error when its invalid
     */
    @Test
    public void testInvalidName() {
        DataValidator dV = new DataValidator();
               
        dV.setName("JoanFernandez");
        dV.validateName();
        String name=dV.getName();
        String expected="Missing surname";
        assertEquals(expected,name);
    }
    
    /**
     * Test where we check if returns the dni when its valid
     */
    @Test
    public void testValidDNI()
    {
        DataValidator dV = new DataValidator();
               
        dV.setDNI("39471624J");
        dV.validateDNI();
        String dni=dV.getDNI();
        String expected="39471624J";
        assertEquals(expected,dni);
    }
    
    /**
     * Test where we check if returns an error message when the DNI is invalid
     */
    @Test
    public void testInvalidDNI()
    {
        DataValidator dV = new DataValidator();
               
        dV.setDNI("39471624F");
        dV.validateDNI();
        String dni=dV.getDNI();
        String expected="Wrong DNI letter";
        assertEquals(expected,dni);
    }
    
    /**
     * Test where we check if returns the age when its valid
     */
    @Test
    public void testValidAge()
    {
        DataValidator dV = new DataValidator();
               
        dV.setYear(19);
        dV.validateAge();
        String age=dV.getAge();
        String expected="19";
        assertEquals(expected,age);
    }
    
    /**
     * Test where we check if returns an error message whn the age is invalid
     */
    @Test
    public void testInvalidAge()
    {
        DataValidator dV = new DataValidator();
               
        dV.setYear(200);
        dV.validateAge();
        String age=dV.getAge();
        String expected="Invalid age";
        assertEquals(expected,age);
    }
    
    /**
     * Test where we check if returns the weight when its valid
     */
    @Test
    public void testValidWeight()
    {
        DataValidator dV = new DataValidator();
               
        dV.setWeigth(63);
        dV.validateWeight();
        String weight=dV.getStringWeight();
        String expected="63.0";
        assertEquals(expected,weight);
    }
    
    /**
     * Test where we check if returns an error message when the weight is invalid
     */
    @Test
    public void testInvalidWeight()
    {
        DataValidator dV = new DataValidator();
               
        dV.setWeigth(29);
        dV.validateWeight();
        String weight=dV.getStringWeight();
        String expected="Invalid weight";
        assertEquals(expected,weight);
    }
    
     /**
     * Test where we check if returns the sex when its valid
     */
    @Test
    public void testValidSex()
    {
        DataValidator dV = new DataValidator();
               
        dV.setSex("Home");
        dV.validateSex();
        String sex=dV.getSex();
        String expected="Home";
        assertEquals(expected,sex);
    }
    
     /**
     * Test where we check if returns an error message when the sex is invalid
     */
    @Test
    public void testInvalidSex()
    {
        DataValidator dV = new DataValidator();
               
        dV.setSex("Indefinit");
        dV.validateSex();
        String sex=dV.getSex();
        String expected="Invalid sex";
        assertEquals(expected,sex);
    }
    
    /**
    * Test where we check if returns the marital status when its valid
    */
    @Test
    public void testValidMarStatus()
    {
        DataValidator dV = new DataValidator();
               
        dV.setMarStatus("Altre");
        dV.validateMarStatus();
        String mar=dV.getMarStatus();
        String expected="Altre";
        assertEquals(expected,mar);
    }
    
    /**
    * Test where we check if returns an error message when the marital status is invalid
    */
    @Test
    public void testInvalidMarStatus()
    {
        DataValidator dV = new DataValidator();
               
        dV.setMarStatus("Nose");
        dV.validateMarStatus();
        String mar=dV.getMarStatus();
        String expected="Invalid marital status";
        assertEquals(expected,mar);
    }
    
    /**
    * Test where we check if returns the email when its valid
    */
    @Test
    public void testValidEmail()
    {
        DataValidator dV = new DataValidator();
               
        dV.setEmail("joanfernandez1331@gmail.com");
        dV.validateEmail();
        String email=dV.getEmail();
        String expected="joanfernandez1331@gmail.com";
        assertEquals(expected,email);
    }
    
    /**
    * Test where we check if returns an error message when the email is invalid
    */
    @Test
    public void testInvalidEmail()
    {
        DataValidator dV = new DataValidator();
               
        dV.setEmail("joanfernandezgmail.com");
        dV.validateEmail();
        String email=dV.getEmail();
        String expected="Invalid email";
        assertEquals(expected,email);
    }
}
