<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agency</title>
</head>
<body>

	<form action="/realestates/Protected/addAgency" method="post" id="addagencyform">

		<table>
			<tr>
				<td>Name:</td>
				<td>Name:</td>
			</tr>

			<tr>
				<td>PIB:</td>
				<td>PIB:</td>
			</tr>

			<tr>
				<td>Director:</td>
				<td>Director:</td>
			</tr>

			<tr>
				<td>Address:</td>
				<td>Address:</td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td>Phone:</td>
			</tr>


			<tr>
				<td><input type="submit" name="action" value="Edit" /></td>
				<td><input type="submit" name="action" value="Delete" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>

		</table>

	</form>

</body>
</html>