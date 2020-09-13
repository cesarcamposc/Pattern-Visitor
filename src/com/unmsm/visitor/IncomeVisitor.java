package com.unmsm.visitor;

public class IncomeVisitor implements IVisitor{
	
	@Override
	public void visit(Element element) {
		Employee employee = (Employee) element;
		// Provide 20% pay additional
		employee.set_income(employee.get_income()*1.20);
		System.out.println(employee.getClass().getSimpleName()+" "+employee.get_name() +"'s new income: "+employee.get_income());
	}
}
