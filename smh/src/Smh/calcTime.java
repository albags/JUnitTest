/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smh;

/**
 * This class transform a given seconds to a HH:MM:SS format
 * @author lozano
 * 
 */
public class calcTime {
    
    private int seconds;
    
    public calcTime() {
    }    
    
    public calcTime(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    /**
     * This function translate seconds to HH:MM:SS format
     * @return a String time with the calcul function or empty.
     */
    public String calcHMS(){
        String time = "";
        if(seconds>0){            
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int sec = seconds % 60;

            //Function String.format to format a variables to HH:MM:SS format
            time = String.format("%02d:%02d:%02d", hours, minutes, sec);

            return time;
        }else{
            return "";
        }
        
    }
    
}
