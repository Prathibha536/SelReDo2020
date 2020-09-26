package org.department;

import org.system.College;

public class Department extends College{
	
	public void deptName() {
		
		System.out.println("Department Name");

	}

	public static void main(String[] args) {
		
		Department dt = new Department();
		
		dt.collegeName();
		
		dt.collegeCode();
		
		dt.collegeRank();
		
		dt.deptName();
		
		

	}

}
