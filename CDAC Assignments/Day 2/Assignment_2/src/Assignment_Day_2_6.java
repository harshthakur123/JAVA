import java.util.Scanner;
public class Assignment_Day_2_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=0,GCD=1;
		System.out.println("Enter first number:");
		if(sc.hasNextInt())
		{
			n1=sc.nextInt();
		}
		else
		{
			System.out.println("Enter inter value!!!");
		}
		
		System.out.println("Enter second number:");
		if(sc.hasNextInt())
		{
			n2=sc.nextInt();
		}
		else
		{
			System.out.println("Enter inter value!!!");
		}
		for(int i=1;i<=(n1>n2?n1:n2)/2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				if(i>GCD)
					GCD=i;
			}
				
		}
		System.out.println("GCD of "+n1+" and "+n2+" is "+GCD);
	}

}
