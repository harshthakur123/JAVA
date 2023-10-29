import java.util.Scanner;
public class Assignment_Day_1_13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,temp,ch,res=0;
		System.out.println("Enter a num:");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			ch=num%10;
			res=res*10+ch;
			num=num/10;
		}
		System.out.println("Given Number = "+temp+"\nSwapped Number = "+res);
		if(temp==res)
			System.out.println(temp+" is pallindrome number.");
		else
			System.out.println(temp+" is not a pallindrome number.");
		
	}
	
}
