package com.cg.dao;

import com.cg.entities.employee;

public interface EmployeeDao
{
	public abstract void addEmployee(employee emp); //creation
	public abstract void updateEmployee(employee emp);  //updation 
	
	public abstract employee  getEmployeeId(int id); 
	
	void removeEmployee(employee emp); //delete 
	
	public abstract void commitTransaction(); // close an entity manager 
	
	public abstract	void beginTransaction(); // begin the operation of entity Manager 
	
	
}
