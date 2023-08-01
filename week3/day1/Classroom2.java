package week3.day1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Classroom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str= "Sindhujaaaa";
		  char[] ch = Str.toCharArray();
		  
		  List<Character> values= new LinkedList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			values.add(ch[i]);
		}
		
		int frequency = Collections.frequency(values, 'o');
		System.out.println(frequency);
	}

}
