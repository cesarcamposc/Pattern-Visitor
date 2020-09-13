package com.unmsm.visitor;

import java.util.ArrayList;

public class Employees {
	
	// Setup employee collection
		ArrayList<Employee> empList = new ArrayList<>();
		
		public void add(Employee employee){
			empList.add(employee);
	    }

	    public void remove(Employee employee){
	    	empList.remove(employee);
	    }

	    public void accept(IVisitor visitor){
	    	for(Employee employee : empList){
	    		employee.accept(visitor);
	    	}
	    	System.out.println();
	    }

}
