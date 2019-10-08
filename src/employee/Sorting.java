/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Comparator;
/**
 *
 * @author DX
 */
public class Sorting implements Comparator<Employee> {
 
    // Used for sorting in ascending order of employee id
    @Override
    public int compare(Employee a, Employee b) 
    { 
        return a.id - b.id; 
    } 
} 
    
