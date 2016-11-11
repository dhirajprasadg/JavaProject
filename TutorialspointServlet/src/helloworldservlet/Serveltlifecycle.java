package helloworldservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serveltlifecycle extends HttpServlet {
	public Serveltlifecycle(){
		System.out.println(" Object of Serveltlifecycle is created ");
	}
	
	private String message = " do get method invoded from Servelet lifecycle ";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
	//	response.sendError(407, "Need authentication!!!" );
		
		System.out.println(" do Get Method called ");
		String name = req.getHeader("name");
		String localname = req.getLocalName();
		System.out.println(" Header Value of Name : " + name + " // "
				+ localname);
		System.out.println(" req.getMethod() : " + req.getMethod());
		System.out.println(" req.getServletPath() :  " + req.getServletPath());
		Cookie[] ck = req.getCookies();
		for (Cookie c : ck) {

			System.out.println(" Cookies : " + c.getName());
		}

		// Set refresh, autoload time as 5 seconds
	     // response.setIntHeader("Refres", 5);
	      
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		String title = "HTTP Header Request Example";

		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<table width=\"100%\" border=\"1\" align=\"center\">\n"
				+ "<tr bgcolor=\"#949494\">\n"
				+ "<th>Header Name</th><th>Header Value(s)</th>\n" + "</tr>\n");
		Enumeration en = req.getHeaderNames();

		while (en.hasMoreElements()) {
			String str = (String) en.nextElement();
			out.print(" <tr> <td>" + str + " </td> \n ");
			String strv = req.getHeader(str);
			out.println(" <td> " + strv + " </td> </tr> \n");

		}
		
		String par = req.getParameter("test1");
		// call the servletContext.log method
		ServletContext contx =getServletContext();
		contx.log(" Here is Visitor message : " + par);
	
		System.out.println(" Servelt Context capture the input value : " + par);
		System.out.println(" contx.getContextPath() " + contx.getContextPath());
		System.out.println(" contx.getServletContextName() " + contx.getServletContextName());
	}

	@Override
	public void init() throws ServletException {
		  System.out.println( " Thread Name inside Serveletlifecycle class : " + Thread.currentThread().getName());
		System.out.println(" Init Method called from Servletlifecycle Class ");
		super.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		  System.out.println( " Thread Name inside Serveletlifecycle class Service Method : " + Thread.currentThread().getName());
		System.out.println(" Service Method called inside Serveletlifecycle class ");
		super.service(req, res);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(" Prameterised init method called from Servletlifecycle class ");
		System.out.println(" Servletlifecycle : Servelet Name : " + config.getServletName() + " config.getInitParameter(\"Serveltlifecycle\")  "
				+ config.getInitParameter("Serveltlifecycle"));
		super.init(config);

	}

}