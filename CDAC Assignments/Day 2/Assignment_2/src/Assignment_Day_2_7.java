import java.util.Scanner;

public class Assignment_Day_2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Area of Triangle\n4.Exit");
			System.out.println("Enter your choice:");
			if (sc.hasNextInt()) {
				ch = sc.nextInt();
			} 
			else {
				System.out.println("Enter an integer value!!!");
			}
			
			switch (ch) {
				case 1:
					Area.circle();
					break;
				case 2:
					Area.rectangle();
					break;
				case 3:
					Area.triangle();
					break;
				case 4:
					System.out.println("Program Terminated Successfully!!!");
					System.exit(0);
					
			}

		} while (ch != 4);
	}
}
