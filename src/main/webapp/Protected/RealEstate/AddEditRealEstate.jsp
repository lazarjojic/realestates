<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddRealEstate</title>
</head>
<body>

	<form:form action="<%=request.getContextPath() + \"/Protected/addRealEstate\"%>" method="post" path="addEditRealEstateForm" modelAttribute="realEstateModel">

		<table>
			<tr>
				<td>
					<table>

						<tr>
							<td>Price:</td>
							<td><form:input path="price" value="${realEstate.getPrice()}" /></td>
						</tr>


						<tr>
							<td>Area:</td>
							<td><form:input path="area" value="${realEstate.getArea()}" /></td>
						</tr>


						<tr>
							<td>Structure:</td>
							<td><form:select path="structure">
									<form:option value="1">One room</form:option>
									<form:option value="2">Two rooms</form:option>
									<form:option value="3">Three rooms</form:option>
									<form:option value="4">Four rooms</form:option>
									<form:option value="5">More than four rooms</form:option>
								</form:select></td>
						</tr>


						<tr>
							<td>Location:</td>
						<tr>
							<td>City:</td>
							<td><form:input path="city" value="${realEstate.getCity()}" /></td>
						</tr>

						<tr>
							<td>Street:</td>
							<td><form:input path="street" value="${realEstate.getStreet()}" /></td>
						</tr>

						<tr>
							<td>Number:</td>
							<td><form:input path="number" value="${realEstate.getNumber()}" /></td>
						</tr>

						<tr>
							<td>Floor:</td>
							<td><form:input path="floor" value="${realEstate.getFloor()}" /></td>
						</tr>

						<tr>
							<td>Heating:</td>
							<td><form:select path="heating">
									<form:option value="1">Central</form:option>
									<form:option value="2">Wood</form:option>
									<form:option value="3">Electric</form:option>
								</form:select></td>
						</tr>

						<tr>
							<td>Balcony:</td>
							<td><form:checkbox path="balcony" value="${realEstate.getBalcony()}" /></td>
						</tr>

						<tr>
							<td>Type:</td>
							<td><form:select path="type">
									<form:option value="house">House</form:option>
									<form:option value="apartment">Apartment</form:option>
									<form:option value="businessPlace">Business Place</form:option>
									<form:option value="garage">Garage</form:option>
								</form:select></td>
						</tr>
					</table>


				</td>


				<td>

					<table>
						<tr>
							<td>Booked:</td>
							<td><form:checkbox path="booked" /></td>
						</tr>

						<tr>
							<td>Status:</td>
							<td><form:select path="status">
									<form:option value="underContraction">Under Construction</form:option>
									<form:option value="finished">Finished</form:option>
								</form:select></td>

						</tr>

						<tr>
							<td>Mode:</td>
							<td><form:select path="mode">
									<form:option value="selling">Selling</form:option>
									<form:option value="renting">Renting</form:option>
									<form:option value="sellingPerM2">Selling per m2</form:option>
									<form:option value="rentingPerM2">Renting per m2</form:option>
								</form:select></td>
						</tr>

						<tr>
							<td>Description:</td>
							<td><form:textarea path="description" value="${realEstate.getDescription()}" /></td>
						</tr>

						<tr>
							<td>Rooms:</td>
							<td><form:input path="rooms" value="${realEstate.getRooms()}" /></td>
						</tr>

						<tr>
							<td />
							<td><input type="button" onClick="location.href = '<%=request.getContextPath() + "/Protected/RealEstate/photos"%>'" value="Photos"/></td>
						</tr>

						<tr>
							<td />
							<td><input type="button" onClick="location.href = '<%=request.getContextPath() + "/Protected/RealEstate/documents"%>'" value="Documents" /></td>
						</tr>

						<tr>
							<td />
							<td><input type="button" onClick="location.href = '<%=request.getContextPath() + "/Protected/RealEstate/plan"%>'" value="Plan" /></td>
						</tr>

						<tr>
							<td>Finance:</td>
							<td><form:input path="finance" value="${realEstate.getFinance()}" /></td>
						</tr>

						<tr>
							<td>Agent:</td>
							<td><form:select path="mode">
									<form:option value="1">Agent1</form:option>
									<form:option value="2">Agent1</form:option>
									<form:option value="2">Agent1</form:option>
									<form:option value="2">Agent1</form:option>
								</form:select></td>
						</tr>

					</table>
				</td>
			</tr>

			<tr>
				<td><input type="submit" name="action" value="Save" /></td>
				<td><input type="submit" name="action" value="Close" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>