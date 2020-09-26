package week3.day1;

public class SbiMadurai extends SbiHeadOffice{
	
	//@Override
	public void fixedDeposit() {
		
		System.out.println("10%");
	}
	
	

	public static void main(String[] args) {
		
		// Method Overriding
		
		SbiMadurai sm = new SbiMadurai();
		
		//if method is not available in child, then it executes the parent method
		// If there is method available in child then it overrides the parent one
		
		sm.fixedDeposit();
		
	}

}
