package Assignment3_3;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Bank b1=new Bank(1234,"Harsh",10000.00);
		
		System.out.println(b1);
		b1.withdraw(4500);
		System.out.println(b1);
		b1.deposit(4566);
		System.out.println(b1);
		
	}
}
