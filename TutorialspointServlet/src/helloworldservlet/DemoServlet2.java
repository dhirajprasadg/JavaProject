package helloworldservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
	
		PrintWriter out = resp.getWriter();
		ServletContext sc = getServletConfig().getServletContext();
		String comp = (String) sc.getAttribute("company");
		out.println(" Welcome to :"
				+ comp
				+ " || Company Value were setup in HelloWorld servlet and retriving it in another servlet ");

		// ---------------------cookie related stuff-----
		out.print("<br>");
		Cookie[] cke = req.getCookies();
		if (cke == null) {
			out.print(" Pls go to home page and Login first ");
		} else {

			for (Cookie c : cke) {
				
				out.print("Cookie Name :" + c.getName() + " | Cookie Value : "
						+ c.getValue());
				out.println("<br>");
			}

		}

		resp.setContentType("image/jpeg");
		ServletOutputStream out1 = resp.getOutputStream();
		
		
		
		
		
	}

}
