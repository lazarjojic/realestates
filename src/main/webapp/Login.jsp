<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>


	<form:form action="/realestates/login" modelAttribute="login" method="POST">
	
		<form:errors path="*" cssClass="errorblock" element="div" />
		<label for="textinput1">Username:</label>
		<form:input path="username" cssErrorClass="error" />
		<br>
		<form:errors path="username" cssClass="error" />
		<br>
		<label for="textinput2">Password:</label>
		<form:input path="password" cssErrorClass="error" />
		<br>
		<form:errors path="password" cssClass="error" />
		<br>
		<input type="submit" name="login" class="btn" value="Login" />
	</form:form>





</body>
</html>