/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soalketiga;

/**
 *
 * @author asus
 */
public class Employee {
    private String Name;
    private String Adress;
    private long Salary;

    public Employee(String Name, String Adress, long Salary) {
        this.Name = Name;
        this.Adress = Adress;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long Salary) {
        this.Salary = Salary;
    }
    
    
}
