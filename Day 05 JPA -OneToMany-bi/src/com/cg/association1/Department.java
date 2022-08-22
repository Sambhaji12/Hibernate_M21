package com.cg.association1;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name ="Dept")
public class Department implements Serializable 
{
	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy =GenerationType.TABLE)
	private int id;
	private String name;

	//@OneToMany(mappedBy ="department")
	//private Set <Employee> employee;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	

}
