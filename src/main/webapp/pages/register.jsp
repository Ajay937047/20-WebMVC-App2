<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<div style="text-align: right;">
    <a href="/webapp/welcome" style="display: inline-block; margin-right: 10px;"><button>Go Back</button></a>
    <a href="/webapp" style="display: inline-block;"><button>HOME PAGE</button></a>
</div>

<meta charset="UTF-8">
<title>Student Registration Form</title>
<style>
body {
    background-image: url('<%=request.getContextPath()%>/images/monitor-1307227_1280.jpg'); /* Replace 'path_to_your_image.jpg' with the actual path to your image */
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    color: #fff; /* Set text color to white for contrast */
}

.registration-container {
	width: 600px;
	margin: 0 auto;
	padding: 20px;
	border: 2px solid #ccc;
	border-radius: 10px;
	background-color: rgba(0, 0, 0, 0.5); /* Add a semi-transparent black background color */
}

.registration-heading {
	text-align: center;
}

.input-field {
	width: 100%;
	padding: 8px;
	margin: 5px 0;
	box-sizing: border-box;
}

button {
	padding: 0.5rem;
	font-size: 1rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	margin-bottom: 20px;
}

input[type="submit"] {
    background-color: red; /* Set submit button background to red */
    color: white; /* Set submit button text color to white */
    padding: 10px 20px; /* Add padding for a larger button */
    border: none; /* Remove default border */
    border-radius: 5px; /* Add border radius for rounded corners */
    cursor: pointer; /* Add pointer cursor on hover */
}

input[type="submit"]:hover {
    background-color: darkred; /* Darker red on hover */
}
</style>
</head>
<body>

	<div class="registration-container">
		<h2 class="registration-heading">Student Registration Form</h2>
		<form:form action="registration" modelAttribute="registration"
			method="POST">

			<!-- <label for="studentid">ID:</label>
			<input type="text" id="studentid" name="studentid"
				class="input-field" required>
			<br> -->

			<label for="studentFirstName">First Name:</label>
			<input type="text" id="studentFirstName" name="studentFirstName"
				class="input-field" required>
			<br>

			<label for="studentLastName">Last Name:</label>
			<input type="text" id="studentLastName" name="studentLastName"
				class="input-field" required>
			<br>

			<label for="studentEmail">Email:</label>
			<input type="email" id="studentEmail" name="studentEmail"
				class="input-field" required>
			<br>

			<label for="studentphno">Phone Number:</label>
			<input type="tel" id="studentphno" name="studentphno"
				class="input-field" required>
			<br>

			<label for="studentDateOfBirth">Date of Birth:</label>
			<input type="date" id="studentDateOfBirth" name="studentDateOfBirth"
				class="input-field" required>
			<br>

			<label for="studentGender">Gender:</label>
			<select id="studentGender" name="studentGender" class="input-field"
				required>
				<option value="Male">Male</option>
				<option value="Female">Female</option>
				<option value="Other">Other</option>
			</select>
			<br>

			<label for="studentCountry">Country:</label>
			<input type="number" id="studentCountry" name="studentCountry"
				class="input-field" required>
			<br>

			<label for="studentState">State:</label>
			<input type="number" id="studentState" name="studentState"
				class="input-field" required>
			<br>

			<label for="studentCity">City:</label>
			<input type="number" id="studentCity" name="studentCity"
				class="input-field" required>
			<br>

			<input type="submit" value="Register">
		</form:form>
	</div>

</body>
</html>
