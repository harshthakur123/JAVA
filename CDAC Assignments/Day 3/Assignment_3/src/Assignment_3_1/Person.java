package Assignment_3_1;

public class Person {

	private String name,city;
	private int age;
	
	Person()
	{
		age=22;
		city="Raipur";
		name="Harsh";
	}
	
	Person(String name,String city,int age)
	{
		this.age=age;
		this.city=city;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void display()
	{
		System.out.println("Name-"+name);
		System.out.println("Age-"+age);
		System.out.println("City-"+city);
	}
	
	
}
