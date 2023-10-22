package Q_2;

public class Vehicle_Showroom {

	private int id;
	private String name, colour;
	private double price;
	public static int discount;
//	public static int discount=price*0.1;

	
	
	Vehicle_Showroom(int id, String name, String colour, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	
	public Vehicle_Showroom() {
	super();
}

	static {
		discount=1000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
	public String toString()
	{
		return "\nVehicle Id : "+id+"\nName : "+name+"\nColour : "+colour+"\nPrice : "+price;
	}
	
	
	

}
