<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Centered Content</title>
    <style>
        body {
            background-image: url('<%=request.getContextPath()%>/images/monitor-1307227_1280.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Full viewport height */
        }

        .content {
            text-align: center; /* Center text inside the content div */
            background-color: rgba(0, 0, 0, 0.5); /* Optional: Add a semi-transparent background for better readability */
            padding: 20px; /* Optional: Add some padding */
            border-radius: 10px; /* Optional: Add rounded corners */
        }

        button {
            padding: 0.5rem;
            font-size: 1rem;
            background-color: #ff0000;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 20px; /* Add some space above the button */
        }
    </style>
</head>
<body>
    <div class="content">
        <h1>RESULT :</h1>
        <h1>${calculateresults}</h1>
        <a href="/webapp/calculator"><button>CALCULATOR</button></a>
    </div>
</body>
</html>