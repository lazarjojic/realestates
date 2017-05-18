<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Activity</title>
</head>
<body>
	<h1>Add/Edit Activity</h1>


	<form action="<%=request.getContextPath() + "/Protected/activity"%>" method="post" id="activityForm">

		<table>
			<tr>
				<td>Date:</td>
				<td><input type="text" name="date" />
			</tr>

			<tr>
				<td>Time:</td>
				<td><input type="text" id="pib" name="time" />
			</tr>

			<tr>
				<td>Agent:</td>
				<td><input type="text" id="director" name="director" />
			</tr>

			<tr>
				<td>Client:</td>
				<td><input type="text" id="address" name="client" />
			</tr>

			<tr>
				<td>Note:</td>
				<td><input type="text" id="phone" name="note" />
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Add" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>
		</table>

	</form>

</body>
</html>