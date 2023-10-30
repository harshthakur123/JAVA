package Math;

public class Math_Operations {

	public static void add(int n1, int n2) {
		System.out.println("Sum = " + (n1 + n2));
	}

	public static void add(int n1, int n2, int n3) {
		System.out.println("Sum = " + (n1 + n2 + n3));
	}

	public static void add(double n1, double n2) {
		System.out.println("Sum = " + (n1 + n2));
	}

	public static void add(double n1, double n2, double n3) {
		System.out.println("Sum = " + (n1 + n2 + n3));
	}

	public static void add(int... a) {
		System.out.println("Accepting Numbers:" + a.length);
		int total = 0;
		for (int no : a) {
			total = total + no;
			
		}
		System.out.println("Sum of " + a.length + " element is " + total);

	}

}
