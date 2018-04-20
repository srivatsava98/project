package com.cg.project.main;

import com.cg.project.beans.CEmployee;
import com.cg.project.beans.Developer;
import com.cg.project.beans.Employee;
import com.cg.project.beans.PEmployee;
import com.cg.project.beans.SalesManager;

public class MainClass1 {
   public static void main(String[] args){
	//   Employee employee = new Employee(123, 15000, "Mutyala", "Srivatsava");
	 //  employee.calculateSalary();
	 //  System.out.println(employee.toString());
	   PEmployee pEmployee = new PEmployee(124, 10000, "M", "S");
	   pEmployee.calculateSalary();
	   System.out.println(pEmployee.toString());
	   CEmployee cEmployee = new CEmployee(250, 111, "M", "J");
	   cEmployee.contractSigned();
	   cEmployee.calculateSalary();
	   System.out.println(cEmployee.toString());
	   SalesManager salesManager = new SalesManager(2000, 112, 10000, "V", "J");
	   salesManager.doSale();
	   salesManager.commission();
	   System.out.println(salesManager.toString());
	   Developer developer = new Developer(10, 113, 15000, "P", "N");
	   developer.calculateSalary();
	   System.out.println(developer.toString());
   }
}
