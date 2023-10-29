import java.util.Scanner;

public class Assignment_Day_1_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,num,res=0,ch;
		System.out.println("Enetr a number:");
		num = sc.nextInt();
		temp=num;
		while(num!=0) {		
			ch=num%10;
			res=res*10+ch;
			num=num/10;
		}
		System.out.println("Before Swapping = "+temp);
		System.out.println("After Swappping = "+res);
	}
}
