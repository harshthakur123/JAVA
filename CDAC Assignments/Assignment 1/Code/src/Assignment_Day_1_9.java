import java.util.Scanner;
public class Assignment_Day_1_9 {
	public static void main(String[] args)
	{	Scanner sc;
		sc=new Scanner(System.in); 
		System.out.println("Enter a number of which you want factorial:");
		int num,fact=1;
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
}
