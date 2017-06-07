<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Agencies</title>
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

	<form:form action="<%=request.getContextPath() + \"/Protected/Agency/searchAgencies\"%>" modelAttribute="agency" method="POST">
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td>Name:</td>
							<td><input type="text" name="name" /></td>
						</tr>

						<tr>
							<td>PIB:</td>
							<td><input type="text" id="PIB" name="PIB" /></td>
						</tr>

						<tr>
							<td>Director:</td>
							<td><input type="text" id="director" name="director" /></td>
						</tr>

						<tr>
							<td>Address:</td>
							<td><input type="text" id="address" name="address" /></td>
						</tr>

						<tr>
							<td>Phone:</td>
							<td><input type="text" id="phone" name="phone" /></td>
						</tr>


						<tr>
							<td><input type="submit" name="action" value="Search" /></td>
						</tr>

					</table>

				</td>
				<td>

					<table id="listOfAgencies" border="1">
						<tr>
							<th>Name</th>
							<th>PIB</th>
							<th>Director</th>
							<th>Address</th>
							<th>Phone</th>
						</tr>

						<c:forEach var="item" items="${agencies}">
							<tr>
								<td>${item.getName()}</td>
								<td>${item.getPIB()}</td>
								<td>${item.getDirector()}</td>
								<td>${item.getAddress()}</td>
								<td>${item.getPhone()}</td>
							</tr>

						</c:forEach>


					</table> <script>
						function selectedRow() {
							var index, table = document
									.getElementById("listOfAgencies");

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
			<tr>
				<td></td>
				<td><input type="submit" name="action" value="Show" /><input type="submit" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /> 
				<input type="submit" name="action" value="Close" />
				<input type="text" id="selectedIndex" name="selectedIndex" style="display: none" />
				</td>
			</tr>
		</table>
	</form:form>
	




</body>
</html>