package Assignment_3_1;

public class Date {

	private int dd,mm,yy;
	
	Date()
	{
		dd=06;
		mm=03;
		yy=2001;
	}
	
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	public void display()
	{
		System.out.println("Date :- "+dd+"/"+mm+"/"+yy);
	}
	
	
	
	public int getDate()
	{
		return dd;
	}
	public int getMonth()
	{
		return mm;
	}
	public int getYear()
	{
		return yy;
	}
	
	
	public void setDate(int dd)
	{
		this.dd=dd;
	}
	public void setMonth(int mm)
	{
		this.mm=mm;
	}
	public void setYear(int yy)
	{
		this.yy=yy;
	}
	


}
