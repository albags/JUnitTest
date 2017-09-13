/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayBefore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



/**
 * Description: Class calculate a day before to a given date
 * @author lozano
 * @version 1.0
 * 
 */
public class CalcDayBefore {
    
    /**
     * This function calculate the day before to a given date
     * @param day is the day of date to calculate
     * @param month is the month of date to calculate
     * @param year is the year of date to calculate
     * @return a String with date
     */
    public String dayBefore(int day, int month, int year){
        String valDate = String.format("%04d-%02d-%02d", year, month, day);        
        if(isValidDate(valDate)){
            String dateInString = String.format("%02d/%02d/%04d", day, month, year);
            Calendar c = Calendar.getInstance();
            try {      
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                c.setTime(formatter.parse(dateInString));
                c.add(Calendar.DATE, -1);
                dateInString = formatter.format(c.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return dateInString;
        }else{
            return "Wrong date";
        }
    }
    /**
     * This function validate a correct given date
     * @param date is a date to validate
     * @return true if a correct date or false isn't.
     */
    public boolean isValidDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
          dateFormat.parse(date.trim());
        } catch (ParseException pe) {
          return false;
        }
        return true;
    }    
}
