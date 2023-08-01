package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
	
	
	
		Set<Integer>unique=new LinkedHashSet<Integer>();
		Set<Integer>dup=new LinkedHashSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			if(!unique.add(data[i]))
				
			{
				dup.add(data[i]);
			}
			
			
		}
		

			System.out.println(dup);
		
		
	}
	}


