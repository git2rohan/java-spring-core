package com.autowiring.beans;

import com.autowiring.service.Department;

public class ITDepartment implements Department {
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("IT Department work");
	}

}
