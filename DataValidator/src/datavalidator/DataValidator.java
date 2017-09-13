/*
 * This class will be used to create the functions that validates the data @params
 */
package datavalidator;

import static java.lang.Character.toUpperCase;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** 
 * @author Joan Fernández & Jonathan Lozano
 * @version 1.0
 * @param 
 */
public class DataValidator {
    private String name;
    private String DNI;
    private int year;
    private String age;
    private double weight;
    private String stringWeight;
    private String sex;
    private String marStatus;
    private String email;

    /**
     * This is the DataValidator constructor with params to validate
     * @param name This is the user name. It has a name and at least one surname
     * @param DNI This is a spanish identity card. It has 8 numbers and a letter
     * @param year User age. This is a integer number
     * @param weight User weight. This is a float number
     * @param sex User sex. We have two options: Home i dona
     * @param marStatus User marital status. We have two options: Solter, casat i altres
     * @param email This is a user email. This has to be email format.
     */
    public DataValidator(String name, String DNI, int year, double weight, String sex, String marStatus, String email) {
        this.name = name;
        this.DNI = DNI;
        this.year = year;
        this.weight = weight;
        this.sex = sex;
        this.marStatus = marStatus;
        this.email = email;
    }
    
    public DataValidator()
    {
        
    }
    
    
    //Getters & Setters
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public void setWeigth(double weight) {
        this.weight = weight;
    }
    
    public void setStringWeight(String stringWeight) {
        this.stringWeight = stringWeight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMarStatus(String marStatus) {
        this.marStatus = marStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDNI() {
        return DNI;
    }

    public int getYear() {
        return year;
    }
    
    public String getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    
    public String getStringWeight() {
        return stringWeight;
    }

    public String getSex() {
        return sex;
    }

    public String getMarStatus() {
        return marStatus;
    }

    public String getEmail() {
        return email;
    }
    
    /**
     * This function validates a correct format name.
     * Save four different Strings. If name is empty or null. If name is a 
     * numeric value. If name is missing surname or the correct name.
     */
    public String validateName(){        
        if(name.isEmpty()||name==null) return "Empty or null name";        
        if(!isNumeric(name)){
            if(name.contains(" ")) {
                return name;
            } else {
                return "Missing surname!";
            }
        }else{
            return  "Name isn't a numeric value!";
        }      
    }
    /**
     * This function validate a correct DNI format and a correct DNI letter. 
     */
    public String validateDNI(){
        if(DNI.length()!=9){
            return "Wrong DNI size!";    
        }else{
            try{
                String letter = DNI.substring(8);
                String pattern= "^[a-zA-Z]*$";        
                if(letter.matches(pattern)){
                    int nums = Integer.parseInt(DNI.substring(0,8));
                    int resto = nums%23;
                    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

                    if(toUpperCase(letter.charAt(0)) == letras.charAt(resto)){
                        return DNI;
                    }else{
                        return "Wrong DNI letter!";    
                    }                
                }else{
                    return "Invalid DNI letter!";               
                }  
            }catch(Exception ex){
                return "Insert a valid DNI format!";                
            }
        }       
    }
    
    /**
     * This function validates a age between 1 and 100 years. 
     */
    public String validateAge(){
        if (valuesBetween((double)year,1,100)){
            return Integer.toString(year);
        }
        else{
            return "Invalid age!";
        }         
    }
        
    /**
     * This function validates a weight between 1 and 200 kilograms. 
     */
    public String validateWeight(){
        if (valuesBetween(weight,30,200)){
            return String.valueOf(weight);
        }
        else{
            return "Invalid weight!";
        }         
    }    
    
    /**
     * This function validates if the sex is Home or Dona, with no key sensitive problems
     */
    public String validateSex(){
        String UpSex="";
        
        UpSex=sex.toUpperCase();
        
        if(UpSex.compareTo("HOME")==0 || UpSex.compareTo("DONA")==0){
            return sex;
        }
        else
        {
            return "Invalid sex!";
        }
    }
    
    /**
     * This function validates if the marital status is Casat, Solter or Altre, with no key sensitive problems
     */
    public String validateMarStatus(){
        String UpStat="";
        
        UpStat=marStatus.toUpperCase();
        
        if(UpStat.compareTo("SOLTER")==0 || UpStat.compareTo("CASAT")==0 || UpStat.compareTo("ALTRE")==0){
            return marStatus;
            
        }
        else
        {
            return "Invalid marital status!";
        }
    }
    
    /**
     * This function compares de email with a regEx, and validates it
     */
    public String validateEmail(){
        Pattern regEx = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
         Matcher mather = regEx.matcher(email); //Compare the String with the regEx
 
        if (!mather.find() == true){
            return "Invalid email!";
        }
        else
        {
            return email;
        }
    }

    /**
     * This function validates a correct number between two others
     * @param var is a variable to validate
     * @param one is a minimal number
     * @param two is a max number
     * @return true if number is between others two numbers or false isn't.
     */
    public boolean valuesBetween(double var, double one, double two){
        if(var>=one && var<=two){
            return true;
        }else {            
            return false;
        }
    }
    
    /**
     * This function validates a numeric String.
     * @param input is the string to check.
     * @return true is a numeric string or false isn't.
     */
    public boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            // s is not numeric
            return false;
        }
    }
}
