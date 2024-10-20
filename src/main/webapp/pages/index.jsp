<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<a href="/webapp/logout"><button>Logout</button></a>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: url('<%=request.getContextPath()%>/images/engineer-8499904_1280.jpg') no-repeat center center fixed;
            background-size: cover; /* Cover the whole screen */
            color: #fff; /* Set text color to white for contrast */
        }

.welcome-container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

h1 {
	font-size: 3rem;
	color: #333;
	text-align: center;
	padding: 1rem;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	margin-top: 10px;
}

button {
	padding: 1rem 1rem;
	font-size: 1rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	margin-bottom: 300px;
}
</style>
<body>

	<h1>WELCOME TO SPRING BOOT AND MICROSERVICES</h1>

	<a href="welcome"><button>STUDENT INFO</button></a>
	
	<a href="greet"><button>GREET MSG</button></a>
	<a href="wish"><button>WISH MSG</button></a>

	<a href="studentlist"><button>STUDENT LIST</button></a>
	<a href="videos"><button>18 JRTP VIDEO</button></a>
	
	 <a href="https://www.youtube.com/" target="_blank"><button>Go to YouTube</button></a>


</body>
</html>