package com.cg.services;


import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImple;
import com.cg.entities.employee;

public class EmployeeServiceImpl implements EmployeeService 
{
	private EmployeeDao  dao;
	
	
	public EmployeeServiceImpl() {
		super();
		dao =new  EmployeeDaoImple();
	}


	@Override
	public void addEmployee(employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}


	@Override
	public void updateEmployee(employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}


	@Override
	public employee getEmployeeId(int id) 
	{
		employee emp=dao.getEmployeeId(id);
		
		return emp;
	}


	@Override
	public void removeEmployee(employee emp) 
	{
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		
	}

	

}
