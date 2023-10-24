package com.app.org;

public class Employee {
	private int empid,deptId;
	private String name;
	protected double Salary;
	
	
	public Employee() {
		super();
		System.out.println("-----Default Constructor of Employee----");
	}
	
	public Employee(int empid,String name,int deptId,double Salary)
	{
		this.Salary=Salary;
		this.deptId=deptId;
		this.empid=empid;
		this.name=name;
		
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Employee Id :- "+empid+"\nName :- "+name+"\nDepartment Id :- "+deptId+"\nSalary :- "+Salary;
	}
	
	public double computeNetSal() {
		return Salary;
	}
	

}
