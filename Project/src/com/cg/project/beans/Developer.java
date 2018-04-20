package com.cg.project.beans;

public final class Developer extends PEmployee{
	private int noOfProjects,incentive;
	public Developer() {
		super();
	}
	public Developer(int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId,basicSalary,firstName,lastName);
	}
	public Developer(int noOfProjects, int employeeId, int basicSalary, String firstName, String lastName) {
		super(employeeId,basicSalary,firstName,lastName);
		this.noOfProjects = noOfProjects;
	}
	public int getNoOfProjects() {
		return noOfProjects;
	}
	public void setNoOfProjects(int noOfProjects) {
		this.noOfProjects = noOfProjects;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	public void calculateSalary(){
		incentive = noOfProjects*10000;
		this.setTotalSalary(this.incentive+this.getTotalSalary());
	}
	@Override
	public String toString() {
		return "Developer [noOfProjects=" + noOfProjects + ", incentive=" + incentive + ", getEmployeeId()="
				+ getEmployeeId() + ", getBasicSalary()=" + getBasicSalary() + ", getTotalSalary()=" + getTotalSalary()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}
	
}
	
