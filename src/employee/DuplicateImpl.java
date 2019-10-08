/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author yamuna
 */
public class DuplicateImpl implements IDuplicate{
    
        public void duplicate(List<Employee> e) {
        HashSet h = new HashSet(e);
        e.clear();
        e.addAll(h);
        System.out.println("Duplicate Record Removed\n");
    }
}
