package com.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

public class Subscription {

	public static void getNameOfUnpaidSubscriptionFrom3Months(List<Customer> customer) {
		boolean status = false;
		for (Customer c : customer) {
			long Duration = Period.between(c.getSubscription_date(), LocalDate.now()).toTotalMonths();
			if (Duration > 3)
				System.out.println(c.getFirstName() + " " + c.getLastName() + "\n");
			status = true;
		}
		if(!status)
			System.out.println("There are no customers who have not paid subscription from 3 months.");
	}

	public static void removeCustomersWhoHaveNotPaidSubscriptionFrom6Months(List<Customer> customer) {
		boolean status = false;
		Iterator<Customer> itr = customer.iterator();
		while (itr.hasNext()) {
			long Duration = Period.between(itr.next().getSubscription_date(), LocalDate.now()).toTotalMonths();
			if (Duration > 6)
				itr.remove();
			status = true;
		}
		
		if(!status)
			System.out.println("There are no customers who have not paid subscription from 3 months.");
	}

}
