import java.util.Scanner;
public class Prac {
	public static void main(String[] args) {
		String s,g;
		int i,sum=0;
		//boolean a;
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name");
//		s=sc.next();
//		FuncDemo f=new FuncDemo();
//		f.hello();
//
//		g=f.GetInstituteName();
//		System.out.println(g);
//		
//		a=f.Age(19);
//		if(a==true)
//			System.out.println("Adult");
//		else
//			System.out.println("Not adult");
//		
//		f.Showuser("Harsh");
//
//		i=f.increment(5,4);
//		System.out.println(i);
		
//		int[] arrint; // declaration
//		arrint=new int[5]; // initialization
//		
		int[] arrint=new int[5]; //declaration+initialization
		arrint[0]=10;
		arrint[1]=20;
		arrint[2]=30;
		arrint[3]=40;
		arrint[4]=50;
		System.out.println("Length:"+arrint.length);
//		for(i=0;i<arrint.length;i++)
//		{
//			System.out.print(arrint[i]+" ");
//			
//		}
			
		for (int j:arrint)
		{	
			System.out.print(j+" ");
			sum=sum+j;
			
			
		}
		System.out.println("\nSum:"+sum);
		
	
	
	}
	
	

}
