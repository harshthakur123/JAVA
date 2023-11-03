package Assignment_3_1;

public class Complex {

	private int real;
	private int imaginary;
	
	// Default Constructor
	Complex()
	{
		real=5;
		imaginary=10;
	}
	
	//Paramaterized Constructor
	Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	// Dsiplay Function
	public void display()
	{
		System.out.println("Complex Number, z = "+real+"+"+imaginary+"i");
	}
	
	//Getters
	public int getReal()
	{
		return real;
	}
	public int getImaginary()
	{
		return imaginary;
	}
	
	//Setters
	public void setReal(int real)
	{
		this.real=real;
		System.out.println("Real = "+real);
	}
	public void setImaginary(int imaginary)
	{
		this.imaginary=imaginary;
		System.out.println("Imaginary = "+imaginary);
	}
	
	
}
