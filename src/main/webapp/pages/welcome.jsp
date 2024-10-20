<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background:
		url('<%=request.getContextPath()%>/images/monitor-1307227_1280.jpg')
		no-repeat center center fixed;
	background-size: cover; /* Cover the whole screen */
	color: #fff; /* Set text color to white for contrast */
}

h1 {
	font-size: 3rem;
	color: #333;
	text-align: center;
	padding: 0.5rem;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(2, 2, 2, 0.1);
	margin-top: 170px;
}

.button1 {
	background-color: red;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.button2 {
	background-color: blue;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>
	<a href="/webapp">
		<button class="button1">Go Back</button>
	</a>

	<h1>${welcomeMsg}</h1>

	<!-- 	<a href="courses">
		<button class="button2">Course Content</button>
	</a> -->

	<a href="register"><button
			style="background-color: #E74C3C; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"
			onmouseover="this.style.backgroundColor='#C0392B';"
			onmouseout="this.style.backgroundColor='#E74C3C';">REGISTRATION
			HERE</button></a>
	<a href="registerlist"><button
			style="background-color: #E74C3C; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"
			onmouseover="this.style.backgroundColor='#C0392B';"
			onmouseout="this.style.backgroundColor='#E74C3C';">REGISTR
			STUDENT LIST</button></a>
	<a href="calculator"><button
			style="background-color: #E74C3C; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"
			onmouseover="this.style.backgroundColor='#C0392B';"
			onmouseout="this.style.backgroundColor='#E74C3C';">CALCULATOR</button></a>
	<a href="searching"><button
			style="background-color: #E74C3C; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"
			onmouseover="this.style.backgroundColor='#C0392B';"
			onmouseout="this.style.backgroundColor='#E74C3C';">STATUS
			SEARCH</button></a>



</body>
</html>
