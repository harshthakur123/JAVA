import java.util.Scanner;

public class Assignment_Day1_10 {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);

		int base, power,res=1;
		System.out.println("Enter base:");
		base = sc.nextInt();
		System.out.println("Enter power");
		power = sc.nextInt();
		
		for(int i=1;i<=power;i++)
		{
			res=base*res;
			
		}
		System.out.println(base+" to the power "+power+" is "+res);
	}
}
