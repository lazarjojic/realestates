<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
</head>
<body>

	<h1>Account</h1>

	<form id="accountForm" action="<%=request.getContextPath() + "/Protected/account"%>" method="post">

		<table>
			<tr>
				<td>First Name:</td>
				<td>${account.getFirst_name()}</td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td>${account.getLast_name()}</td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td>${account.getPhone()}</td>
			</tr>

			<tr>
				<td>Agency:</td>
				<td>${account.getAgencyName()}</td>
			</tr>

			<tr>
				<td>Status:</td>
				<td>${account.getStatus()}</td>
			</tr>

			<tr>
				<td>Username:</td>
				<td>${account.getUsername()}</td>
			</tr>

			<tr>
				<td />
				<td><input type="submit" name="close" value="Close" /></td>
			</tr>

		</table>

	</form>

</body>
</html>