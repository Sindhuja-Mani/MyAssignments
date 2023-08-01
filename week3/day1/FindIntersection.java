package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> a1=new ArrayList<Integer>();
		List<Integer> b1=new ArrayList<Integer>();
	
		for(int i=0;i<a.length;i++)
		{
			
		a1.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
		b1.add(b[i]);
		}
	    for(int i=0;i<a1.size();i++)
	    {
	    	for(int j=0;j<b1.size();j++)
	    	{
		if(a1.get(i)==b1.get(j))
		{
			System.out.print(b1.get(j));
			
	}
	    	}
	    }}}


