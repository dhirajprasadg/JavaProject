package helloworldservlet;

//Import required java libraries
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class HelloWorld extends HttpServlet {
	public HelloWorld() {
		System.out
				.println("---------- HelloWorld Class Object created--------------------- ");
	}

	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "init method form Hello World, it is called only once in lifecycle of servelet ";
		System.out.println(message);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out
				.println(" doGet is service method and it called each time we send the requet ");
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");

		String st = request.getRequestURI();
		out.print("<br>");
		out.println(" Get SErver Name :  " + request.getServerName());
		out.print("<br>");
		out.println(" // Get Context Path :  " + request.getContextPath());
		out.print("<br>");
		out.println(" // Get Servelet Path :  " + request.getServletPath());
		out.print("<br>");
		out.println(" // request.getRequestURI() method : " + st
				+ " ||  Sesssion Id : " + request.getRequestedSessionId());
		out.print("<br>");
		out.println("-----------------------------------------------------------------------------------------");

		// An object of ServletConfig is created by the web container for each
		// servlet. This object can be used to get configuration information
		// from web.xml file.
		// we are calling direct method because object of servletConfig is
		// already created by web container for each servlet
		ServletConfig config = getServletConfig();

		Enumeration<String> en = config.getInitParameterNames();
		String str;
		while (en.hasMoreElements()) {
			str = en.nextElement();
			out.print("<br>");
			out.println(" // InitParameter :  " + str);
			out.println(" // InitParameter Value : "
					+ config.getInitParameter(str));
		}

		String driver = config.getInitParameter("driver");
		out.print("<br>");
		out.print(" [[  Driver Value is: " + driver);

		String username = config.getInitParameter("username");
		out.print("<br>");
		out.print(" // Username  Value is: " + username);
		out.print("<br>");
		out.println("-----------------------------------------------------------------------------------------");
		out.print("<br>");
		// An object of ServletContext is created by the web container at time
		// of deploying the project.
		// here is only one ServletContext object per web application.
		// If any information is shared to many servlet, it is better to provide
		// it from the web.xml file using the <context-param> element.
		// We can get the ServletContext object from ServletConfig object
		ServletContext context = getServletConfig().getServletContext();
		// Another convenient way to get the ServletContext object from
		// GenericServlet class
		ServletContext context1 = getServletContext();
		String drivername = context.getInitParameter("dname");
		out.print("<br>");
		out.println(" Driver Name : " + drivername);
		Enumeration conten =context.getInitParameterNames();
		while(conten.hasMoreElements()){
			String initname = (String) conten.nextElement();
			out.print("<br>");
			out.print(" [[ init parameter name : " + initname + " -- " );
			out.print(" init parameter Value : " + context.getInitParameter(initname) + " ]] " );
			
		}
//setting the attribute in the application scope and getting that value from another servlet.
		out.print("<br>");
		out.print("<br>");
		context.setAttribute("company", "TCS");
		out.print("<a href='servlet2' > Visit Servlet2 </a> ");
    	// http://www.javatpoint.com/cookies-in-servlet
		out.print("<br>");
		out.print("<br>");
		out.print(" Hello " + request.getParameter("test") + " we started tracking you in cookie . Pls visit above link ");
		String usernamevalue = request.getParameter("test");
		Cookie ck = new Cookie("user", usernamevalue); // cookie object created with name as user and value taken from request 
		response.addCookie(ck);
		//creating submit button  
	    out.print("<form action='servlet2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
		
		
		
	}

	public void destroy() {
		// do nothing.
	}
}