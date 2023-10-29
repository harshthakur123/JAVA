package Bank_Locker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Bank_Locker.Utils.populatebank;

public class Test_Bank_Account {

	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in)){
		int ch = 0;
		List<Bank> bank=populatebank();
		boolean exit = false;
		
		try {
		while (ch != 7){
			System.out.println("\n1.Show All Accounts\n2.Add New Account\n3.Edit Name\n4.Delete Account\n"
					+ "5.Apply For Locker\n6.Show All Locker Holder\n7.Exit ");

			System.out.print("\nEnter Choice :- ");
			ch = sc.nextInt();
			boolean status=false;
			switch (ch) {

			case 1:
				
				for (Bank b:bank) {
						System.out.println("\n"+b+"\n");
						status=true;
					}
				if (status == false)
					System.out.println("There is no bank account listed!!!");
				break;

			case 2:
				System.out.println("Enter Name,Balance");
				bank.add(new Bank(sc.next(),sc.nextDouble()));	
				System.out.println("Bank account added successfully!!!");
				
				break;

			case 3:
			
				
				System.out.print("Enter your accountid :- ");
				Bank b1=new Bank(sc.nextInt());
				if(bank.contains(b1)) {
					System.out.print("Enter new name :- ");

				
//  INTERNAL WORKING----
//					int i=bank.indexOf(b2);
//					Bank b_temp=bank.get(i);
//					b_temp.setName(sc.next());
				

					bank.get(bank.indexOf(b1)).setName(sc.next());
					System.out.println("Name Changed Successfully!!!");
				status = true;
					}
				
				if(status==false)
					throw new InvalidInputException("AccountId doesn't exist!!!");
				break;
				
				
			case 4:
				
				System.out.print("Enter the acountid you want to delete :- ");
				status=bank.remove(new Bank(sc.nextInt()));
				if(status)
					System.out.println("Bank account deleted successfully!!!");
				else
					throw new InvalidInputException("AccountId doesn't exist!!!");
				break;
				
				
				
			case 5:

				System.out.print("Enter your accountid :- ");
				Bank b2=new Bank(sc.nextInt());
				if(bank.contains(b2)) {
					System.out.print("Enter the duration :-");
					int index=bank.indexOf(b2);
					bank.get(index).assignLocker(sc.nextInt());
					status=true;
				}
				if(status==false)
					throw new InvalidInputException("AccountId doesn't exist!!!");
				break;
				
			case 6:
				
				
				
			case 7:
				exit=false;
				break;

			default:
				System.out.println("Enter valid choice");

			}

		} 
		
		}catch(Exception e) {
			System.out.println(e);}
		}
			
	
	}

}
