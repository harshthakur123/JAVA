import java.util.Scanner;

public class Assignment_Day_2_2 {
	public static void main(String[] args) {
		int x,n,res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base:");
		x=sc.nextInt();
		System.out.println("Enter power:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			res=res*x;
		System.out.println(x+" to the power "+n+" is "+res);
	}
}
