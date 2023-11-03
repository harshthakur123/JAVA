package Assignment_3_1;

public class Bank {

	private int account_no,mobile_no;
	private String name,email;
	private double balance=10000;
	
	Bank(int account_no,String name,String email)
	{
		System.out.println("---Paramatertized Constructor gets invoked---");
		this.account_no=account_no;
		this.name=name;
		this.email=email;
	}
	
	public String toString()
	{
		return "\nAccount_no - "+account_no+"\nName - "+name+"\nEmail Id - "+email+"\nBalance - "+balance;
	}
	
	public void withdraw(double amount)
	{	
		System.out.println("---Debited Successfully---");
		this.balance=balance-amount;
	}
	
	public void deposit(double amount)
	{
		System.out.println("---Credited Successfully---");
		this.balance=balance+amount;
	}
	
	public void moneyTransfer(double amount)
	{
		System.out.println("--Money Transferred Successfully---");
		this.balance=balance-amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	
}
