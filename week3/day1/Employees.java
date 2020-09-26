package week3.day1;

public class Employees extends Company{
	
	
	String empName;
	int empId;
	
	// JVM creates default constructor internally
	
	// Here we created explicit constructor
	Employees()
	{
		System.out.println("default Constructor");
		
		empName = "Prathi";
		empId = 1121;
	}
	
	Employees(String name, int Id)
	{
		System.out.println("Parameterised Constructor");
		
		empName = name;
		empId = Id;
	}

	public static void main(String[] args) {
		
		
//syntax: ClassName  objName = keyword[new]  Constructor
		//Employees emp = new Employees();
		
		Employees emp = new Employees("Pranay",11);
		
		System.out.println(emp.empName);
		System.out.println(emp.empId);
		
			
	}

}
