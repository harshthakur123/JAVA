import java.util.Scanner;
public class Assignment_Day_1_8 {
	public static void main(String[] args) {
		int a1,a2,a3;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter 1st angle:");
		a1=sc.nextInt();
		System.out.println("Enter 2nd angle:");
		a2=sc.nextInt();
		System.out.println("Enter 3rd angle:");
		a3=sc.nextInt();
		if(a1+a2+a3==180)
		{
			System.out.println("Triangle is valid.");
		}
		else
		{
			System.out.println("Triangle is invalid");
		}
	}
	
}
