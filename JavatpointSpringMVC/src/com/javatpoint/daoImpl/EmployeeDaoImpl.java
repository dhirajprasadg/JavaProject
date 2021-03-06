package com.javatpoint.daoImpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Employee;
import com.javatpoint.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate template;
 
	EmployeeDaoImpl(){
		System.out.println(" Employee Dao Impl Object created");
	}
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		System.out.println(" setTemplate method is called in EmployeeDao ");
	}

	/*
	 * Table neeed to be created before saving the employee  in db
	 * 
	 * CREATE TABLE emp99 ( id integer NOT NULL AUTO_INCREMENT, name
	 * VARCHAR(4000) , salary integer, designation VARCHAR(4000) , PRIMARY KEY
	 * (id) );
	 */

	public int save(Employee p) {
		String sql = "insert into Emp99(name,salary,designation) values('"
				+ p.getName() + "'," + p.getSalary() + ",'"
				+ p.getDesignation() + "')";
		return template.update(sql);
	}

	public int update(Employee p) {
		String sql = "update Emp99 set name='" + p.getName() + "', salary="
				+ p.getSalary() + ", designation='" + p.getDesignation()
				+ "' where id=" + p.getId() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from Emp99 where id=" + id + "";
		return template.update(sql);
	}

	public Employee getEmpById(int id) {
		String sql = "select * from Emp99 where id=?";
		return template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public List<Employee> getEmployees() {
		return template.query("select * from Emp99", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}