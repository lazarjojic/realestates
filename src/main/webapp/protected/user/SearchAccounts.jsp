<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Accounts</title>
<style>
tr {
	cursor: pointer;
	transition: all .25s ease-in-out
}

.selected {
	background-color: red;
	font-weight: bold;
	color: #fff;
}
</style>
</head>
<body>
	<h1>Search Accounts</h1>

	<form:form action="${pageContext.servletContext.contextPath}/protected/user/searchAccounts" method="post" modelAttribute="userModel">
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" />
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input path="lastName" />
						</tr>
						<tr>
							<td>Phone:</td>
							<td><form:input path="phone" />
						</tr>
						<tr>
							<td>Agency:</td>
							<td><form:select path="agencyID">
									<c:forEach var="item" items="${existingAgencies}">
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
						<tr>
							<td>Username:</td>
							<td><input type="text" name="username" />
						</tr>
						<tr></tr>
						<tr>
							<td />
							<td><input type="submit" name="action" value="Search" /> <input type="button" onclick="location.href = '${pageContext.servletContext.contextPath}/protected/home'" name="action" value="Close" /></td>
						</tr>
					</table>
				</td>
				<td>
					<table>
						<tr>
							<td>
								<table id="listOfFoundAccounts" border="1">
									<tr>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Phone</th>
										<th>Agency</th>
										<th>Status</th>
										<th>Username</th>
									</tr>
									<c:forEach var="item" items="${foundAccounts}">
										<tr>
											<td>${item[0]}</td>
											<td>${item[1]}</td>
											<td>${item[2]}</td>
											<td>${item[3]}</td>
											<td>${item[4]}</td>
											<td>${item[5]}</td>
										</tr>
									</c:forEach>
								</table>
							</td>
						</tr>
						<tr>
							<td><input type="submit" name="action" value="Show" /> <input type="button"
								onclick="location.href = '${pageContext.servletContext.contextPath}/protected/user/addEditAccount'" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /> <input type="text"
								id="selectedIndex" name="selectedIndex" style="display: none" /></td>
						</tr>
					</table> <script>
						function selectedRow() {
							var index, table = document
									.getElementById("listOfFoundAccounts");

							for (var i = 1; i < table.rows.length; i++) {
								table.rows[i].onclick = function() {
									if (typeof index !== "undefined") {
										table.rows[index].classList
												.toggle("selected");
									}
									index = this.rowIndex;
									document.getElementById("selectedIndex").value = index;
									this.classList.toggle("selected");
								};
							}
						}
						selectedRow();
					</script>
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>