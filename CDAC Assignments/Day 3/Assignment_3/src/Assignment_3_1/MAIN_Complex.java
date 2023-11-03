package Assignment_3_1;

public class MAIN_Complex {
	public static void main(String[] args)
	{
		System.out.println("---Paramaterized Constructor Gets Invoked---");
		Complex c=new Complex(10,20);
		
		System.out.println("---Display Function Gets Invoked---");
		c.display();
		
		System.out.println("---Getters Gets Invoked---");
		System.out.println("Real = "+c.getReal());
		System.out.println("Imaginary = "+c.getImaginary());
		
		System.out.println("---Setters Gets Invoked---");
		c.setReal(50);
		c.setImaginary(100);
		
		c.display();
	}
	
}
