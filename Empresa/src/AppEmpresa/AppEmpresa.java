/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEmpresa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lozano
 */
public class AppEmpresa {
    
    Scanner sc = new Scanner(System.in);
    Empresa emp = new Empresa();
    /**
     * String that included the menu options
     */
    private final String[] mainMenuOptions = 
    {   "Exit",
        "Add a employee",
        "List all employees"        
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AppEmpresa myEmp = new AppEmpresa();
        myEmp.run();
    }
    /**
     * Module that initialized the app
     */
    private void run(){    
        /* Exit flag */        
        boolean exit = false;        
        /* menu option to execute */        
        int option;        
        // load or initialize the data
        do{       
            // Show and get option
            option = showMainMenu();           
            switch (option)
            {
                case 0:
                     // set true the exit flag
                    exit = true;
                    break;
                case 1:
                    // Add employee
                    add();
                    break;
                case 2:
                    listAll();
                    break;   
                default: // default or invalid option
                    System.out.print("Invalid option");
            }       
        }
        while(!exit);        
    }
    /**
     * Show menu options
     * @return selected option
     */
    public int showMainMenu(){
        int option = -1;         
        try
        {       
        System.out.println("====== Menu  ======");      
        for(int i=0; i < mainMenuOptions.length;i++)
        {        
            System.out.println( i + ". " + mainMenuOptions[i]  );
        }                
        System.out.print("Enter option: ");        
        option = sc.nextInt();
        }
        catch(Exception ex)
        {
            option = -1;
            sc.next();
        }
        return option;
    }
    /**
     * List all employees's attribute 
     */
    public void listAll(){
        emp.showEmp();
    }
    
    /**
     * Metode to add a employee
     */
    public void add(){        
        String name;
        int sal=0;  
        boolean okEmp = false;
        System.out.print("Introdueix el nom de l'empleat: ");
        name=sc.next();
        do{
            try{                
                System.out.print("Introdueix el complement salarial de l'empleat: ");
                sal=sc.nextInt();
                emp.addEmp(name, sal);  
                okEmp = true;
            }catch (InputMismatchException ex){
                System.out.print("Introdueix un valor numeric.");                
            }
            sc.nextLine();
        }while(!okEmp);
    }
}

