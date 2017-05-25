<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>
	<%-- 	<c:import url="<%=request.getContextPath() + \"/Protected/header.jsp\"%>" /> --%>

	<form:form action="<%=request.getContextPath() + \"/login\"%>" modelAttribute="login" method="POST">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td><label for="textinput1">Username:</label></td>
				<td><form:input path="username" cssErrorClass="error" /></td>
			</tr>

			<tr>
				<td />
				<td><form:errors path="username" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="textinput2">Password:</label></td>
				<td><form:input path="password" cssErrorClass="error" /></td>
			</tr>

			<tr>
				<td />
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>

			<tr>
				<td />
				<td><input type="submit" name="login" class="btn" value="Login" /></td>
			</tr>

		</table>
	</form:form>

</body>
</html>