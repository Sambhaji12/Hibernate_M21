package com.cg.services;

import com.cg.entities.employee;

public interface EmployeeService
{
		public abstract void addEmployee(employee emp); //creation

		public abstract void updateEmployee(employee emp);  //updation 
	

		public abstract employee  getEmployeeId(int id); //Retrieve 
	

		public abstract void removeEmployee(employee emp); //delete 
	
}
