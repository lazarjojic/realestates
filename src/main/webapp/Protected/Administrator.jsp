<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

		<li><a href="#">Accounts</a>
			<ul>
				<li><a href="/realestates/Protected/createAccount">Create Account</a></li>
				<li><a href="/realestates/searchAccounts">Search Accounts</a></li>

			</ul></li>
		<li><a href="#">Real Estates</a>
			<ul>
				<li><a href="/realestates/Protected/addRealEstate">Add Real Estate</a></li>
				<li><a href="/realestates/Protected/searchRealEstates">Search Real Estates</a>
			</ul></li>
		<li><a href="#">Agencies</a>
			<ul>
				<li><a href="/realestates/Protected/addAgency">Add Agency</a></li>
				<li><a href="/realestates/Protected/searchAgencies">Search Agencies</a>
			</ul></li>
		<li><a href="#">Profile</a></li>
		<li><a href="#">Help</a></li>
		<li><a href="#">Logout</a></li>
		<li><a href="#">About</a></li>

	</ul>
	</nav>



	<!-- 	<div class="topnav"> -->
	<!-- 		<a class="active" href="#korisnici">Korisnici</a> -->
	<!-- 		<ul> -->
	<!-- 			<li>Coffee</li> -->
	<!-- 			<li>Tea</li> -->
	<!-- 			<li>Milk</li> -->
	<!-- 		</ul> -->

	<!-- 		<a href="#agencije">Agencije</a> <a href="#nekretnine">Nekretnine</a> -->
	<!-- 		<a href="#profil">Profil</a> <a href="#pomoc">Pomoc</a> <a -->
	<!-- 			href="#odjava">Odjava</a> <a href="#about">About</a> -->
	<!-- 	</div> -->

	<!-- 	<div style="padding-left: 16px"> -->
	<!-- 		<h2>Top Navigation Example</h2> -->
	<!-- 		<p>Some content..</p> -->
	<!-- 	</div> -->

</body>
</html>