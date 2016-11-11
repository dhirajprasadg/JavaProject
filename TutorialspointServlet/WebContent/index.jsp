<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Index page</h1>
	<form action="HelloWorldurl" method="get">
		Name : <input type="text" name="test" value="YourName"> <input
			type="submit" value="Submit" />

	</form>

	<br>

	<form action="HelloWorldservelet" method="get">
		<input type="text" name="test1" value="YourName"> <input
			type="submit" value="Submit" />

	</form>


	<a href="servlet2">click for photo</a>

	<h4>CURID Javatpoint</h4>

	<table>
		<form action="saveEmpservelet" method="post">
			<td>
			    Emp Name : <input type="text" name="empname"> Emp
				Password : <input type="password" name="emppassword"> Emp
				Email : <input type="email" name="empemail"> Emp Country : 
				<select size="20px" name="country">
					<option>India</option>
					<option>USA</option>
					<option>Australia</option>
			    </select> 
			<input type="submit" name="sbmit" value="SaveEmp">

			</td>
		</form>
	</table>
</br>
<a href="ViewEmpServlet">view employees</a> 

</body>
</html>