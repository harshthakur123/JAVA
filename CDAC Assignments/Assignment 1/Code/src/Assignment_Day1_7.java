import java.util.Scanner;
public class Assignment_Day1_7 {
	public static void main(String[] args) {
		char ch;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter a caharacter:");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println("Entered character is a vowel.");
		}
		else 
		{
			System.out.println("Entered character is consonant.");
		}
		
	}
}
