package com.autowiring.beans;

import com.autowiring.service.Department;

public class HRDepartment implements Department {
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("HR Department work");	
	}

}
