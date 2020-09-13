package com.unmsm.visitor;

public class Employee implements Element {
	
	private String name;
    private double income;
    private int vacationdays;
    
    
	public Employee(String name, double income, int vacationdays) {
		super();
		this.name = name;
		this.income = income;
		this.vacationdays = vacationdays;
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public double get_income() {
		return income;
	}

	public void set_income(double income) {
		this.income = income;
	}

	public int get_vacationDays() {
		return vacationdays;
	}

	public void set_vacationDays(int vacationdays) {
		this.vacationdays = vacationdays;
	}

	@Override
	public void accept(IVisitor visitor) {
		
		visitor.visit(this);
		
	}

}
