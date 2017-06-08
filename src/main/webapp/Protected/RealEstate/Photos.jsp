<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="<%=request.getContextPath() + \"/protected/realEstate/photos\"%>" method="post" enctype="multipart/form-data" id="photosForm">
		<img alt="Image" src="${pageContext.servletContext.contextPath}/Files/profile_photo/rudar.jpg" style="width: 400px; height: 300px;">
		<br />
		<br />
		<input type="submit" name="previous" value="Previous">
		<span>brojevi</span>
		<input type="submit" name="previous" value="Next">
		<input type="submit" name="previous" value="Delete">

		<br />
		<br />
		<c:if test="${sessionScope.user.status != 'agent'}">
		
		File:
            <input type="file" name="file" id="file" />
			<br />
		
			Location: <input type="text" name="location" />
			<input type="submit" name="browse" value="Browse" />
			<input type="submit" name="action" value="Add" />

		</c:if>
		<br />
		<br />

		<input type="submit" name="action" value="Close">
		<input type="submit" name="action" value="Save">

	</form:form>




</body>
</html>