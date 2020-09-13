package com.unmsm.visitor;

public class VacationVisitor implements IVisitor {
	
	@Override
	public void visit(Element element) {
		Employee employee = (Employee) element;
		// 3 extra vacation days
		employee.set_vacationDays(employee.get_vacationDays()+3);
		System.out.println(employee.getClass().getSimpleName()+" "+employee.get_name() +"'s vacation days: "+employee.get_vacationDays());
	}

}
