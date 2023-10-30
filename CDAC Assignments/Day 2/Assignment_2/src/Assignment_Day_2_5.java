import java.util.Scanner;
public class Assignment_Day_2_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number of which you want factors:");
		if(sc.hasNextInt())
			num=sc.nextInt();
		else
			{
				System.out.println("Enter an integer value!!!");
				System.exit(0);
			}
		System.out.print("Factors of "+num+" are ");	
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}
	
}
