package Custom_Exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.Mess.Customer;
import com.core.Mess.MessPlan;

public class Mess_Exception {

// a) Validate Customer check for Duplication

	public static void checkForDuplication(int customerId, Map<Integer, Customer> custMap)
			throws InvalidInputException {
		if (custMap.containsKey(customerId))
			throw new InvalidInputException("Customer already exist!!!");

	}

	/*
	 * b) Validatecustomer login if not exist or invalid mail & invalid password
	 * Email must be like regex provided in :
	 * "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"
	 */

	public static Customer signIn(String email, String password, Map<Integer, Customer> custMap)
			throws InvalidInputException {

		validateEmailformat(email);
		Customer c = null;

		for (Customer i : custMap.values()) {
			if (i.getEmail().equals(email)) {
				if (i.getPassword().equals(password)) {
					c=i;
					break;
				} else
					throw new InvalidInputException("Incorrect Password!!!");

			}

		}

		if (c == null)
			throw new InvalidInputException("Email id doesn't exist!!!");
		return c;
	}

//	c) ParseValidatePlan , registration amount must be match with plan

	public static MessPlan parseAndValidateMessPlan(String plan, double regAmount) throws InvalidInputException {

		for (MessPlan i : MessPlan.values()) {
			if (i.name().equalsIgnoreCase(plan) && i.getMonthlyPrice() == regAmount)
				return i;
		}
		throw new InvalidInputException("Select a valid plan!!!\n\nMonthly(3000), Quarterly(11700), HalfYear(17500)");

	}

	/*
	 * d) Parse local Date registration date can be only todays date or after todays
	 * date and end date must be depend on plan selected
	 */

	public static void checkRegDate(LocalDate regDate) throws InvalidInputException {
		LocalDate Todaydate = LocalDate.now();
		if (regDate.isBefore(Todaydate))
			throw new InvalidInputException("Registration date must be today's date or future!!!");
	}

//e) Phone number must be only 10 character and the number could be between 0 to 9. 	
	public static void validatePhoneNumber(String phoneNumber) throws InvalidInputException {
		{
			if (!phoneNumber.matches("[0-9]{10}"))
				throw new InvalidInputException("Enter a 10 digit number!!!");
		}
	}

	// Vlidate email format

	public static void validateEmailformat(String email) throws InvalidInputException {

		if (!email.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"))
			throw new InvalidInputException("Enter email in given format!!!");
	}

	public static Map<Integer, Customer> validateAllInputs(int customerId, String firstname, String lastname,
			String email, String password, String address, String phoneNumber, double final_amount,
			LocalDate registrationDate, String plan, Map<Integer, Customer> custMap) throws InvalidInputException {

		checkForDuplication(customerId, custMap);
		MessPlan parseAndValidateMessPlan = parseAndValidateMessPlan(plan, final_amount);
		validateEmailformat(email);
		checkRegDate(registrationDate);
		validatePhoneNumber(phoneNumber);

		Map<Integer, Customer> messMap = new HashMap<>();

		messMap.put(customerId, new Customer(customerId, firstname, lastname, email, password, address, phoneNumber,
				final_amount, registrationDate, parseAndValidateMessPlan));

		return messMap;
	}

}
