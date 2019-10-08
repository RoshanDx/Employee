/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import employee.Employee;
import employee.IDelete;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yamuna
 */
public class DeleteImpl implements IDelete {

    public void delete(List<Employee> e, int id) {
        Iterator<Employee> itr2 = e.iterator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        id = sc.nextInt();
        boolean matchFound = false;
        while (itr2.hasNext()) {

            if (itr2.next().getId() == id) {
                itr2.remove();
                System.out.println("Deleted Successfully\n");
                matchFound = true;
            }

        }
        if (!matchFound) {
            System.out.println("RECORD NOT FOUND\n");
        }
    }
}
