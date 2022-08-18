package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.employee;

public class EmployeeDaoImple  implements EmployeeDao
 
{
	private EntityManager em;
	
	
	public EmployeeDaoImple() 
	{
		super();
		em =JPAUtil.getEntityManager();
	}

		@Override
		public void addEmployee(employee emp) 
		{
			em.persist(emp);
					
		}
				
		@Override
		public void updateEmployee(employee emp) 
		{
			em.merge(emp);
						
		}
						
		@Override
		public employee getEmployeeId(int id)
		{
			employee emp=em.find(employee.class ,id);						
			return emp;
		}

			@Override
			public void removeEmployee(employee emp) 
			{
			em.remove(emp);
										
			}
	
			@Override
			public  void commitTransaction() 
			{
				em.getTransaction().commit();
											
			}
										
			@Override
			public void beginTransaction()
			{
				em.getTransaction().begin();
												
			}
 
}
