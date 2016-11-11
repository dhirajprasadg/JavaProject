<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>Spring MVC Hello World Example</h2>
	
	<a href="hello"> Hello World  </a>
	
	<h2>Spring MVC Form Handling Example</h2>
	
	<a href="student"> Student page </a>
	
	<h2>Spring Page Redirection Example </h2>
	<p>Click below button to redirect the result to new page</p>

	<form:form method="GET" action="/TutorialspointSpringMVC/redirect">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</form:form>

	<h2>Spring Static page Example</h2>
		<form:form method="GET" action="/TutorialspointSpringMVC/staticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML static page" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>