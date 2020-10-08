<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CreateCenterServlet" method="post">
		<input type="text" name="centerName">
		<input type="submit" value="Create Center">
	</form>
	<a href="Registration.jsp"><button>Register</button></a>
	<br><h1><%
		if(request.getAttribute("centerId")!=null)
			out.println(request.getAttribute("centerId"));
	%></h1>
</body>
</html>