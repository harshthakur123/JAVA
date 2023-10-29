import java.util.Scanner;
public class Assignment_Day_1_14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum_even=0,sum_odd=0;
		System.out.println("Enter a number upto which you want sum of odd and even numbers:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				sum_even=sum_even+i;
			else
				sum_odd=sum_odd+i;
		}
		System.out.println("Sum of Odd numbers upto "+num+" is "+sum_odd);
		System.out.println("Sum of even numbers upto "+num+" is "+sum_even);
		
				
	}
}
