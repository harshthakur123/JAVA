package Assignment_3_1;
import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {
		
		int roll_no;
		double mark1,mark2,mark3;
		Scanner sc=new Scanner(System.in);
		
		Q_1_1 obj=new Q_1_1();
		System.out.println("Enter Student Details:");
		System.out.println("Enter Roll No.-");
		roll_no=sc.nextInt();
		System.out.println("mark1-");
		mark1=sc.nextInt();
		System.out.println("mark2-");
		mark2=sc.nextInt();
		System.out.println("mark3-");
		mark3=sc.nextInt();
		obj.AcceptDetails(roll_no, mark1, mark2, mark3);
		obj.display();
		
	}
}
