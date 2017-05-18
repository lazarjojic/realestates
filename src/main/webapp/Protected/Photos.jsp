<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="/realestates/Protected/Photos" id="photosForm">
		<div>
			<input type="button" value="Previous" name="previous" /> <span>brojevi</span> <input type="button" value="Next" name="next" />


		</div>

		<input type="button" value="Close" name="close">




		<c:if test="${sessionScope.user.status != 'agent'}">
		
			Location: <input type="text" name="location" />
			<input type="submit" value="Browse" name="browse" />
			<input type="submit" value="Add" name="add" />

		</c:if>

	</form>




</body>
</html>