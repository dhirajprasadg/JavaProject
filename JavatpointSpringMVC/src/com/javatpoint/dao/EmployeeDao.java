package com.javatpoint.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

import com.javatpoint.beans.Employee;

public interface EmployeeDao {

	public void setTemplate(JdbcTemplate template);

	public int save(Employee p);

	public int update(Employee p);

	public int delete(int id);

	public Employee getEmpById(int id);

	public List<Employee> getEmployees();
}