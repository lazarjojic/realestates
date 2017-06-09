<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<h1>Profile</h1>

	<form id="accountForm" action="<%=request.getContextPath() + "/Protected/profile"%>" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td>${sessionScope.user.getFirstName()}</td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td>${sessionScope.user.getLastName()}</td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td>${sessionScope.user.getPhone()}</td>
			</tr>

			<tr>
				<td>Agency:</td>
				<td>${sessionScope.user.getAgencyName()}</td>
			</tr>

			<tr>
				<td>Status:</td>
				<td>${sessionScope.user.getStatus()}</td>
			</tr>

			<tr>
				<td>Username:</td>
				<td>${sessionScope.user.getUsername()}</td>
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Change password" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>

		</table>

	</form>

</body>
</html>