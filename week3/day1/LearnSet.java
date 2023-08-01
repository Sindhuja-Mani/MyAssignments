package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> mentors= new HashSet<String>();
		mentors.add("Raj");
		mentors.add("Kamal");
		mentors.add(" ");
		mentors.add("Arun");
		
		System.out.println(mentors);
		
		Set<String> mentorlink= new LinkedHashSet<String>(mentors);
		System.out.println(mentorlink);
		
		Set<String> mentortree= new LinkedHashSet<String>(mentors);
		System.out.println(mentortree);
	}

}
