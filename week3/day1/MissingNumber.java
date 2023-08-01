package week3.day1;

import java.util.HashSet;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr, int n) 
	{
		HashSet<Integer> hashSet = new HashSet<Integer>();
		      // Add all elements of array to hashset
		    for (int i = 0; i < n-1; i++) {
		        hashSet.add(arr[i]);
		    }
		 
		    // Check each integer from 1 to n
		    for (int i = 1; i <= n; i++) {
		        // If integer is not in hashset, it is the missing integer
		        if (!hashSet.contains(i))
		        {
		            return i;
		        }
		    }
		 
		    // If no integer is missing, return n+1
		    return n+1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,6,7,8,9};
		int n=array.length;
		int missingNumber = findMissingNumber(array, n);
		System.out.println("Missing number is: " + missingNumber);

	}

}
