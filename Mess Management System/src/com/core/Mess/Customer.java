package com.core.Mess;

import java.time.LocalDate;
import java.io.Serializable;
import static com.core.Mess.MessPlan.*;

public class Customer implements Serializable {
	/*
	 * Customer id(int) , first name(String), last name (String), email(String),
	 * password(String), Address String, RegisterDate(LocalDate),
	 * planEndDate(LocalDate), Address(String), Phone No(String),plan Enum,
	 * final_amount double
	 */

	private int CustomerId;
	private String firstname, lastname, email, password, Address, PhoneNumber;
	private double final_amount;
	private LocalDate registrationDate, planEndDate;
	private MessPlan plan;

	public Customer(int customerId, String firstname, String lastnam, String email, String password, String Address,
			String phoneNumber, double final_amount, LocalDate registrationDate, MessPlan plan) {
		super();
		this.CustomerId = customerId;
		this.firstname = firstname;
		this.lastname = lastnam;
		this.email = email;
		this.password = password;
		this.Address = Address;
		this.PhoneNumber = phoneNumber;
		this.final_amount = final_amount;
		this.registrationDate = registrationDate;
		this.planEndDate = this.registrationDate.plusMonths(getDuration(plan));
		this.plan = plan;
	}

	public Customer() {
		super();
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public double getFinal_amount() {
		return final_amount;
	}

	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public MessPlan getPlan() {
		return plan;
	}

	public void setPlan(MessPlan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "CustomerId=" + CustomerId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", final_amount=" + final_amount
				+ ", registrationDate=" + registrationDate + ", planEndDate=" + planEndDate + ", plan=" + plan;
	}

}
