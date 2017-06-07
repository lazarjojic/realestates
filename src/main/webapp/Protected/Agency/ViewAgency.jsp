<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agency</title>
</head>
<body>

<%-- 	<form:form action="<%=request.getContextPath() + \"/Protected/Agency/viewAgency\"%>" modelAttribute="viewAgency" method="POST"> --%>
	<form action="<%=request.getContextPath() + "/Protected/Agency/viewAgency"%>" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td>${agency.getName()}</td>
			</tr>
		
		
		
<!-- 			<tr> -->
<%-- 				<td><form:label path="nameLabel">Name:</form:label> --%>
<%-- 				<td><form:label path="nameValue">${agency.getName()}</form:label> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<%-- 				<td><form:label path="PIBLabel">PIB:</form:label> --%>
<%-- 				<td><form:label path="PIBValue">${agency.getPIB()}</form:label> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<%-- 				<td><form:label path="directorLabel">Name:</form:label> --%>
<%-- 				<td><form:label path="directorValue">${agency.getDirector()}</form:label> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<%-- 				<td><form:label path="nameLabel">Name:</form:label> --%>
<%-- 				<td><form:label path="nameValue">${agency.getName()}</form:label> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<%-- 				<td><form:label path="nameLabel">Name:</form:label> --%>
<%-- 				<td><form:label path="nameValue">${agency.getName()}</form:label> --%>
<!-- 			</tr> -->
			<tr>
				<td><input type="submit" name="action" value="Edit" /></td>
				<td><input type="submit" name="action" value="Delete" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>
		</table>
		
	</form>

</body>
</html>