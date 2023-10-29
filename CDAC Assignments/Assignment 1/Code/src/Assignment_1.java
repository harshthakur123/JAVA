import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {

		int no1, no2;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		no1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		no2=sc.nextInt();
		System.out.println("Before Swapping:\nNumber 1 = "+no1+" Number 2 = "+no2);
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("After Swapping:\nNumber 1 = "+no1+", Number 2 = "+no2);
	}
}
