package Containment;

import java.util.Scanner;
import Containment.Date;
import Containment.Employee;

public class tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee();
		Date d1=new Date();
		System.out.println(e1);
		
		System.out.println("\n\n");
		
		System.out.println("Enter Empid Name Salary DOJ(dd/mm/yyyy) ");
		Employee e2=new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),new Date(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		System.out.println(e2);
	
	
	}

}
