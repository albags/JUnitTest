/*
 * This class will be used to inicialize the data and call the functions that will validate them.
 */
package datavalidator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Joan Fernández & Jonathan Lozano
 * @version 1.0
 */
public class IndexValidator {
    Scanner scr = new Scanner(System.in);
    
    public static void main (String [] args)
    {
        IndexValidator ex = new IndexValidator();
        ex.run();
        
    }
    /** Works like the main and prevents static problems
     * @author Joan Fernández & Jonathan Lozano
     * @version 1.0
     */
    private void run()
    {
        DataValidator dV = new DataValidator();
        
        System.out.println("USER INFO");
        System.out.print("Enter name and at least one surname: ");
        dV.setName(scr.nextLine());        
        
        System.out.print("Enter your DNI: ");
        dV.setDNI(scr.next());       
        
        try{
        System.out.print("Enter your age: ");
        dV.setYear(scr.nextInt());
        }catch(InputMismatchException ex){
            System.out.println("Add a correct age value");
            scr.nextLine();
        }
        try{
        System.out.print("Enter your weight: ");
        dV.setWeigth(scr.nextFloat());
        }catch(InputMismatchException ex){
            System.out.println("Add a correct weight value");
            scr.nextLine();
        }
        
        System.out.print("Enter your sex (Home/Dona): ");
        dV.setSex(scr.next());
        
        System.out.print("Enter your marital status (Casat/Solter/Altre): ");
        dV.setMarStatus(scr.next());
        
        System.out.print("Enter your email: ");
        dV.setEmail(scr.next()); 

        System.out.println("==============================");
        System.out.println("DADES PERSONALS:");
        System.out.println("Name: "+dV.validateName());
        System.out.println("DNI: "+dV.validateDNI());       
        System.out.println("Age: "+dV.validateAge());
        System.out.println("Weight: "+dV.validateWeight());       
        System.out.println("Sex: "+dV.validateSex());           
        System.out.println("Marital Status: "+dV.validateMarStatus());        
        System.out.println("Email: "+dV.validateEmail());
    }
}
