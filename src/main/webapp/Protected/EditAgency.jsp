<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath() + "/Protected/editAgency"%>" method="post" id="editAgencyForm">

		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" />
			</tr>

			<tr>
				<td>PIB:</td>
				<td><input type="text" id="pib" name="pib" />
			</tr>

			<tr>
				<td>Director:</td>
				<td><input type="text" id="director" name="director" />
			</tr>

			<tr>
				<td>Address:</td>
				<td><input type="text" id="address" name="address" />
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="text" id="phone" name="phone" />
			</tr>


			<tr>
				<td><input type="submit" name="action" value="Save" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>

		</table>

	</form>

</body>
</html>