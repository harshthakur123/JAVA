package com.app.org;

public class Manager extends Employee{
	private double perfBonus;

	

	public Manager() {
		super();
	}
	
	public Manager(int empid,String name,int deptId, double Salary,double perfBonus) {
		super(empid,name,deptId,Salary);
		this.perfBonus=perfBonus;
		
	}
	
	public String toString() {
		return super.toString()+"\nPerformance Bonus :- "+perfBonus;
	}
	
	
	public double computeNetSal()
	{
		return Salary+perfBonus;
	}
	
	public double perfBonus() {
		return perfBonus;
	}
	
	
}
