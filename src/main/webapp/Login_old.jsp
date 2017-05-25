<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>

	<form id="loginForm" action="/realestates/login" method="post">

		<ul class="errorMessages"></ul>

		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" />
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" />
			</tr>
			<tr>
				<td />
				<td><input type="submit" name="login" /></td>

			</tr>

		</table>

	</form>
</body>
</html>