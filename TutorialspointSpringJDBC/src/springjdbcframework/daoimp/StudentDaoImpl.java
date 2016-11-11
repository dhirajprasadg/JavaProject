package springjdbcframework.daoimp;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import springjdbcframework.dao.StudentDAO;
import springjdbcframework.entiry.Student;
import springjdbcframework.entiry.StudentMapper;

public class StudentDaoImpl implements StudentDAO {
	public StudentDaoImpl() {
		System.out.println(" StudentDaoImpl default constructor invoked ");
	}

	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplateRef;

	public void setJdbcTemplateRef(DataSource jdbcTemplateRef) {
		//this.dataSource = jdbcTemplateRef;
		this.jdbcTemplateRef = new JdbcTemplate(jdbcTemplateRef);
	}

	/*
	 * public void setDataSource(DataSource dataSource) { this.dataSource =
	 * dataSource; System.out.println(
	 * " data source value is inserted from bean.xml through setter");
	 * this.jdbcTemplateRef = new JdbcTemplate(dataSource); }
	 */
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";

		jdbcTemplateRef.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateRef.queryForObject(SQL,
				new Object[] { id }, new StudentMapper());
		return student;
	}

}