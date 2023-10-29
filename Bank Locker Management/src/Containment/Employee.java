package Containment;

import Containment.Date;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private Date doj;
	
	
	Employee(int empid,String name,double salary,Date doj){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.doj=doj;
	}
	
	
	Employee(){
		empid=101;
		name="Harsh";
		salary=50000;
		this.doj=new Date();
		System.out.println("----default constructor of Employee----");
	}
	
	public String toString() {
		return "\nEmpid = "+empid+"\nName = "+name+"\nSalary = "+salary+"\nDate of joining = "+doj; 
	}
	
	
	
	
}
