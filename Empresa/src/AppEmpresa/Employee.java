/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEmpresa;

/**
 *
 * @author lozano
 */
public class Employee {
    
    
    private final int minSal = 800; // Constant with minimal salary
    private int sal = 0;
    private String name;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal+minSal;
    }

    public int getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }

    public void setSal(int sal) {
        this.sal = sal+minSal;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
