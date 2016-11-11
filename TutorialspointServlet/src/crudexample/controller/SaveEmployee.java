package crudexample.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudexample.beanorentity.Emp;
import crudexample.dao.EmpDao;

@WebServlet("/saveEmployee")  
public class SaveEmployee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		System.out.println(" SaveEmployee  doPost mehtod invoked ");

		Emp e = new Emp();
		e.setEmpname(req.getParameter("empname"));
		e.setEmppassword(req.getParameter("emppassword"));
		e.setEmpemail(req.getParameter("empemail"));
		e.setCountry(req.getParameter("country"));
		System.out.println(" emp Name : " + req.getParameter("empname"));
		int status  = EmpDao.saveEmp(e);
		if(status>0){
			out.print("Employee Saved ");
			req.getRequestDispatcher("index.jsp").include(req, resp);
		
		}else{
			out.print(" Employee not saved ");
		} out.close();
	}

}
