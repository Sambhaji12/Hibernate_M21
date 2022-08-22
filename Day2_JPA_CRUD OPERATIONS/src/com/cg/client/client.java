package com.cg.client;

import com.cg.entities.employee;
import com.cg.services.EmployeeService;
import com.cg.services.EmployeeServiceImpl;

public class client {

	public static void main(String[] args)
	{
		EmployeeService es= new EmployeeServiceImpl();
		employee emp=new employee();
		
		//create operation 
		emp.setId(1001);
		emp.setName("ram");
		es.addEmployee(emp);
		
		// reterive data 
		
		/*emp=es.getEmployeeId(1001);
		System.out.println("Emp ID:"+emp.getId());
		System.out.println("Emp Name:"+emp.getName());*/
		
		//update the recored 
		//emp=es.getEmployeeId(1001);
		//emp.setName("sanket");
		//es.updateEmployee(emp);
		
		//we have updated the recore after the selection 
		
		/*emp=es.getEmployeeId(1001);
		System.out.println("Emp ID:"+emp.getId());
		System.out.println("Emp Name:"+emp.getName());*/
		
		// at this brealpoint ,record is removed 
		//emp=es.getEmployeeId(1001);
		//es.removeEmployee(emp);
		//System.out.println("End of program /Life cycle completed.....");
		
		}
	}


