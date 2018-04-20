package com.cg.project.beans;

public class CEmployee extends Employee {
	private int hrs,variablePay;
	public CEmployee() {
		super();
	}
	public CEmployee(int employeeId, String firstName, String lastName) {
		super(employeeId,firstName,lastName);
	}
	public CEmployee(int hrs, int employeeId, String firstName, String lastName) {
		super(employeeId,firstName,lastName);
		this.hrs = hrs;
	}

	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getVariablePay() {
		return variablePay;
	}
	public void setVariablePay(int variablePay) {
		this.variablePay = variablePay;
	}
	public void contractSigned(){
		System.out.println("Contract has signed");
	}
	public void calculateSalary(){
		variablePay = hrs*2000;
	}
	@Override
	public String toString() {
		return "CEmployee [hrs=" + hrs + ", variablePay=" + variablePay + ", EmployeeId =" + getEmployeeId()
				+ ", FirstName =" + getFirstName() + ", LastName =" + getLastName() + "]";
	}
	
	
}
