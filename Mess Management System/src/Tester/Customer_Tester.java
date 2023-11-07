package Tester;

import static Custom_Exception.Mess_Exception.signIn;
import static Custom_Exception.Mess_Exception.*;
import static Utils.MessUtils.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import com.core.Mess.Customer;
import Custom_Exception.InvalidInputException;
import static IO_Utils.ReadWriteInChar.*;
import static IO_Utils.ReadAndWriteInBinary.*;

public class Customer_Tester {

	public static void main(String[] args) throws InvalidInputException {
		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Customer> custMap = populateMessDetails();

			Customer c = new Customer();
			boolean exit = false;
			while (!exit) {
				System.out.println("\n1. Sign up Customer\r\n" + "2. Sign in\r\n" + "3. Change Password  \r\n"
						+ "4. Sort Customer as per \r\n" + "A) First name \r\n" + "B) According to plan\r\n"
						+ "C) According to date of registration\r\n" + "5. Unsubscribe outdated subscription\r\n"
						+ "6. Display all Customers\r\n"
						+ "7) Modify all customers first name (make first Letter capital of customers first name)\r\n"
						+ "8) Display email addresses of the customers who did registration in month of January\r\n"
						+ "9) Display count of the Customers who have register for plan: Monthly\r\n"
						+ "10) Search the Customer who lived in Akurdi.\r\n"
						+ "11) Give the 20% discount to the customers who have selected plan for 1 year.\r\n"
						+ "12) Store Data in Char\n" + "13) Restore data from text file\n"
						+ "14) Store data in binary file\n" + "15) Restore data from binary file\n"
						+ "\n\nEnter Choice :-");

				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add customer details :- ");
						System.out.println("customerId, firstname, lastname, email, password, \r\n"
								+ "address, phoneNumber, final_amount, registrationDate, plan");
						custMap = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()), sc.next().toUpperCase(),
								custMap);
						System.out.println("Data stored successfully!!!");
						break;

					case 2:
						System.out.println("Enter email and passsword");
						c = signIn(sc.next(), sc.next(), custMap);
						System.out.println("Authentication Successfull!!!\n" + c);
						break;

					case 3:
						System.out.println("Enter email and passsword");
						c = signIn(sc.next(), sc.next(), custMap);
						System.out.println("Authentication Successfull!!!\nEnter new password :-");
						c.setPassword(sc.next());
						System.out.println("Password Changed Successfully!!!");
						break;

					case 4:
						System.out.println("Select the sorting criteria :- \n\"A) First name " + "B) According to plan\n" + 
								"						+ \"C) According to date of registration\n");
						char ch=sc.next().charAt(0);
						if (ch=='A'||ch=='a') {
							sortByFirstName(custMap);
							} 
						else if (ch == 'B' || ch=='b') {
							sortByPlan(custMap);
						} 
						else if (ch == 'C'||ch=='c') {
							sortByRegDate(custMap);
						}

						
							
						break;

					case 5:
						unsubscribeOutdatedSubscription(custMap);
						System.out.println("All outdated subscriptions are removed!!!");
						break;

					case 6:
						custMap.values().forEach(System.out::println);

						break;

					case 7:
						for (Customer i : custMap.values()) {
							String capFirstLetterOfFirstname = i.getFirstname().substring(0, 1).toUpperCase()
									+ i.getFirstname().substring(1);
							i.setFirstname(capFirstLetterOfFirstname);

						}
						System.out.println("Updated first letter of firstname capital!!!");

						break;

					case 8:
						System.out.println("\nDisplay email of customer whose registration month is january :-\n");
						custMap.values().stream().filter(p -> p.getRegistrationDate().getMonthValue() == 01)
								.forEach(p -> p.getEmail());
						break;

					case 9:

						long count = custMap.values().stream()
								.filter(p -> p.getPlan().name().equalsIgnoreCase("monthly")).count();
						System.out.println("Number of customer who have monthly plan :- " + count);
						break;

					case 10:
						System.out.println("Customer who lives in akurdi :-\n");
						custMap.values().stream().filter(p -> p.getAddress().equalsIgnoreCase("Akurdi"))
								.forEach(System.out::println);
						break;

					case 11:
						System.out.println("Customer who have yearly subscription has got 20% discount :-\n");
						List<Customer> discList = custMap.values().stream()
								.filter(p -> p.getPlan().name().equalsIgnoreCase("yearly"))
								.peek(p -> p.setFinal_amount(p.getFinal_amount() - 0.2 * p.getFinal_amount()))
								.collect(Collectors.toList());
						for (Customer i : discList)
							System.out.println(i + "\n");
						break;

					case 12:

						storeInChar("MapToChar", custMap);

						break;

					case 13:
						System.out.println("Enter filename :- ");
						restoreFromChar(sc.next());
						sc.nextLine();
						break;

					case 14:

						storeInBinary("MapToBinary", custMap);

						break;

					case 15:
						System.out.println("Enter filename :- ");
						restoreFromBinary(sc.next());
						break;

					default:
						System.out.println("Enter valid choice!!!");
					}

				} catch (Exception e) {

					e.printStackTrace();
					sc.nextLine();
				}

			}

		}
	}

}
