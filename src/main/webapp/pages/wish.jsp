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
            background: url('<%=request.getContextPath()%>/images/children-593313_1280.jpg') no-repeat center center fixed;
            background-size: cover; /* Cover the whole screen */
            color: #fff; /* Set text color to white for contrast */
        }

h1 {
	font-size: 3rem;
	color: #333;
	text-align: center;
	padding: 2rem;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	margin-top: 10px;
}

button {
	padding: 1rem 1.5rem;
	font-size: 0.8rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 10px;
	cursor: pointer;
	margin-bottom: 400px;
}
</style>
</head>
<body>
<a href="/webapp"><button>Go Back</button> </a>
	<h1>${msg}</h1>
</body>
</html>