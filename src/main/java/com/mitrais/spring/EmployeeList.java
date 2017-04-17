package com.mitrais.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeList {

	public List<Employee> employeeList = new ArrayList<Employee>();
	public List<Employee> employeeListFilter = new ArrayList<Employee>();
	public EmployeeList() {
		this.employeeList.add(new Employee("Jamaluddin", "Male"));
		this.employeeList.add(new Employee("Jamal", "Male"));
		this.employeeList.add(new Employee("Andy", "Male"));
		this.employeeList.add(new Employee("Andya", "Female"));
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployee(@RequestParam(value = "gender", defaultValue = "not Yet") String gender) {
		if (gender.equals("male")) {
			employeeListFilter = employeeList.stream().filter(s -> s.getGender().toLowerCase().equals("male")).collect(Collectors.toList());
			return employeeListFilter;
		} else {
			return employeeList;
		}
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public Employee EmployeeGet(@RequestBody Employee message) {
		this.employeeList.add(message);
		return message;
	}

}
