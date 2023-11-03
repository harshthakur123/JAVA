package Assignment3_3;

public class Bank {

	private int acc_no;
	private String cust_name;
	private double bal;
	
	public Bank(int acc_no, String cust_name, double bal) {
		System.out.println("------Constructor Calling-----");
		this.acc_no = acc_no;
		this.cust_name = cust_name;
		this.bal = bal;
	}
	
	
	public void withdraw(double amount) {
		System.out.println("\n----Withdraw Method----");
		bal=bal-amount;
		System.out.println("Debited Successfully!!!");
	}
	
	public void deposit(double amount) {
		System.out.println("\n-----Deposit Method----");
		bal=bal+amount;
		System.out.println("Credited Successfully!!!");
	}
	
	public String toString() {
		System.out.println("\n----Account Details----\n");
		return "\nAccount Number :- "+acc_no+"\nCustomer Name:- "+cust_name+"\nBalance:- "+bal;
	}
}
