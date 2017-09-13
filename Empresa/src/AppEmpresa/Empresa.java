/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEmpresa;

import java.util.ArrayList;

/**
 *
 * @author lozano
 */
public class Empresa {
    
    private final int maxEmp = 10;

    public int getMaxEmp() {
        return maxEmp;
    }
    /**
     * ArrayList with employees
     */
    ArrayList<Employee> employees = new ArrayList<>();
    Employee emp;
    
    /**
     * Metode to add a employee with name and salary
     * @param name introduce the employee name
     * @param salary insert the employee salary increment 
     * @return the addEmp result
     */
    public boolean addEmp(String name, int salary){
        boolean empOk;        
        if(salary <= 0) {
            System.out.println("El complement no pot ser negatiu.");
            empOk = true;
        }else if(employees.size()>=maxEmp){
            System.out.println("L'empresa ha arribat al màxim d'empleats.");
            empOk = true;
        }else{
            emp = new Employee(name, salary);
            employees.add(emp);                    
            empOk = true;
        }
        return empOk;
    }
    
    /**
     * Metode to show all employees
     */
    public void showEmp(){        
        for(int i=0;i<employees.size();i++){
            System.out.println(i+1+". Nom: "+employees.get(i).getName());
            System.out.print(" - Sou: "+employees.get(i).getSal());
        }
    }
}