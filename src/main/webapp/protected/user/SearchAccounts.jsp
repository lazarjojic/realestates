<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Accounts</title>
</head>
<body>

	<form action="<%=request.getContextPath() + "/Protected/searchAccounts"%>" method="post" id="searchRealEstateForm">

		<table>
			<tr>
				<td>
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
							<td />
							<td><input type="submit" name="search" value="Search" /></td>
						</tr>

					</table>


				</td>

				<td>
					<table>
						<tr>
							<td>Floor from:</td>
							<td><input type="text" id="address" name="floorFrom" /></td>
							<td>to:</td>
							<td><input type="text" id="address" name="floorTo" /></td>
						</tr>

						<tr>
							<td>Heating:</td>
							<td><select name="heating">
									<option value="1">Central</option>
									<option value="1">Wood</option>
									<option value="1">Electric</option>
							</select></td>

						</tr>

						<tr>
							<td>Balcony:</td>
							<td><input type="checkbox" id="address" name="balcony" /></td>
						</tr>

						<tr>
							<td>Type:</td>
							<td><select name="heating">
									<option value="1">House</option>
									<option value="1">Apartment</option>
									<option value="1">Business Place</option>
									<option value="1">Garage</option>
							</select></td>
						</tr>

						<tr>
							<td>Entry date from:</td>
							<td><input type="text" id="address" name="floorFrom" /></td>
							<td>to:</td>
							<td><input type="text" id="address" name="floorTo" /></td>


						</tr>


						<tr>
							<td>Booked:</td>
							<td><input type="checkbox" id="address" name="booked" /></td>
						</tr>

						<tr>
							<td>Status:</td>
							<td><select name="status">
									<option value="1">Under Construction</option>
									<option value="2">Finished</option>
							</select></td>

						</tr>

						<tr>
							<td>Mode:</td>
							<td><select name="mode">
									<option value="1">Selling</option>
									<option value="2">Renting</option>
									<option value="2">Selling per m2</option>
									<option value="2">Renting per m2</option>
							</select></td>
						</tr>

					</table>

				</td>

			</tr>

			<tr>
				<td><h1>Tabela</h1></td>

			</tr>

			<tr>
				<td><input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/realEstate"%>'" name="action" value="Show" /> <input type="button"
					onclick="location.href = '<%=request.getContextPath() + "/Protected/editRealEstate"%>'" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /> <input type="submit" name="action"
					value="Close" /></td>
			</tr>
		</table>
	</form>


</body>
</html>