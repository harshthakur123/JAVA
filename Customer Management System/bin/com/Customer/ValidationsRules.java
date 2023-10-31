package com.Customer;

import java.util.List;
import java.time.LocalDate;

//Checking validation of plan-------------------------------------------------------------------------------

public class ValidationsRules {

	public static ServicePlan ValidatePlan(String plan) throws InvalidInputException {

		boolean status = false;
		for (ServicePlan i : ServicePlan.values()) {
			if (i.name().equals(plan)) {
				status = true;
				break;
			}
		}
		if (status == false)
			throw new InvalidInputException("Plan doesnt exist!!! Please choose the plan from above list.");

		return ServicePlan.valueOf(plan.toUpperCase());

	}

//Checking validation of registration amount-------------------------------------------------------------------

	public static void ValidateRegAmount(String plan, double regAmount) throws InvalidInputException {

		if (ServicePlan.valueOf(plan).getPrice() != regAmount) {
			throw new InvalidInputException(
					"Registration amount and plan is not matching, Enter valid registration amount!!!");
		}

	}

// Check for duplicate email----------------------------------------------------------------------------------

	public static void checkDupEmail(String email, List<Customer> customer) throws InvalidInputException {
		Customer cust = new Customer(email);
		if (customer.contains(cust))
			throw new InvalidInputException("This email already exists!!! Enter another email...");
	}

// Authentication -------------------------------------------------------------------------------------------
	public static Customer authentication(String emailId, String password, List<Customer> customer)
			throws InvalidInputException {

		Customer c = new Customer(emailId);
		if (!customer.contains(c))
			throw new InvalidInputException("Email Id doesnot exist!!!");

		c = customer.get(customer.indexOf(c));

		if (!c.getPassword().equals(password))
			throw new InvalidInputException("Incorrect Password!!!");

		return c;

	}

// Check for format of email----------------------------------------------------------------------------------

	public static void formatEmail(String email) throws InvalidInputException {
		if (!email.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)")) {
			throw new InvalidInputException(
					"Enter email in given format!!!" + "[a-z]+[a-z0-9]+@[a-z]*\\\\.(com|org|net)");
		}
	}

// Check for password 

//	public static void checkPassword(String password) throws InvalidInputException {
//		if(password.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)"))
//			throw new InvalidInputException("Enter email in given format!!!"
//					+ "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)");
//	
//	
//	}
//	

// Validate all exceptions--------------------------------------------------------------------------------------

	public static Customer valiDateAllInputs(String firstName, String lastName, String email, String password,
			String plan, double regAmount, String dob,String subscriptionDate, List<Customer> customer) throws InvalidInputException {

		ServicePlan plan2 = ValidatePlan(plan);
		ValidateRegAmount(plan, regAmount);
		 formatEmail(email);
		checkDupEmail(email, customer);

		return new Customer(firstName, lastName, email, password, plan2, regAmount, LocalDate.parse(dob),LocalDate.parse(subscriptionDate));

	}
}
