import java.util.Scanner;
import java.lang.Math; 

public class Assignment_Day_1_17 {
	public static void main(String[] args) {

		int num = 0,original_number,digits=0,last,ch,sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		if(sc.hasNextInt())
		{
			num =sc.nextInt();
		}
		else
			{
			System.out.println("Enter an integer value");
				System.exit(0);
			}
		original_number=num;
		
		//count number of digits
		while(num!=0)
		{
			
			num=num/10;
			digits++;
			
		}	
		//System.out.println(digits);
		num=original_number;
		while(num!=0)
		{	
			
			ch=num%10;
			sum=sum+(int)(Math.pow(ch,digits));
			num=num/10;
			
			
			
		}
		if(sum==original_number)
			System.out.println(sum+" is Armstrong Number.");
		else
			System.out.println("Res = "+sum+"\n"+sum+" is not an Armstrong Number");
	}
}
