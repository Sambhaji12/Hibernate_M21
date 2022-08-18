package com.cg.entities;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class employee implements Serializable  
{
	
	@SuppressWarnings("unused")
	private static final long SerialVersionUID=1L;
	@Id
	private int id;
	private String name;
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) {
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
