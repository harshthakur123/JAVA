package Assignment_3_2;

public class Date {

	private int day, month, year;
	
	
     
	public void setDay(int day) {
		this.day = day;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public void display() {
		System.out.println("\nDate :"+day+"/"+month+"/"+year);
	}

}
