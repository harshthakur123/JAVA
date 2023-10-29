import static java.lang.System.out;
public class Test_Classroom {
	public static void main(String [] args) {
		Integer a=new Integer(3);
		System.out.println(a.hashCode());
		
		int i=a;
//		System.out.println(a);
//		System.out.println(i);
//		System.out.println(a.hashCode());
		
		String s1="Harsh";
		String s2="HK";
		String s3="Harsh";
		
		System.out.println(s1+"\n"+s2+"\n"+s3);
		
		if(s1==s3)
			System.out.println("s1==s3");
		else
			System.out.println("s1!=s3");
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
		String str = "Java";
		
		String str1 = new String("Java").intern();
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		str="ok";
		System.out.println(str.hashCode());
		out.println(str);
		
		
	}
}
