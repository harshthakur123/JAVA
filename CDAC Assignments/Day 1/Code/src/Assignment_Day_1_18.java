import java.util.Scanner;

public class Assignment_Day_1_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter 1st number:");
		n1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		n2=sc.nextInt();
		System.out.println("Enter 3rd number:");
		n3=sc.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println(n1+" is the greatest.");
		else if(n2>n1 && n2>n3)
			System.out.println(n2+" is the greatest.");
		else
			System.out.println(n3+" is the greatest.");
	}
}
