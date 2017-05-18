<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Real Estate</title>
</head>
<body>
	<form action="<%=request.getContextPath() + "/Protected/realEstate"%>" method="post" id="addagencyform">

		<table>

			<tr>

				<td>

					<table>
						<tr>
							<td>Price:</td>
							<td>Price:</td>
						</tr>

						<tr>
							<td>Area:</td>
							<td>Area</td>
						</tr>

						<tr>
							<td>Structure:</td>
							<td>Structure</td>
						</tr>

						<tr>
							<td>Location:</td>
							<td></td>
						</tr>

						<tr>
							<td>City:</td>
							<td>City</td>
						</tr>

						<tr>
							<td>Street:</td>
							<td>Street</td>
						</tr>

						<tr>
							<td>Number:</td>
							<td>Number</td>
						</tr>

						<tr>
							<td>Floor:</td>
							<td>Floor</td>
						</tr>

						<tr>
							<td>Heating:</td>
							<td>Heating</td>
						</tr>

						<tr>
							<td>Balcony:</td>
							<td>Balcony</td>
						</tr>

						<tr>
							<td>Type:</td>
							<td>Type</td>
						</tr>

						<tr>
							<td>Entry date:</td>
							<td>Entry date</td>
						</tr>

						<tr>
							<td>Booked:</td>
							<td>Booked</td>
						</tr>

						<tr>
							<td>Status:</td>
							<td>Status</td>
						</tr>

						<tr>
							<td>Mode:</td>
							<td>Mode</td>
						</tr>

						<tr>
							<td>Description:</td>
							<td>Description</td>
						</tr>

						<tr>
							<td>Rooms:</td>
							<td>Rooms</td>
						</tr>

						<tr>
							<td><input type="button" onclick="location.href = '/realestates/Protected/photos';" id="address" name="photos" value="Photos" /></td>
						</tr>

						<tr>
							<td><input type="button" onclick="location.href = '/realestates/Protected/documents';" id="address" name="documents" value="Documents" /></td>
						</tr>

						<tr>
							<td><input type="button" onclick="location.href = '/realestates/Protected/plan';" id="plan" name="plan" value="Plan" /></td>
						</tr>

						<tr>
							<td>Finance:</td>
							<td>Finance</td>
						</tr>

						<tr>
							<td>Conclusion:</td>
							<td>Conclusion</td>
						</tr>

						<tr>
							<td>Agency:</td>
							<td>Agency</td>
						</tr>

						<tr>
							<td>Agent:</td>
							<td>Agent</td>
						</tr>




					</table>

				</td>

				<td>

					<table>

						<tr>

							<td><h1>Tabela</h1></td>

						</tr>

						<tr>
							<td><input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/activity"%>'" name="action" value="Add" /> <input type="button"
								onclick="location.href = '<%=request.getContextPath() + "/Protected/activity"%>'" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /></td>
						</tr>



					</table>


				</td>

			</tr>
		</table>

		<input type="button" onclick="location.href = '<%=request.getContextPath() + "/Protected/editRealEstate"%>'" name="action" value="Edit" /> <input type="submit" name="action" value="Delete" /> <input type="submit"
			name="action" value="Close" />

	</form>
</body>
</html>