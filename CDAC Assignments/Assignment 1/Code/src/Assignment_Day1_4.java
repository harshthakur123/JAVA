import java.util.Scanner;

public class Assignment_Day1_4 {
	public static void main(String[] args) {
		int num;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} 
		else {
			System.out.println(num+" is an odd number");
		}
	}

}
