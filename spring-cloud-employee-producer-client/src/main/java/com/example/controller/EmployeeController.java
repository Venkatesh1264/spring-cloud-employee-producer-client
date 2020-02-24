package com.example.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Employee;
//This is for venkat branchjljl
@RestController
public class EmployeeController {
	@RequestMapping(value="employees",method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(new BigDecimal(1), "rajesh", 1000l));
		employeeList.add(new Employee(new BigDecimal(2), "ravi", 2000l));
		employeeList.add(new Employee(new BigDecimal(3), "arjun", 3000l));
		employeeList.add(new Employee(new BigDecimal(4), "sireesh", 4000l));
		employeeList.add(new Employee(new BigDecimal(5), "mahesh", 5000l));
		employeeList.add(new Employee(new BigDecimal(6), "ramu", 6000l));
		return employeeList;
	}
}
