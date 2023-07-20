package week1.day3;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		int arrlength=arr.length;
	
		for(int i=0;i<arrlength-1;i++)
		{
	
			{
				for (int j=i+1;j<arrlength;j++)
				{
				if(arr[i]==arr[j])
				{
					System.out.println("The Given number"+arr[i]+" is duplicate");
				}
				}
			}
		}
	}

}
