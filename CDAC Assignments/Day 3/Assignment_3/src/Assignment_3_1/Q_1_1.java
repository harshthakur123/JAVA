package Assignment_3_1;

import java.math.*;
public class Q_1_1 {
	private int roll_no;
	private double mark1,mark2,mark3,total,percentage;
		
	public void AcceptDetails(int roll_no,double mark1,double mark2,double mark3)
	{	
		this.roll_no=roll_no;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	
	public void display()
	{
		System.out.println("Roll No.-"+roll_no);
		System.out.println("Mark1-"+mark1);
		System.out.println("Mark2-"+mark2);
		System.out.println("Mark3-"+mark3);
		System.out.println("Total-"+(mark1+mark2+mark3));
		percentage=((mark1+mark2+mark3)/300)*100;
		String p=String.format("%.2f", percentage);
		System.out.println("Percentage-"+p);
	}
}
