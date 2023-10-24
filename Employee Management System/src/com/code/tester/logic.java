package com.code.tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class logic {

	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	static Employee[] e = new Employee[5];

	// Hire Manager

	public static void hiremanager() {
		if (index < e.length) {
			System.out.println("Enter Manager Details :\n");
			System.out.println("'Employee Id'   'Name'   'DeptId'   'Salary'  'Performance Bounus' ");

			e[index++] = new Manager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
			System.out.println("\nManager Added Successfully!!!");
		} else
			System.out.println("Array is full!!!");

	}

	//Hire Worker
	public static void hireworker() {
		if (index < e.length) {
			System.out.println("Enter Worker Details:\n");
			System.out.println("'Employee Id'   'Name'   'DeptId'   'Salary'  'Hourly Rate'   'Hours Worked' ");
			e[index] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble());
			index++;
			System.out.println("Worker Added Successfully!!!");
		} else
			System.out.println("Array is full!!!");
	}
	
	
	//Display
	
	public static void display() {
		boolean status=false;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				System.out.println("\nEmployee" + (i + 1) + ":-\n\n" + e[i]);
				if (e[i] instanceof Manager)
					System.out.println("Net Salary of Manager :- " + ((Manager) e[i]).computeNetSal());
				else
					System.out.println("Net Salary of Worker :- " + ((Worker) e[i]).computeNetSalary());
			status=true;
			}
		}
		if (status == false)
			System.out.println("Array is empty");
	}
	
	
	//Fire
	public static void fire() {
		System.out.println("To fire an employee, enter employee id :- ");
		int temp_id=sc.nextInt();
		boolean status = false;
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null) {
			if(e[i].getEmpid()==temp_id)
			{
				if (e[i] instanceof Manager)
					{System.out.println(e[i].getName()+" Fired!!!"+" Designation:- Manager");
					e[i]=null;}
				
				else
					{System.out.println(e[i].getName()+" Fired !!! "+"Designation :- Worker");
					e[i]=null;}
				status=true;
			
				
			}
			else
				status=false;
				
			}
			
			continue;
				
		}
		if(status=false)
			System.out.println("Employee id not found!!!\n");
	sc.close();
	}
	
	
	
}
