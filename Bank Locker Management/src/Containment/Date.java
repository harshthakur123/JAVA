package Containment;

public class Date {

	public static String doj;
	private int day,month,year;
	
	Date(int day,int month,int year){
		System.out.println("-------Paramaterized constructor of Date-----------");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	Date(){
		System.out.println("------Default Constructor of Date-----");
		day=06;
		month=03;
		year=2001;
		
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
