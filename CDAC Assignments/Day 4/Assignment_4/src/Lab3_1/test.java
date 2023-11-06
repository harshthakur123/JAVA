package Lab3_1;

import Practice.Specifier_Test;

public class test {

	public static void main(String[] args) {
	tank t1=new tank();
	System.out.println("t1 ="+t1.hashCode());
	tank t2=new tank();
	System.out.println("t2 = "+t2.hashCode());
	tank t3=new tank();
	System.out.println(t3.getClass());
	t1=t2;
	
	System.out.println(t1.equals(t2));
	System.out.println(t2.toString());
	System.out.println("t1 = "+t1.hashCode());

	}

}
