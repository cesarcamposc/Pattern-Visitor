package com.unmsm.visitor;

public class VisitorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setup employee collection
		Employees employees = new Employees();
		employees.add(new Director());
		employees.add(new President());
				
		// Employees are 'visited'
		employees.accept(new IncomeVisitor());
		employees.accept(new VacationVisitor());

	}

}
