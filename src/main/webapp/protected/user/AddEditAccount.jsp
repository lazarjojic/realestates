<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${pageTitle}</title>
</head>
<body>

	<h1>${pageTitle}</h1>

	<form:form action="${pageContext.servletContext.contextPath}/protected/user/addEditAccount" method="post" modelAttribute="userModel" enctype="multipart/form-data">
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" value="${selectedAccount.getFirstName()}" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input path="lastName" value="${selectedAccount.getLastName()}" /></td>
						</tr>
						<tr>
							<td>Phone:</td>
							<td><form:input path="phone" value="${selectedAccount.getPhone()}" /></td>
						</tr>
						<tr>
							<td>Agency:</td>
							<td><form:select path="agencyID">
									<c:forEach var="item" items="${sessionScope.existingAgencies}">
										<form:option value="${item[0]}">${item[1]}</form:option>
									</c:forEach>
								</form:select></td>
						</tr>
						<tr>
							<td>Status:</td>
							<td><form:select path="status">
									<form:option value="admin">Administrator</form:option>
									<form:option value="moderator">Moderator</form:option>
									<form:option value="agent">Agent</form:option>
								</form:select></td>
						</tr>
						<c:choose>
							<c:when test="${sessionScope.user.status == 'admin'}">
								<tr>
									<td>Username:</td>
									<td><form:input path="username" value="${selectedAccount.getUsername()}" /></td>
								</tr>
								<tr>
									<td>Password:</td>
									<td><form:input path="password" /></td>
								</tr>
							</c:when>
							<c:otherwise>
								<tr>
									<td>Username:</td>
									<td><form:input path="username" value="${account.getUsername()}" /></td>
								</tr>
							</c:otherwise>
						</c:choose>
						<tr>
							<td>File:</td>
							<td><input type="file" name="file" id="file" /></td>
							<td><input type="submit" name="action" value="Add" /></td>
						</tr>
						<tr>
							<td><input type="submit" name="action" value="Save" /></td>
							<td><input type="submit" name="action" value="Close" /></td>
						</tr>
					</table>
				</td>
				<td><img src='<c:url value="${profileImagePath}"></c:url>' alt="No image" style="width: 145px; height: 167px;" /></td>
		</table>
	</form:form>

</body>
</html>