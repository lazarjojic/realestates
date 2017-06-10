<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Account</title>
</head>
<body>
	<h1>View Account</h1>

	<form:form id="accountForm" action="${pageContext.servletContext.contextPath}/protected/user/viewAccount" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td>${selectedAccount.getFirstName()}</td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td>${selectedAccount.getLastName()}</td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td>${selectedAccount.getPhone()}</td>
			</tr>

			<tr>
				<td>Agency:</td>
				<td>${selectedAccount.getAgencyName()}</td>
			</tr>

			<tr>
				<td>Status:</td>
				<td>${selectedAccount.getStatus()}</td>
			</tr>

			<tr>
				<td>Username:</td>
				<td>${selectedAccount.getUsername()}</td>
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Edit" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>

		</table>

	</form:form>

</body>
</html>