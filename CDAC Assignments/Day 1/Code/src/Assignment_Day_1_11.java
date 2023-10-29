import java.util.Scanner;
public class Assignment_Day_1_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter a number upto which you want sum of natural number: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers upto"+num+" is "+sum);
	}
		
}
