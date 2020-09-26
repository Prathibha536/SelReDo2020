package week3.day1;

public class StudentInfo {
	
	//Method Overloading example
	
	
	public void getStudentDetails(String name) {
		
		System.out.println(name);			

	}
	
	//Java will not allow to create same method name with same arg type
	
    /*public void getStudentDetails(String email) {
		
		System.out.println(email);			

	}*/
	
	public void getStudentDetails(int id)
	{
		System.out.println(id);
	}
	
	//Java allows Same method name with Arg order different
	
	public void getStudentDetails(int count, String name)
	{
		System.out.println(count+" "+name);
	}
	
	
	
	public void getStudentDetails(String email, int pno)
	{
		System.out.println(email+" "+pno);
	}
	
	
	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		si.getStudentDetails("Prathi");
		
		si.getStudentDetails(123);
		
		si.getStudentDetails(10, "Pranay");
		
		si.getStudentDetails("test@gmail.com", 123465548);

	}

}
