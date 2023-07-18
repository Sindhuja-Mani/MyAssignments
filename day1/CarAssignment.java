package week1.day1;

public class CarAssignment {
	
	public void driveCar() {
		System.out.println("Drive car");
		
	}
	public void applyBrake() 
	{
		System.out.println("Apply brake when needed");
	}
	
	public void soundHorn() 
	{
	System.out.println("Don't use Horn unnecessarily ");	
	}
	
	public boolean isPuncture()
	{
	System.out.println("Check whether car is puncture or not ");
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarAssignment car=new CarAssignment();
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		boolean puncture = car.isPuncture();
		System.out.println("Car tyre is not "+ puncture + " " );
	}

	
}
