package com.cg.project.beans;

public final class SalesManager extends PEmployee{
	private int commission,salesAmount;
	public SalesManager() {
		super();
	}
	public SalesManager(int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId,basicSalary,firstName,lastName);
	}
	public SalesManager(int salesAmount, int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId,basicSalary,firstName,lastName);
		this.salesAmount = salesAmount;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	public String doSale(){
		return "Sales Done";
	}
	public int commission(){
		return commission=(int)((0.5)*this.salesAmount);
		
	}
	@Override
	public String toString() {
		return "SalesManager [commission=" + commission + ", salesAmount=" + salesAmount + ", EmployeeId ="
				+ getEmployeeId() + ", BasicSalary =" + getBasicSalary() + ", FirstName =" + getFirstName()
				+ ", LastName =" + getLastName() + "]";
	}
	
	
}
