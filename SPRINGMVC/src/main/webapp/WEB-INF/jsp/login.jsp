<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form name="login_form"
		action="<c:url value='j_spring_security_check'/>" method="post">
		<table>

			<tr>
				<td><label>Username :</label></td>
				<td><input type="text" name="j_username" /></td>
			</tr>
			<tr>
				<td><label>Password :</label></td>
				<td><input type="password" name='j_password' /></td>
			</tr>
			<tr>
				<td><button type="submit" value="Submit">Login</button></td>
			</tr>

		</table>
	</form>
</body>
</html>