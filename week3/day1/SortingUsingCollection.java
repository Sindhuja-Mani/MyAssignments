package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> company=new HashSet<String>();
		company.add("Google");
		company.add("Microsoft");
		company.add("TestLeaf");
		company.add("Maverick");
		int x=company.size();
		//Collections.sort(company);
		
		List<String> sortcompany =new ArrayList<String>(company);
		Collections.sort(sortcompany);
		System.out.println(sortcompany);
		Collections.reverse(sortcompany);
		System.out.println(sortcompany);
	}
	
	

}
