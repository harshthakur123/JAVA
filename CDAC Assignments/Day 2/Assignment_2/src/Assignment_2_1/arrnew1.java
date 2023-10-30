package Assignment_2_1;

import java.util.Arrays;
import java.util.Scanner;

public class arrnew1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int ch, ind = 0, val = 0, index = 0;
		
		do {
			System.out
					.println("\n1.Show Array  2.Add Element  3.Search Element  4.Double Array Element  5.Sort  6.Exit");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:

			{
				for (int i : arr) {
					if (i != 0)
						System.out.print(i + " ");
				}
				System.out.println("\n");
				break;
			}

			case 2:
				System.out.println("Enter Numbers:");
				if (index < arr.length) {
					arr[index] = sc.nextInt();
					// System.out.println(index+" "+arr[index]);
					index++;
				} else
					System.out.println("Array is full!!!");
				break;

			case 3:
				{System.out.println("Enter an element you want to search: ");
				boolean status = false;
				int ele = sc.nextInt();
				for (int i = 0; i < arr.length; i++) {
					if (ele == arr[i] ) {
						status = true;
						ind = i;
						val = arr[i];
						break;
					}
				}
				if (status == true)
					System.out.println("Entered element found at index = " + ind + "\nElement = " + val);
				if(status==false)
					System.out.println(ele+" not found!!!");
				//val=sc.nextInt();
				//System.out.println(val+" found at index no. "+Arrays.binarySearch(arr, val));
				break;}

			case 4:
				int [] temp = new int[5];
				System.out.println("\nArray before double:");
				for (int i : arr)
					System.out.print(i + "  ");
		
				
				System.out.println("\nArray after double:");
				for (int i = 0; i < arr.length; i++) {
					temp[i]=arr[i] * 2;
					System.out.print(temp[i] + " ");
				}

				break;

			case 5:				
//				Arrays.sort(arr);
//				System.out.println("Sorted Array : "+Arrays.toString(arr));
			//	for(int i=)
				for(int i=0;i<arr.length-1;i++)
				{
					for(int j=0;j<arr.length-i-1;j++)
					{
						if(arr[j]>arr[j+1])
						{
							int temp1=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp1;
						}
					}
				}
				System.out.print("Sorted Array : ");
				for(int i:arr)
					System.out.print(i+" ");
	
				break;

			case 6:
				System.out.println("Exiting...");
				System.exit(1);

			default:
				System.out.println("Enter a valid choice!!!");

			}
		} while (ch != 6);
	}
}
