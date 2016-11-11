package helloworldservlet.filters;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

	public LogFilter(){
		long yourmilliseconds = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
		Date resultdate = new Date(yourmilliseconds);
			
		System.out.println("--------------LogFilter Class Object Created Time  "+ sdf.format(resultdate) +"  -----------------");
	}
	
	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
          System.out.println( " Thread Name frin filter class inside init : " + Thread.currentThread().getName());
		 // Get init parameter 
	      String testParam = paramFilterConfig.getInitParameter("test-param"); 

	      //Print the init parameter 
	      System.out.println(" Init method called inside the  LogFilter class, & init parameter value captured from web.xml file");
	      System.out.println("  configured under filer servelt : " + testParam);
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest,
			ServletResponse paramServletResponse, FilterChain paramFilterChain)
			throws IOException, ServletException {
		  System.out.println( " Thread Name : " + Thread.currentThread().getName());
		 // Get the IP address of client machine.   
	      String ipAddress = paramServletRequest.getRemoteAddr();

	      // Log the IP address and current timestamp.
	      System.out.println("do filter method from log filter class :// IP "+ ipAddress + ", Time "
	                                       + new Date().toString());

	      // Pass request back down the filter chain
	      paramFilterChain.doFilter(paramServletRequest,paramServletResponse);
		
		
	}

	@Override
	public void destroy() {

	}

}
