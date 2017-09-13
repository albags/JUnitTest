/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smh;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Description: App that convert seconds to hours, minutes and seconds
 * @author lozano
 * 
 */
public class Smh {

    Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Smh smh = new Smh();
        smh.run();
        // TODO code application logic here
    }
    /**
     * Method to execute the function
     */
    public void run(){
        
        calcTime cT = new calcTime();
        
        int sec = 0;
        boolean ok=false;
        System.out.print("Seconds to H:M:S\n");
        while(!ok){
            System.out.print("\nIntrodueix un numero de segons: ");
            try{
                sec = sc.nextInt();                                   
                ok=true;
                cT.setSeconds(sec);
                sc.nextLine();
                System.out.println("\nHours: "+cT.calcHMS());                     
            }catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("Has d'insertar un valor numeric");
            }
        }        
    }   
}
