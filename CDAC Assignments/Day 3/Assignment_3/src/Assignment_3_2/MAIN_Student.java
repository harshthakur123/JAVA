package Assignment_3_2;
import java.util.Scanner;
public class MAIN_Student {

	public static void main(String[] args)
	{
		Student s1=new Student();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Details:-");
		System.out.println("Roll Number,Name,Total Marks out of 500,Grade");
		s1.assignStud(sc.nextInt(), sc.next(), sc.nextDouble(),sc.next().charAt(0));
		
		System.out.println("\nStudent Details:-");
		s1.printStud();
		
		
	}
}
