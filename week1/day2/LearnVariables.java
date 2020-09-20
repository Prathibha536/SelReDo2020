package week1.day2;

public class LearnVariables {
	
	// static variable/ Global variable
	public static String var = " I am prathibha";
	
	//Instance variable
	
	String instancevar= "Testleaf";
	
	//local variable
	
	public void myLocation()
	{
		String location = "Madipakkam";
		System.out.println(location);
	}

	public static void main(String[] args) {
		LearnVariables obj = new LearnVariables();
		
		System.out.println(obj.var);
		
		System.out.println(obj.instancevar);
		
		//System.out.println(obj.myLocation());
		
		
		

	}

}
