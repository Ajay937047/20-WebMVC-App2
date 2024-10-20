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
            background: url('<%=request.getContextPath()%>/images/water-lily-3784022_1280.jpg') no-repeat center center fixed;
            background-size: cover; /* Cover the whole screen */
            color: #fff; /* Set text color to white for contrast */
        }

h1 {
	font-size: 3rem;
	color: #333;
	text-align: center;
	padding: 1.5rem;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	margin-top: 10px;
}

button {
	padding: 1rem 1.5rem;
	font-size: 1rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 10px;
	margin-bottom: 400px;
}
</style> 
   
</head>
<body>
    <div class="content">
     <a href="/webapp"><button>Go Back</button></a>
        <h1>${greetMsg}</h1>
    </div>
</body>
</html>