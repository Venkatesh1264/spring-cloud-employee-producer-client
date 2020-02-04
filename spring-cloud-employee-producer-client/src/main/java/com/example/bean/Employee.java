package com.example.bean;

import java.math.BigDecimal;

public class Employee {
	private BigDecimal id;
	private String name;
	private long salary;
	
	public Employee(BigDecimal id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
