<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddRealEstate</title>
</head>
<body>
	<h1>Add/Edit Real Estate</h1>
	<hr>
	<h3>Real Estate Data</h3>


	<table>
		<tr>
			<td>
				<table>
					<tr>
						<td>Price:</td>						
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getPrice()}</td>
					</tr>
					<tr>
						<td>Area:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getArea()}</td>
					</tr>
					<tr>
						<td>Structure:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getStructure()}</td>
					</tr>
					<tr>
						<td>Location:</td>
					<tr>
						<td>City:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateAddressModel().getCity()}</td>
					</tr>
					<tr>
						<td>Street:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateAddressModel().getStreet()}</td>
					</tr>
					<tr>
						<td>Number:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateAddressModel().getNumber()}</td>
					</tr>
					<tr>
						<td>Floor:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateAddressModel().getFloor()}</td>
					</tr>
					<tr>
						<td>Heating:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getHeating()}</td>
					</tr>
					<tr>
						<td>Balcony:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getBalcony()}</td>
					</tr>
					<tr>
						<td>Type:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getType()}</td>
					</tr>
				</table>
			</td>

			<td>
				<table>
					<tr>
						<td>Booked:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getBooked()}</td>
					</tr>
					<tr>
						<td>Status:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getStatus()}</td>
					</tr>
					<tr>
						<td>Mode:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getMode()}</td>
					</tr>
					<tr>
						<td>Description:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getDescription()}</td>
					</tr>
					<tr>
						<td>Rooms:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getRooms()}</td>
					</tr>
					<tr>
						<td>Finance:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getFinance()}</td>
					</tr>
					<tr>
						<td>Agent:</td>
						<td>${sessionScope.realEstateWrapperModel.getRealEstateModel().getAgent()}</td>
					</tr>
				</table>
			</td>
		</tr>

	</table>
	<br />
	<br />
	<input type="button" onClick="location.href = '${pageContext.servletContext.contextPath}/protected/realEstate/realEstateData'" value="Enter Data" />

	<hr>
	<h3>Real Estate Photos</h3>

	<form:form action="${pageContext.servletContext.contextPath}/protected/realEstate/photos" method="POST" id="photosForm">

		<img alt="Image" src="${pageContext.servletContext.contextPath}/Files/profile_photo/rudar.jpg" style="width: 400px; height: 300px;" />
		<br />
		<br />
		<input type="submit" name="action" value="Previous" />
		<span>brojevi</span>
		<input type="submit" name="action" value="Next" />

		<br />
		<br />
		<input type="submit" name="action" value="Enter Photos" />
	</form:form>

	<hr>
	<h3>Real Estate Documents</h3>

	<form:form action="<%=request.getContextPath() + \"/Protected/documents\"%>" modelAttribute="documentsModel">
		<table id="listOfDocuments" border="1">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Description</th>
				<th>Date</th>
				<th>Location</th>
			</tr>

			<c:forEach var="item" items="${documents}">
				<tr>
					<td>${item.getName()}</td>
					<td>${item.getType()}</td>
					<td>${item.getDescription()}</td>
					<td>${item.getDate()}</td>
					<td>${item.getLocation()}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<br />
		<input type="submit" value="Enter Documents" name="edit" />
	</form:form>

</body>
</html>