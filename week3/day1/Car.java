package week3.day1;

public class Car extends Vehicle{
	
	
	public void switchOnAC()
	{
		System.out.println("switch on AC");
	}

	public static void main(String[] args) {
		
		
		/*here we are creating two objects which occupie or takes more memory. So to avoid that we go for Inheritance
		
		Car mycar = new Car();
		
		mycar.switchOnAC();
		
		Vehicle vh= new Vehicle();
		
		vh.applyBrake();
		
		vh.soundHorn();*/

		
         // The object of child class can access child and its parents properties
		Car myCar = new Car();
		
		myCar.applyBrake();
		
		myCar.soundHorn();
		
		myCar.switchOnAC();
		
		
		
		/*//If i create object for the parent class, we can access only parent class methods. And not child class methods
		
		Vehicle vh= new Vehicle();
		
		vh.applyBrake();
		vh.applyBrake();*/


	}

}
