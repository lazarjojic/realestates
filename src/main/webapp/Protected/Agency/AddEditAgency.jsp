<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dodavanje agencije</title>
</head>
<body>
	<h1>Dodavanje agencije</h1>


<%-- 	<form:form action="<%=request.getContextPath() +\"/protected/agency/addEditAgency\"%>" method="post" modelAttribute="agency"> --%>
	<form:form action="${pageContext.servletContext.contextPath}/protected/agency/addEditAgency" method="post" modelAttribute="agency">
	
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" value="${agency.getName()}" /></td>
			</tr>

			<tr>
				<td>PIB:</td>
				<td><form:input path="PIB" value="${agency.getPIB()}" /></td>
			</tr>

			<tr>
				<td>Director:</td>
				<td><form:input path="director" value="${agency.getDirector()}" /></td>
			</tr>

			<tr>
				<td>Address:</td>
				<td><form:input path="address" value="${agency.getAddress()}" /></td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td><form:input path="phone" value="${agency.getPhone()}" /></td>
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Save" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>

		</table>

	</form:form>






</body>
</html>