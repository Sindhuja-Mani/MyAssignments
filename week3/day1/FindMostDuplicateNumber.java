package week3.day1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str= "abbaba";
		  char[] ch = Str.toCharArray();
		  
		  List<Character> values= new LinkedList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			values.add(ch[i]);
		}
		
		int frequency = Collections.frequency(values, 'b');
		System.out.println(frequency);
	}

	

}
