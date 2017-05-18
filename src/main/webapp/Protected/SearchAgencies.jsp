<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Agencies</title>
</head>
<body>
	<form action="<%= request.getContextPath() + "/Protected/searchAgencies"%>" method="post" id="searchAgenciesForm">

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
							<td><input type="text" id="pib" name="pib" /></td>
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
							<td><input type="submit" name="search" value="Search" /></td>
						</tr>

					</table>

				</td>

				<td>
					<div>Tablea</div>
				</td>

			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="action" value="Show" /> <input type="submit" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /> <input type="submit" name="action" value="Close" />
				</td>


			</tr>

		</table>

	</form>



</body>
</html>