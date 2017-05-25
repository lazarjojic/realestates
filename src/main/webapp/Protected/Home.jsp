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
	<nav>
	<ul class="nav">

		<c:if test="${sessionScope.user.status == 'admin'}">

			<li><a href="#">Accounts</a>
				<ul>
					<li><a href="<%=request.getContextPath() + "/Protected/account"%>">Create Account</a></li>
					<li><a href="<%=request.getContextPath() + "/searchAccounts"%>">Search Accounts</a></li>

				</ul></li>

			<li><a href="#">Agencies</a>
				<ul>
					<li><a href="<%=request.getContextPath() + "/Protected/addAgency"%>">Add Agency</a></li>
					<li><a href="<%=request.getContextPath() + "/Protected/searchAgencies"%>">Search Agencies</a>
				</ul></li>

			<li><a href="#">Real Estates</a>
		</c:if>
	</ul>

	<c:if test="${sessionScope.user.status != 'agent'}">
		<li><a href="/realestates/Protected/addRealEstate">Add Real Estate</a></li>
	</c:if>

	<li><a href="/realestates/Protected/searchRealEstates">Search Real Estates</a></li>

	<li><a href="<%=request.getContextPath() + "/Protected/profile"%>">Profile</a></li>
	<li><a href="#">Help</a></li>
	<li><a href="#">Logout</a></li>
	<li><a href="#">About</a></li>

	</ul>
	</nav>


</body>
</html>