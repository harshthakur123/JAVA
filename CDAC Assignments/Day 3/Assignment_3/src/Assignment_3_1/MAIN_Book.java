package Assignment_3_1;

public class MAIN_Book {
	public static void main(String[] args) {
		
	System.out.println("---Paramaterized Constructor Gets Invoked---");
	Book b=new Book("Theory Of Everything",1001,"Stephen Hawkings",400.00);
	
	System.out.println("---Display Method Gets Invoked---");
	b.display();
	
	System.out.println("---Getter Get Invoked---");
	System.out.println(b.getBookName());
	System.out.println(b.getAuthor());
	System.out.println(b.getId());
	System.out.println(b.getPrice());
	
	
	System.out.println("---Setters Get Invoked---");
	b.setAuhtor("R.D.Sharma");
	b.setBookName("Mathematics");
	b.setPrice(700.00);
	b.setId(1065);
	
	b.display();
	}
}
