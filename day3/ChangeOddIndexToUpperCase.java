package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] cha=test.toCharArray();
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0)
			{
			cha[i]=Character.toUpperCase(cha[i]);
			System.out.println(cha[i]);
			}
			
			else
			{
				System.out.println(cha[i]);	
			}
		}
	}
}
