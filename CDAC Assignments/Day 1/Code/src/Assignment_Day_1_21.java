import java.util.Scanner;
public class Assignment_Day_1_21 {
	public static void main(String [] args)
	{	int ch,n1,n2;
		Scanner sc=new Scanner(System.in);
		
		do
		{	
			System.out.println("1. Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
			System.out.println("Enter a choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter 1st number:");
				n1=sc.nextInt();
				System.out.println("Enter 2nd number:");
				n2=sc.nextInt();
				System.out.println(n1+" + "+n2+" = "+(n1+n2));
				break;
				
				case 2:
				
				System.out.println("Enter 1st number:");
				n1=sc.nextInt();
				System.out.println("Enter 2nd number:");
				n2=sc.nextInt();
				System.out.println(n1+" - "+n2+" = "+(n1-n2));
				break;
				
				case 3:
					
					System.out.println("Enter 1st number:");
					n1=sc.nextInt();
					System.out.println("Enter 2nd number:");
					n2=sc.nextInt();
					System.out.println(n1+" * "+n2+" = "+n1*n2);
					break;
				
				case 4:
					
					System.out.println("Enter 1st number:");
					n1=sc.nextInt();
					System.out.println("Enter 2nd number:");
					n2=sc.nextInt();
					if(n2!=0)
					{
						System.out.println(n1+" / "+n2+" = "+n1/n2);
						break;
					}
					else
						System.out.println("Enter a non-zero denominator.");
						continue;
				case 5:
					System.out.println("-------Program terminated---------");
					break ;
				
				default:
						System.out.println("Enter a valid choice");
			
			}
		}while(ch!=5);
	}

}
