/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.List;
import java.util.Objects;


/**
 *
 * @author yamuna
 */public class Employee{
    
    int id;
    int salary;
    String name;
    String role;
    String email;

    public Employee(int id, int salary, String name, String role, String email) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.role = role;
        this.email = email;
        
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee : " + id + " - " + name + " - " + role
        + " - " + email + " - " + salary;
    }   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

