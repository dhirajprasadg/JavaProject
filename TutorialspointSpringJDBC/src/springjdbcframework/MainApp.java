package springjdbcframework;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springjdbcframework.daoimp.StudentDaoImpl;


public class MainApp {
   public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
   StudentDaoImpl daoimplobj = (StudentDaoImpl)context.getBean("StudentDaoImpl");
      
      System.out.println("------Records Creation--------" );
      daoimplobj.create("Alvin", 11);
      daoimplobj.create("Nuha", 2);
      daoimplobj.create("Ayan", 15);

      System.out.println("------Listing Multiple Records--------" );

    JdbcTemplate jdbctemobj = (JdbcTemplate)context.getBean("JdbcTemplate");
    String SQL = "insert into Student (name, age) values (?, ?)";   
    jdbctemobj.update(SQL, "Dhiraj", "24");
   
   
   }
}