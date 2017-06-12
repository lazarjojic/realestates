<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<h1>Profile</h1>

	<form:form action="${pageContext.servletContext.contextPath}/protected/user/profile" id="accountForm"  method="post">
		<table>
			<tr>
				<td>
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
					</table>
				</td>
				<td><img src='<c:url value="${profileImagePath}"></c:url>' alt="No image" style="width: 145px; height: 167px;" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>