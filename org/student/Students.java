package org.student;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Id is "+id);
		
	}
	
	public void getStudentInfo(int id, String name) {
		
      System.out.println( id + " "+name);
	}
	
	public void getStudentInfo(String email, long pno) {
		
		System.out.println("email: " +email+"   " + "Phone number is: "+pno);
		
	}

	public static void main(String[] args) {
	
		Students st = new Students();
		
		st.getStudentInfo(123);
		
		st.getStudentInfo(536, "prathi");
		
		st.getStudentInfo("test@gmail.com", 1234567890);
				
				
		

	}

}
