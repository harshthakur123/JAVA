package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.core.Mess.Customer;
import com.core.Mess.MessPlan;

import Custom_Exception.InvalidInputException;

public interface MessUtils {

	static Map<Integer, Customer> populateMessDetails() throws InvalidInputException {

		Map<Integer, Customer> messMap = new HashMap<>();
		// Monthly(3000), Quarterly(11700), HalfYear(17500), Yearly(32000);
		/*
		 * int customerId, String firstname, String lastnam, String email, String
		 * password, String address, String phoneNumber, double final_amount, LocalDate
		 * registrationDate, LocalDate planEndDate, MessPlan plan
		 */

		messMap.put(101, new Customer(101, "harsh", "Thakur", "harsh1.dac@iacsd.com", "harsh123", "Pune", "2285456542",
				3000, LocalDate.parse("2023-11-08"), MessPlan.valueOf("MONTHLY")));

		messMap.put(102, new Customer(102, "Mayank", "Verma", "mayank1.dac@gmail.com", "mayank123", "Raipur",
				"9099876523", 11700.0, LocalDate.parse("2023-11-07"), MessPlan.valueOf("QUARTERLY")));

		messMap.put(103, new Customer(103, "Akash", "Verma", "akash1.dac@gmail.com", "akash123", "Akurdi", "9034876523",
				17500.0, LocalDate.parse("2024-01-23"), MessPlan.valueOf("HALFYEARLY")));

		messMap.put(104, new Customer(104, "suraj", "Parate", "suraj1.dac@gmail.com", "suraj123", "Mowa", "9099877623",
				32000.0, LocalDate.parse("2024-01-07"), MessPlan.valueOf("YEARLY")));

		messMap.put(105, new Customer(105, "mudit", "Sharma", "mudit1.dac@gmail.com", "mudit123", "Mumbai",
				"9034876523", 11700.0, LocalDate.parse("2023-06-17"), MessPlan.valueOf("QUARTERLY")));

		messMap.put(106, new Customer(106, "Tushar", "Dhruw", "mayank1.dac@gmail.com", "Tushar123", "Delhi",
				"9099876343", 3000.0, LocalDate.parse("2023-09-12"), MessPlan.valueOf("MONTHLY")));

		messMap.put(107, new Customer(107, "Tanu", "Sahu", "tanu1.dac@gmail.com", "tanu123", "Akurdi", "9029876523",
				17500.0, LocalDate.parse("2023-03-07"), MessPlan.valueOf("HALFYEARLY")));

		messMap.put(108, new Customer(108, "Rahul", "Verma", "rahul1.dac@gmail.com", "rahul123", "Mowa", "9099876453",
				3000.0, LocalDate.parse("2023-11-17"), MessPlan.valueOf("MONTHLY")));

		messMap.put(109, new Customer(109, "Rishi", "Tripathi", "rishi1.dac@gmail.com", "rishi123", "Pune",
				"9099876233", 32000.0, LocalDate.parse("2021-11-30"), MessPlan.valueOf("YEARLY")));

		messMap.put(110, new Customer(110, "Renu", "Mishra", "renu1.dac@gmail.com", "rishi123", "Rawet", "9099876231",
				3000.0, LocalDate.parse("2023-09-01"), MessPlan.valueOf("MONTHLY")));

		System.out.println("List populated!!!");

		return messMap;
	}

	public static void unsubscribeOutdatedSubscription(Map<Integer, Customer> custMap) {

		Iterator<Customer> itr = custMap.values().iterator();

	
			
			 while (itr.hasNext()) {
			        Customer customer = itr.next();
			        long duration = Period.between(customer.getRegistrationDate(), LocalDate.now()).toTotalMonths();
			        MessPlan plan = customer.getPlan();

			        if (plan == MessPlan.MONTHLY && duration > 1 ||
			            plan == MessPlan.QUARTERLY && duration > 3 ||
			            plan == MessPlan.HALFYEARLY && duration > 6 ||
			            plan == MessPlan.YEARLY && duration > 12) {
			            // Remove the customer if their subscription is outdated
			            itr.remove();
			            System.out.println("Customer unsubscribed: " + customer.getFirstname());
			        }
			
			
			
			
			}

		}

	public static void sortByFirstName(Map<Integer, Customer> custMap) {
		System.out.println("\nSorting as per Firstname :-\n");
		custMap.values().stream().sorted((p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname()))
				.forEach(System.out::println);
	}

	public static void sortByPlan(Map<Integer, Customer> custMap) {
		System.out.println("\nSorting as per plan :-\n");
		custMap.values().stream().sorted((p1, p2) -> p1.getPlan().name().compareTo(p2.getPlan().name()))
				.forEach(System.out::println);
	}

	public static void sortByRegDate(Map<Integer, Customer> custMap) {
		System.out.println("\nSorting as per Registration Date :- \n");
		custMap.values().stream().sorted((p1, p2) -> p1.getRegistrationDate().compareTo(p2.getRegistrationDate()))
				.forEach(System.out::println);
	}

}
