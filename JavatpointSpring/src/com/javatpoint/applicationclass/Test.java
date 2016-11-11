package com.javatpoint.applicationclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.javatpoint.pojoorentityclass.Employee;
import com.javatpoint.pojoorentityclass.HelloWorld;
import com.javatpoint.pojoorentityclass.Student;

public class Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
        // BeanFactory IOC container of spring framework
		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("studentbean");

		student.displayInfo();
		
		Employee emp = (Employee) factory.getBean("e");
		emp.show();

        //ApplicationContext IOC container of spring framework
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		
		// ClassPathXmlApplicationContext or FileSystemXmlApplicationContext or
		// WebXmlApplicationContext
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}

}
