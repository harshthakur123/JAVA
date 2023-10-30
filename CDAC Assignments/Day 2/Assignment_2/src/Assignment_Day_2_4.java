import java.util.Scanner;
public class Assignment_Day_2_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1,num = 0;
		System.out.println("Enter a number of which you want factorial:");
		if(sc.hasNextInt())
		{
			num=sc.nextInt();
		}
		else
			System.out.println("Enter an integer value!!!");
		for(int i=1;i<=num;i++)
			fact=fact*i;
		System.out.println("Factorial of "+num+" is "+fact);
	}
	

}
