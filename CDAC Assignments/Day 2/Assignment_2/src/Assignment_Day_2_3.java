import java.util.Scanner;
public class Assignment_Day_2_3 {
	public static void main(String[] args) {
		int n;
		char ch,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		ch=sc.next().charAt(0);
		System.out.println("Enter upto which next caharacter you want to print:");
		n=sc.nextInt();
		System.out.print("Next "+n+"characters of "+ch+" is ");
		for(int i=1;i<=n;i++)
		{
			res=(char)(ch+i);
			System.out.print(res+" ");
		}
	}
}
