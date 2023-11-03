package Assignment_3_1;

import java.util.Scanner;

public class Main_Bank {
	public static void main(String[] args) {
		Bank b = null;
		int ch = 0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\n1.Enter Details  2.Withdraw Money  3.Deposit Money  4.Money Transfer  5.Display Details 6.Exit");
			System.out.print("\nEnter your choice-");
			if(sc.hasNextInt())
				ch=sc.nextInt();
			else
				System.out.println("Enter valid choice!!!");
			
			switch(ch) {
			
			case 1:{
			System.out.println("\nEnter Account No,Name,Email,Balance");
			b=new Bank(sc.nextInt(),sc.next(),sc.next());
			break;
			}
			
			case 2:{
				System.out.print("\nEnter the amount you want to withdraw : ");
				b.withdraw(sc.nextDouble());
				break;
			}
			
			case 3:{
				System.out.print("\nEnter the amount you want to deposit : ");
				b.deposit(sc.nextDouble());
				break;}
			
			case 4:{
				System.out.print("\nEnter the amount you want to transfer : ");
				b.moneyTransfer(sc.nextDouble());
				break;
			}
			case 5:{
				System.out.println(b);
				break;
			}
			
			case 6:
			{	
				System.out.println("---Programm Terminated Successfully---");
				break;
			}
			
		
			
		}
		
	}while(ch!=6);

}
}
