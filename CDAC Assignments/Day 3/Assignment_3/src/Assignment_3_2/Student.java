package Assignment_3_2;

public class Student {

	private int roll_no;
	private String name;
	private double total_Marks;
	private char grade;
	
	public void assignStud(int roll_no,String name,double total_Marks,char grade)
	{	
		System.out.println("---assignStud Method Invoked---");
	
		this.grade=grade;
		this.name=name;
		this.roll_no=roll_no;
		this.total_Marks=total_Marks;
		//System.out.println("as"+total_Marks);
	}
	
	public void printStud()
	{	System.out.println("\n---Invoking printStud Method---");
		System.out.println("\nStudent Details:-");
		System.out.println("\nName :- "+name+"\nRoll Number :- "+roll_no+"\nTotal Marks :- "+total_Marks+"\nGrade = "+grade);
	}

}

