/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author yamuna
 */
public class Manager extends Employee{
    

    public Manager(int id, int salary, String name, String role, String email, String departmentName) {
        super(id, salary, name, role, email, departmentName);
    }
    
    //Liskov substitution
    //What happens here ovverides the parent class which in the Employee class ( getDetails() )
    public String getDetails(){
    
    return "Manager : " + id + " - " + name + " - " + role
        + " - " + email + " - " + salary + " - " + departmentName;
    }
    
}
