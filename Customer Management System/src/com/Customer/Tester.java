package com.Customer;

import static com.Customer.ValidationsRules.*;
import static com.Customer.Utils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.Customer.Subscription.*;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int choice = 0;
			List<Customer> customer = populateCustomer();

			do {
				System.out.println("1. Sign Up\n" + "2. Sign in (login)\n" + "3. Change password\r\n"
						+ "4. Unsubscribe customer\r\n" + "5. Display all customers.\r\n"
						+ "6. Sort data as per the Email\r\n" + "7. Sort Data by Date Of Birth"
						+ "\n8. Sort by Date of Birth and LastName"
						+ "\n9. Display Name of customers who have not paid subscription from 3 months "
						+ "\n10. Remove customers who have not paid subscription from 6 months "
						+ "\n0. Exit \n\nEnter Choice:-");

				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:

						System.out.println("Enter FirstName,LastName,Email,Password,Plan,"
								+ "Registration Amount,DOB,Subcription Date");
						System.out.println("Subscription Plan : SILVER(1000),GOLD(2000),DIAMOND(3000),PLATINUM(4000)");
						Customer cust = valiDateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next().toUpperCase(), sc.nextDouble(), sc.next(), sc.next(), customer);
						customer.add(cust);
						System.out.println("Customer Added Successfully!!!");
						break;

					case 2:
						System.out.print("Enter EmailId and password :- ");
						Customer c = authentication(sc.next(), sc.next(), customer);
						System.out.println("Authentication Successful!!!\n" + c);
						break;

					case 3:
						System.out.print("Enter EmailId and password :- ");
						c = authentication(sc.next(), sc.next(), customer);

						System.out.println("Enter new password :- ");
						c.setPassword(sc.next());
						System.out.println("Password changed successfully!!! ");
						break;

					case 4:
						System.out.print("Enter EmailId and password :- ");
						c = authentication(sc.next(), sc.next(), customer);
						customer.remove(c);
						System.out.println("Customer account deleted successfully!!!\n");
						break;

					case 5:
						for (int i = 0; i < customer.size(); i++) {
							System.out.println("Customer " + (i + 1) + "\n" + customer.get(i));
						}
						break;

					case 6:
						Collections.sort(customer);
						System.out.println("Customer list get sorted as per the emailId.");
						break;

					case 7:
						Collections.sort(customer);
						System.out.println("Customer list get sorted as per the Date Of Birth.");
						break;

					case 8:
						Collections.sort(customer, new Comparator<Customer>() {
							@Override
							public int compare(Customer c1, Customer c2) {
								int res = c1.getDob().compareTo(c2.getDob());
								if (res == 0)
									return c1.getLastName().compareTo(c2.getLastName());

								System.out.println("Customer list get sorted as per the Date Of Birth and Lastname.");
								return res;
							}

						});
						break;
						
					case 9 :
						
						System.out.println("Customer who have not paid the susbcription amount :-\n" ); 
						getNameOfUnpaidSubscriptionFrom3Months(customer);
						break;

					case 10 :
						removeCustomersWhoHaveNotPaidSubscriptionFrom6Months(customer);
						break ;
						
					case 0:
						System.out.println("Exiting...");

						break;
					default:
						System.out.println("Enter valid choice...");

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} while (choice != 0);

		}
	}
}
