<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
</head>
<body>

	<h1>Account</h1>

	<form id="createaccountform" action="<%=request.getContextPath() + "/Protected/createAccount"%>" method="post">

		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" />
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" />
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" />
			</tr>

			<tr>
				<td>Agency:</td>
				<td><select name="agency">
						<c:forEach var="item" items="${agencies}">
							<option value="${item[0]}">${item[1]}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td>Status:</td>
				<td><select name="status">
						<option value="admin">Administrator</option>
						<option value="moderator">Moderator</option>
						<option value="agent">Agent</option>
				</select></td>
			</tr>

			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" />
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" />
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Edit" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>



		</table>

	</form>

</body>
</html>