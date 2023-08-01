package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Str= "Sinddujaaaa";
		char[] ch = Str.toCharArray();
		Set<Character>unique=new LinkedHashSet<Character>();
		Set<Character>dup=new LinkedHashSet<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(unique.add(ch[i]))
				
			{
				dup.add(ch[i]);
			}
			
		}
		
		for (Character character : unique)
		{
			System.out.print(character);	
		}

		

	}

	}


