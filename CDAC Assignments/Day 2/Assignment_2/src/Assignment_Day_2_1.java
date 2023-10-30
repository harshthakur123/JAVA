import java.util.Scanner;
public class Assignment_Day_2_1 {
	public static void main(String[] args) {
		int num = 0,sum=0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{	System.out.println("Enter numbers:");
			if(sc.hasNextInt())
				num=sc.nextInt();
			else
				{System.out.println("Enter integer value!!!");
					System.exit(0);
				}
			if(num>0)
				sum=sum+num;
			else
				break;
		}
		System.out.println("Sum = "+sum);
	}
}
