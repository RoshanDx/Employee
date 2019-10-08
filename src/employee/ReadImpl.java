/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import employee.Employee;
import employee.IRead;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yamuna
 */
public class ReadImpl implements IRead{
    
    public void read(List<Employee> e){
    
            if (e.isEmpty()) {
            System.out.println("No Record !");
        } else {
            Iterator<Employee> itr = e.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next() + "\n");
            }
        }
    
    }
    
}
