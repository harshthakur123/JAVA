
public class FuncDemo {
	
	 void hello() {
		System.out.println("Hello");
	} 
	
	public void Showuser(String name) {
		System.out.println("Hello"+name);
	}
	
	public String GetInstituteName() {
		return "IACSD PUNE";
		
	}
	
	public boolean Age(int age) {
		if(age>18)
			return true;
		else
			return false;
			
	}
	
	
	public int increment(int n,int inc) {
		return n=n+inc;
	}
}
