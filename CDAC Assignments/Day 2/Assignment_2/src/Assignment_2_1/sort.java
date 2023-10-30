package Assignment_2_1;

public class sort {
	public static void main(String [] args) {

		int [] arr=  {24,231,21,24,54};
		
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

	}
}
