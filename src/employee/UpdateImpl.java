/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yamuna
 */
public class UpdateImpl implements IUpdate {

    public void update(List<Employee> e, int id) {

        boolean matchFound = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        id = sc.nextInt();

        for (Employee e1 : e) {

            if (e1.getId() == id) {
                System.out.println("Enter name");
                e1.name = sc.next();
                System.out.println("Enter role");
                e1.role = sc.next();
                System.out.println("Enter email");
                e1.email = sc.next();
                System.out.println("Enter salary");
                e1.salary = sc.nextInt();

//            if (e1.getId() == e1.id) {
                e1.setName(e1.name);
                e1.setRole(e1.role);
                e1.setEmail(e1.email);
                e1.setSalary(e1.salary);
                System.out.println("Updated Successfully\n");
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("ID NOT FOUND\n");
        }
    }
}
