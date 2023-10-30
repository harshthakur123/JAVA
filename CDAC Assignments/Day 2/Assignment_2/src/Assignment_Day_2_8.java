import java.util.Scanner;
public class Assignment_Day_2_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0,count;
		System.out.println("Enter th range:");
		if(sc.hasNext())
		{
			num=sc.nextInt();
		}
		else
		{
			System.out.println("Enter an integer value!!!");
			System.exit(0);
		}
		for(int i=2;i<=num;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		
		
	}
	

}
