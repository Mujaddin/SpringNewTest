package com.mitrais.spring;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeListTest {
	List<Employee> employeeList = new ArrayList<Employee>();
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new EmployeeList()).build();
		this.employeeList.add(new Employee("Jamaluddin", "Male"));
		this.employeeList.add(new Employee("Jamal", "Male"));
		this.employeeList.add(new Employee("Andy", "Male"));
	}

	@Test
	public void getMessage() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/employees")).andExpect(MockMvcResultMatchers.status().isOk());
		String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/employees?gender=male")).andReturn()
				.getResponse().getContentAsString();
		String expected1 = "[{\"name\":\"Jamaluddin\",\"gender\":\"Male\"},{\"name\":\"Jamal\",\"gender\":\"Male\"},{\"name\":\"Andy\",\"gender\":\"Male\"}]";
		assertEquals(result, expected1);
	}
	
	@Test
	public void getMessage2() throws Exception {
		String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/employees?gender=")).andReturn()
				.getResponse().getContentAsString();
		String expected1 = "[{\"name\":\"Jamaluddin\",\"gender\":\"Male\"},{\"name\":\"Jamal\",\"gender\":\"Male\"},{\"name\":\"Andy\",\"gender\":\"Male\"},{\"name\":\"Andya\",\"gender\":\"Female\"}]";
		assertEquals(result, expected1);
	}
}
