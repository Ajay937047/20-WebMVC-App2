<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<div style="text-align: right;">
	<a href="/webapp/welcome"
		style="display: inline-block; margin-right: 10px;"><button>Go
			Back</button></a> <a href="/webapp" style="display: inline-block;"><button>HOME
			PAGE</button></a>
</div>

<meta charset="UTF-8">
<title>Search form</title>
<style>
body {
	background-image:
		url('<%=request.getContextPath()%>/images/monitor-1307227_1280.jpg');
	/* Replace 'path_to_your_image.jpg' with the actual path to your image */
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
	background-color: rgba(0, 0, 0, 0.5);
	
	/* Add a semi-transparent black background color */
}

.registration-heading {
	text-align: center;
	color: red;
	
}

.input-field {
    width: 10%; /* Adjust the input field width */
    box-sizing: border-box; /* Ensures padding is included in width */
     background-color: #f0f0f0;
     border: 2px solid #000;
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

label {
    display: inline-block;
    width: 120px; /* Adjust to the desired label width */
    text-align: right; /* Aligns the label text to the right */
    margin-right: 1px; /* Adds space between the label and the input field */
    margin-bottom: 100px;
    border: 3px solid #000;
     background-color: #add8e6;
     color: #000;
}
</style>
</head>
<body>

	<div class="search-container">
		<h2 class="search-heading">Searching Status</h2>
		<form:form action="search" modelAttribute="search" method="POST">
			<label for="studentAccStatus">Student Status:</label>
			<input type="text" id="studentAccStatus" name="studentAccStatus"
				class="input-field" required>
			<input type="submit" value="Search">
		</form:form>
	</div>

</body>
</html>
