package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] word = text.split(" ");
		Set<String>unique=new LinkedHashSet<String>();
		Set<String>dup=new LinkedHashSet<String>();
		for(int i=0;i<word.length;i++)
		{
			if(!unique.add(word[i]))
				
			{
				dup.add(word[i]);
			}
			
			
		}
		
		for (String str : unique) {
			System.out.println(str);
		}
		
	}

}
