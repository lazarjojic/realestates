<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	margin: 0;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<c:if test="${sessionScope.user.status == 'admin'}">
		<ul class="nav">
			<li>Accounts
				<ul>
					<li><a href="<%=request.getContextPath() + "/protected/user/addEditAccount"%>">Create Account</a></li>
					<li><a href="<%=request.getContextPath() + "/protected/user/searchAccounts"%>">Search Accounts</a></li>

				</ul>
			</li>

			<li>Agencies
				<ul>
					<li><a href="<%=request.getContextPath() + "/protected/agency/addEditAgency"%>">Add Agency</a></li>
					<li><a href="<%=request.getContextPath() + "/protected/agency/searchAgencies"%>">Search Agencies</a></li>
				</ul>
			</li>
		</ul>
	</c:if>

	<c:if test="${sessionScope.user.status != 'agent'}">
		<ul>
			<li>Real Estates
				<ul>
					<li><a href="<%=request.getContextPath() + "/protected/realEstate/addEditRealEstate"%>">Add Real Estate</a></li>
					<li><a href="<%=request.getContextPath() + "/protected/realEstate/searchRealEstates"%>">Search Real Estates</a></li>
				</ul>
			</li>
		</ul>
	</c:if>

	<c:if test="${sessionScope.user.status == 'agent'}">
		<ul>
			<li><a href="<%=request.getContextPath() + "/protected/realEstate/searchRealEstates"%>">Search Real Estates</a></li>
		</ul>
	</c:if>

	<ul>
		<li><a href="<%=request.getContextPath() + "/protected/user/profile"%>">Profile</a></li>
		<li><a href="#">Help</a></li>
		<li><a href="#">Logout</a></li>
		<li><a href="#">About</a></li>
	</ul>


</body>
</html>