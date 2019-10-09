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
public class CreateImpl implements ICreate {

	public void create(List<Employee> e) {

		int id, salary;
		String name, role, email, departmentName;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter role");
		role = sc.next();
		System.out.println("Enter email");
		email = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextInt();
		System.out.println("Enter department");
		departmentName = sc.next();
		e.add(new Employee(id, salary, name, role, email, departmentName));
		System.out.println("Successfully inserted\n");

	}

}
