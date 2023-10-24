package com.app.org;

public class Worker extends Employee {
	private double hoursWorked;
	private double hourlyRate;

	public Worker() {
		super();
	}

	public Worker(int empid, String name, int deptId, double Salary, double hoursWorked, double hourlyRate) {
		super(empid, name, deptId, Salary);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHoulryRate(double hourlyRate) {
		this.hourlyRate=hourlyRate;
	}
	
	
	public double computeNetSalary() {
		return super.Salary+(hoursWorked*hourlyRate);
	}
	
	public String toString() {
		return super.toString()+"\nHours Worked :- "+hoursWorked+"\nHourly Rate :- "+hourlyRate;
	}
	
	
	
	
	
}
