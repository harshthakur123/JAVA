package Assignment_3_1;

public class MAIN_Data {
	public static void main(String[] args)
	{
		
		System.out.println("---Paramaterized Constructor Invoked---");
		Date d=new Date(10,12,2023);
		
		System.out.println("---Display Method Invoked---");
		d.display();
		
		System.out.println("---Getters Invoked---");
		System.out.println(d.getDate());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		
		System.out.println("---Setters Invoked---");
		d.setDate(23);
		d.setMonth(03);
		d.setYear(2009);
		
		d.display();
	}
}
