package week1.day2;

public class Mobile {
	
	public void sendSms()
	{
		System.out.println("From Oppo");
	}
	
	public long makeCall(long phno)
	{
		return phno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile MethodCall=new Mobile();
		MethodCall.sendSms();
		long makeCall=MethodCall.makeCall(66767676767l);
		System.out.println(makeCall);
	}

}
