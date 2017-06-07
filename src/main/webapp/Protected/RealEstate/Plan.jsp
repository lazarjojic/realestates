<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plan</title>
</head>
<body>

	<form>
		<table>
			<tr>
				<td>
					<table>

						<tr>
							<td><img alt="govno" src="../Pictures/bijelakuca.jpg" style="width: 400px; height: 300px;"></td>

							<%-- 								src="<c:url value="/Pictures/bijelakuca.jpg" />" --%>
						</tr>
						<tr>
							<td><input type="submit" value="Previous" name="positionPrevious" /></td>
							<td>Numbers</td>
							<td><input type="submit" value="Next" name="positionNext" /></td>
						</tr>

						<c:if test="${sessionScope.user.status != 'agent'}">
							<tr>
								<td>Path:</td>
								<td><input type="text" name="positionPath" /></td>
								<td><input type="submit" value="Browse" name="positionBrowse" /></td>
								<td><input type="submit" value="Add" name="positionAdd" /></td>
							</tr>
						</c:if>
					</table>

				</td>


				<td>
					<table>
						<tr>
							<td><img alt="" src="..Pictures/whitehouse.jpg" style="width: 400px; height: 300px;"></td>
						</tr>
						<tr>
							<td><input type="submit" value="Previous" name="sketchPrevious" /></td>
							<td>Numbers</td>
							<td><input type="submit" value="Next" name="sketchNext" /></td>
						</tr>

						<c:if test="${sessionScope.user.status != 'agent'}">
							<tr>
								<td>Path:</td>
								<td><input type="text" name="sketchPath" /></td>
								<td><input type="submit" value="Browse" name="sketchBrowse" /></td>
								<td><input type="submit" value="Add" name="sketchAdd" /></td>
							</tr>
						</c:if>

					</table>
				</td>
			</tr>

			<tr>
				<td><input type="submit" value="Close" name="close" /></td>
			</tr>



		</table>




	</form>

</body>
</html>