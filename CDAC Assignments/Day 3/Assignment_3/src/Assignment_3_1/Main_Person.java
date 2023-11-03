package Assignment_3_1;

public class Main_Person {
	public static void main(String [] args)
	{	
		System.out.println("---Constructor Invoked---");
		Person p=new Person("Mayank","Raipur",22);
		
		System.out.println("---Display Fucntion Invoked---");
		p.display();
		
		System.out.println("---Getters Invoked---");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getCity());
		
		System.out.println("---Setters Invoked---");
		p.setName("Akash");
		p.setAge(24);
		p.setCity("Pune");
		
		p.display();
		
		
		
	}
}
