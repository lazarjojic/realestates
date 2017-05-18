<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
	$(function() {
		var createAllErrors = function() {
			var form = $(this);
			var errorList = $('ul.errorMessages', form);

			var showAllErrorMessages = function() {
				errorList.empty();

				//Find all invalid fields within the form.
				form.find(':invalid').each(
						function(index, node) {

							//Find the field's corresponding label
							var label = $('label[for=' + node.id + ']');

							//Opera incorrectly does not fill the validationMessage property.
							var message = node.validationMessage
									|| 'Invalid value.';
							errorList.show().append(
									'<li><span>' + label.html() + '</span> '
											+ message + '</li>');
						});
			};

			$('input[type=submit], button', form).on('click',
					showAllErrorMessages);
			$('input[type=text]', form).on('keypress', function(event) {
				//keyCode 13 is Enter
				if (event.keyCode == 13) {
					showAllErrorMessages();
				}
			});
		};

		$('form').each(createAllErrors);
	});
</script>



<style>
body {
	padding-top: 15px;
}

div {
	width: 400px;
}

label {
	display: inline-block;
	width: 100px;
	text-align: right;
	margin-bottom: 10px;
	margin-right: 3px;
}

input[type=text], textarea {
	width: 200px;
}

label[for=comments] {
	margin-bottom: 0;
}

textarea {
	height: 30px;
	vertical-align: middle;
}

.buttons {
	padding-top: 10px;
	text-align: center;
}

.errorMessages {
	display: none;
	list-style-type: disc;
	margin: 0 10px 15px 10px;
	padding: 8px 35px 8px 30px;
	color: #B94A48;
	background-color: #F2DEDE;
	border: 2px solid #EED3D7;
	border-radius: 4px;
	text-shadow: 0 1px 0 rgba(255, 255, 255, 0.5);
}

.errorMessages span {
	font-weight: bold;
}
</style>




</head>
<body>

	<h1>Login</h1>

	<form id="kreiranjenalogaforma" action="/realestates/login"
		method="post">

		<ul class="errorMessages"></ul>

		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" />
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" />
			</tr>
			<tr>
				<td></td>
				<input type="submit" name="login" />

			</tr>

		</table>

	</form>
</body>
</html>