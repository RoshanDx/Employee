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
 * @author roshan
 */
public class Main {

	public static void main(String[] args) {

		List<Employee> e = new ArrayList<>();
		List<Employee> ITDepartment = new ArrayList<>();
		int id = 0;
		int salary = 0;
		String name = null, role = null, email = null, departmentName = null;
		boolean exit = false;

		// Add record to to the list
		e.add(new Employee(123, 3000, "Frank Smith", "Manager", "franky@gmail.com", "A"));
		e.add(new Manager(123, 5000, "John Wick", "CEO", "jardani@gmail.com", "B"));

		// Add the Employee to their respective Department
		ITDepartment.add(new Employee(123, 3000, "Frank Smith", "Manager", "franky@gmail.com", "A"));
		ITDepartment.add(new Employee(124, 2000, "Will Smith", "Staff", "will@gmail.com", "A"));

		// Create an object Employee emp
		Employee emp = new Employee(id, salary, name, role, email, departmentName);
		// Create an object Department and assign the department attributes
		Department dpt = new Department("A", 332, ITDepartment);
		// Once done, store the create Department object using setDepartment which was
		// created in the Employee class.
		emp.setDepartment(dpt);

		do {
			System.out.println("Employee Record\n");
			System.out.println("1. Create Employee");
			System.out.println("2. Read Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Remove Duplicate Record");
			System.out.println("6. Department");
			System.out.println("Enter Choice:");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			ReadImpl read = new ReadImpl();

			switch (choice) {
			case 1:
				CreateImpl crt = new CreateImpl();
				crt.create(e);

				Collections.sort(e, new Sorting());
				break;
			case 2:
				read.read(e);
				break;

			case 3:
				UpdateImpl update = new UpdateImpl();
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

			case 6:
				System.out.println(emp.getDepartment());
				break;
			}
		} while (!exit);
	}
}
