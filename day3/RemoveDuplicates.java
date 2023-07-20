package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";	
	//int count=0;
	String[] word = text.split(" ");
	//String value=" ";
	for(int i=0;i<word.length;i++)
	{
	for(int j=i+1;j<word.length;j++)
	{
	if(word[i].equals(word[j]))
		(word[j])="";
		//count=count+1;
	}
	}
	for(int i=0;i<word.length;i++)
	{
		System.out.print(word[i]+" ");

	
	}
	}
	}
	
	


