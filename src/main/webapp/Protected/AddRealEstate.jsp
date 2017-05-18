<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddRealEstate</title>
</head>
<body>

	<form action="<%=request.getContextPath() + "/Protected/addRealEstate"%>" method="post" id="addRealEstateForm">

		<table>
			<tr>
				<td>
					<table>

						<tr>
							<td>Price:</td>
							<td><input type="text" name="price"></td>
						</tr>


						<tr>
							<td>Area:</td>
							<td><input type="text" id="pib" name="area"></td>
						</tr>


						<tr>
							<td>Structure:</td>
							<td><select name="structure">
									<option value="1">One room</option>
									<option value="1">Two rooms</option>
									<option value="1">Three rooms</option>
									<option value="1">Four rooms</option>
									<option value="1">More than four rooms</option>
							</select></td>
						</tr>


						<tr>
							<td>Location:</td>
						<tr>
							<td>City:</td>
							<td><input type="text" id="address" name="city" /></td>
						</tr>

						<tr>
							<td>Street:</td>
							<td><input type="text" id="address" name="street" /></td>
						</tr>

						<tr>
							<td>Number:</td>
							<td><input type="text" id="address" name="number" /></td>
						</tr>

						<tr>
							<td>Floor:</td>
							<td><input type="text" id="address" name="floor" /></td>
						</tr>

						<tr>
							<td>Heating:</td>
							<td><select name="heating">
									<option value="1">Central</option>
									<option value="1">Wood</option>
									<option value="1">Electric</option>
							</select></td>

						</tr>

						<tr>
							<td>Balcony:</td>
							<td><input type="checkbox" id="address" name="balcony" /></td>
						</tr>

						<tr>
							<td>Type:</td>
							<td><select name="heating">
									<option value="1">House</option>
									<option value="1">Apartment</option>
									<option value="1">Business Place</option>
									<option value="1">Garage</option>
							</select></td>
						</tr>
					</table>


				</td>


				<td>

					<table>
						<tr>
							<td>Booked:</td>
							<td><input type="checkbox" id="address" name="booked" /></td>
						</tr>

						<tr>
							<td>Status:</td>
							<td><select name="status">
									<option value="1">Under Construction</option>
									<option value="2">Finished</option>
							</select></td>

						</tr>

						<tr>
							<td>Mode:</td>
							<td><select name="mode">
									<option value="1">Selling</option>
									<option value="2">Renting</option>
									<option value="2">Selling per m2</option>
									<option value="2">Renting per m2</option>
							</select></td>
						</tr>

						<tr>
							<td>Description:</td>
							<td><input type="text" id="address" name="description" /></td>
						</tr>

						<tr>
							<td>Rooms:</td>
							<td><input type="text" id="address" name="rooms" /></td>
						</tr>

						<tr>
							<td>Photos:</td>
							<td><input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/photos"%>'" id="address" name="photos" /></td>
						</tr>

						<tr>
							<td>Documents:</td>
							<td><input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/documents"%>'" id="address" name="documents" /></td>
						</tr>

						<tr>
							<td>Plan:</td>
							<td><input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/plan"%>'" id="plan" name="plan" /></td>
						</tr>

						<tr>
							<td>Finance:</td>
							<td><input type="text" id="address" name="finance" /></td>
						</tr>

						<tr>
							<td>Agent:</td>
							<td><select name="mode">
									<option value="1">Selling</option>
									<option value="2">Renting</option>
									<option value="2">Selling per m2</option>
									<option value="2">Renting per m2</option>
							</select></td>
						</tr>


					</table>

				</td>

			</tr>

		</table>
	</form>

</body>
</html>