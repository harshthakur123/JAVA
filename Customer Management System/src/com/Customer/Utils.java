package com.Customer;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {

	
	
		public static List<Customer> populateCustomer() {
			List<Customer> c = new ArrayList<>();
			
			c.add(new Customer("Harsh", "Thakur", "harsh.thakur@gmail.com", "harsh123", 
					ServicePlan.GOLD, 2000, LocalDate.parse("2020-12-12"),LocalDate.parse("2023-09-23")));

			c.add(new Customer("Riya", "Pathak", "riya@gmail.com", "riy#123",ServicePlan.DIAMOND,
					5000, LocalDate.parse("1996-12-31"),LocalDate.parse("2023-01-12")));

			c.add(new Customer("Mihir", "Mujumdar", "mihir@gmail.com", "mih#123",
					ServicePlan.GOLD,2000, LocalDate.parse("1994-09-21"),LocalDate.parse("2022-12-23")));
			
			c.add(new Customer("Rakesh", "Malik", "rakesh@gmail.com", "rak#123", 
					ServicePlan.GOLD,2000, LocalDate.parse("1994-09-21"),LocalDate.parse("2023-02-12")));
	
			c.add(new Customer("Kiran", "Khare", "kiran@gmail.com", "kiran#123",
					ServicePlan.SILVER, 1000, LocalDate.parse("1994-09-21"),LocalDate.parse("2022-10-22")));
			
			return c;
		}
		
		
		
		
		
}
