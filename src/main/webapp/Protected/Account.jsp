<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<td><input type="text" name="firstName" value="${account.getFirstName()}" />
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" value="${account.getLastName()}" />
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" value="${account.getPhone()}" />
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

			<c:choose>
				<c:when test="${sessionScope.user.status == 'admin'}">
					<tr>
						<td>Username:</td>
						<td><input type="text" name="username" value="" />
					</tr>

					<tr>
						<td>Password:</td>
						<td><input type="text" name="password" value="" />
					</tr>

				</c:when>
				<c:otherwise>
					<tr>
						<td>Username:</td>
						<td><input type="text" name="username" value="" readonly />
				</c:otherwise>
			</c:choose>

			<tr>
				<td><input type="submit" name="action" value="Edit" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>



		</table>

	</form>

</body>
</html>