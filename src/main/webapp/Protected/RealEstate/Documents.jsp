<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="<%=request.getContextPath() + \"/Protected/documents\"%>" modelAttribute="documentsModel">

		<table>

			<c:if test="${sessionScope.user.status != 'agent'}">
				<td>
					<table>
						<tr>
							<td>Name:</td>
							<td><input type="text" value="name" /></td>
						</tr>

						<tr>
							<td>Type:</td>
							<td><input type="text" value="type" /></td>
						</tr>

						<tr>
							<td>Description:</td>
							<td><input type="text" value="description" /></td>
						</tr>

						<tr>
							<td>Date:</td>
							<td><input type="text" value="date" /></td>
						</tr>

						<tr>
							<td>Location:</td>
							<td><input type="text" name="location" /></td>
							<td><input type="submit" value="Browse" name="browse" /></td>
						</tr>

						<tr>
							<td><input type="submit" value="Add" name="add" /></td>
						</tr>
					</table>


				</td>

			</c:if>

			<td>
				<table>
					<tr>
						<td>
							<div></div>
						</td>
					</tr>

					<tr>
						<td><input type="submit" value="Show" name="show" /></td>

						<c:if test="${sessionScope.user.status != 'agent'}">
							<td><input type="submit" value="Delete" name="delete" /></td>
						</c:if>

						<td><input type="submit" value="Close" name="close" /></td>


					</tr>

				</table>


			</td>

		</table>
	</form:form>



</body>
</html>