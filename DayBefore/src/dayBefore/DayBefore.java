/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayBefore;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Description: Class main ask a date and send to the CalcDayBefore Class
 * @author lozano
 * @version 1.0
 */
public class DayBefore {

    Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DayBefore yes = new DayBefore();
        yes.run();
    }
    
    public void run(){
        CalcDayBefore cY = new CalcDayBefore();
        int day, month, year;
        try{
            System.out.println("Insert date: ");        
            do{
                System.out.print("Day (DD): ");
                day = sc.nextInt();            
            }while(day<1 || day>31 );
            do{
                System.out.print("Month (MM): ");
                month = sc.nextInt();
            }while(month<1 || month>12 );
            do{
                System.out.print("Year (YYYY): ");        
                year = sc.nextInt();
            }while(year<=0 || (int)(Math.log10(year)+1)!=4); //Validate Year longitude             
            System.out.println(cY.dayBefore(day,month,year));
        }catch(InputMismatchException ex){
            System.out.println("Insert a correct date");
        }
    }    
}
