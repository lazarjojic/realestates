<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>

	<h1>Change password</h1>

	<form id="changePasswordForm" action="<%=request.getContextPath() + "/Protected/changePassword"%>" method="post">

		<table>
			<tr>
				<td>Old password:</td>
				<td><input type="text" name="oldPassword" />
			</tr>
			<tr>
				<td>New password:</td>
				<td><input type="text" name="newPassword" />
			</tr>
			<tr>
				<td>Confirm new password:</td>
				<td><input type="text" name="confirmNewPassword" />
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Save" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>
		</table>

	</form>

</body>
</html>