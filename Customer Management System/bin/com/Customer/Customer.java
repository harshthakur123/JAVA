package com.Customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {

	private int custId;
	private String firstName, lastName, email, password;
	private double regAmount;
	public static int idCounter;
	private ServicePlan plan;
	private LocalDate dob,subscription_date;

// INITIALIZING "idcounter" WITH STATIC BLOCK 	

	static {
		idCounter = 1000;
	}

	public Customer(String firstName, String lastName, String email, String password, ServicePlan plan,
			double regAmount, LocalDate dob,LocalDate subscription_date) {

		this.custId = ++idCounter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.plan = plan;
		this.regAmount = regAmount;
		this.password = password;
		this.dob = dob;
		this.subscription_date=subscription_date;
	}

// OVER LOADED CONSTRUCTOR TO CKECH FOR DUPLICATION

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getSubscription_date() {
		return subscription_date;
	}

	public void setSubscription_date(LocalDate subscription_date) {
		this.subscription_date = subscription_date;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

// OVERRIDING TOSTRING	

	@Override
	public String toString() {
		return "\nCustomer Id :- " + custId + "\nFirst Name :- " + firstName + "\nLast Name=" + lastName + "\nEmail="
				+ email + "\nService Plan :- " + plan + "\nRegistration Amount :- " + regAmount + "\nDate Of Birth :- "
				+ dob +"\nLast paid Subscription :- "+subscription_date+ "\n"
				+ "--------------------------------------------------------------------------------------------------------";
	}

//OVERRRIDING EQUALS OF OBJECT	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object anotherObj) {
		if (anotherObj instanceof Customer) {
			return this.email.equals(((Customer) anotherObj).email);
		}
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.email.compareTo(o.email);
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
