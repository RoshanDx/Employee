/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yamuna
 */
public class Main{

    public static void main(String[] args) {

        List<Employee> e = new ArrayList<>();
        
        int id = 0;
        boolean exit = false;

        //Add record to to the list 
        e.add(new Employee(123, 3000, "Frank Smith", "Manager", "franky@gmail.com"));
        e.add(new Employee(332, 5000, "John Wick", "CEO", "jardani@gmail.com"));
        
        do {
            System.out.println("Employee Record\n");
            System.out.println("1. Create Employee");
            System.out.println("2. Read Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Remove Duplicate Record");
            System.out.println("Enter Choice:");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CreateImpl create = new CreateImpl();
                    create.create(e);
                    Collections.sort(e, new Sorting());
                    break;
                case 2:

                    ReadImpl read = new ReadImpl();
                    read.read(e);
                    break;
                case 3:
                   UpdateImpl update= new UpdateImpl();
                   update.update(e, id);
                    break;
                case 4:
                    DeleteImpl delete = new DeleteImpl();
                    delete.delete(e, id);
                    
                    break;
                case 5:
                    DuplicateImpl dup = new DuplicateImpl();
                    dup.duplicate(e);
                    break;
            }
        } while (!exit);
    }
}
