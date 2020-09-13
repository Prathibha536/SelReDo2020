package week1.day1;

public class Mobile {
	
	
	long mobileNumber = 9500039216L;
	String color = "Red";
	double mobWeight = 5.5;
	boolean isRefurbished = false;
	
	public void makeCall() 
	{
		
		System.out.println("Call Connected");
	}
    
	public void sendSMS()
	{
		System.out.println("Sent SMS");
		
		//Calling method inside another method
		
		makeCall();
		
		// Calling global Variable inside a method
		
		System.out.println(mobWeight);
	}
	
	public void takePhoto()
	{
		System.out.println("Photo Taken");
	}
	

	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		
		long mNumber = obj.mobileNumber;
		double mWeight = obj.mobWeight;
		String mColor = obj.color;
		boolean isRe = obj.isRefurbished;
		
		
		obj.makeCall();
		obj.sendSMS();
		obj.takePhoto();
		
		/*System.out.println(obj.mobileNumber);
		System.out.println(obj.mobWeight);
		System.out.println(obj.color);
		System.out.println(obj.isRefurbished);*/
		
		System.out.println(mNumber);
		System.out.println(mWeight);
		System.out.println(mColor);
		System.out.println(isRe);
		
		 
		
	}
}


