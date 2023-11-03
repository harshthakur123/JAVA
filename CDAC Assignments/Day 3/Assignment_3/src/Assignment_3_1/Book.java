package Assignment_3_1;

public class Book {

	private String bname,author;
	private int id;
	private double price;
	
	Book()
	{
		bname="Harry Potter";
		id=1001;
		author="J.K.Rowling";
		price=800.0;
	}
	
	
	Book(String bname,int id,String author,double price)
	{
		this.author=author;
		this.bname=bname;
		this.id=id;
		this.price=price;
	}
	
	
	
	public void display()
	{
		System.out.println("Name:-"+bname);
		System.out.println("Id:-"+id);
		System.out.println("Author:-"+author);		
		System.out.println("Price:-"+price);

	}
	
	
	
	public String getBookName()
	{
		return bname;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public int getId()
	{
		return id;
	}
	
	
	
	
	public void setBookName(String bname)
	{
		this.bname=bname;
	}
	public void setAuhtor(String author)
	{
		this.author=author;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
