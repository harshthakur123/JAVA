import java.util.Scanner;

public class Assignment_Day_1_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, n, count;
		System.out.println("Enter the range:");
		if (sc.hasNextInt()) {
			num = sc.nextInt();
		} 
		else {
			System.out.println("Enter an integer value.");
		}
		
		for(int j=2;j<=num;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(j+" ");
			}
		}
	}

}
