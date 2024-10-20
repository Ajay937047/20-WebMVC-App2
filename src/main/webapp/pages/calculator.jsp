<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .calculator {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            text-align: center;
        }
        .calculator h1 {
            color: #333;
        }
        .calculator form {
            margin-top: 20px;
        }
        .calculator input[type="number"] {
            width: 100px;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-right: 10px;
        }
        .calculator button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .calculator button:hover {
            background-color: #45a049;
        }
    </style>
</head>
</head>
<body>
    <div class="calculator">
        <h1>Calculator</h1>
        <form action="/webapp/add" method="get">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <button type="submit">Add</button>
        </form>
        <form action="/webapp/subtract" method="get">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <button type="submit">Subtract</button>
        </form>
        <form action="/webapp/multiply" method="get">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <button type="submit">Multiply</button>
        </form>
        <form action="/webapp/divide" method="get">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <button type="submit">Divide</button>
        </form>
    	<a href="/webapp/welcome"><button style="background-color:#E74C3C;color:white;padding:10px 20px;border:none;border-radius:5px;cursor:pointer;" onmouseover="this.style.backgroundColor='#C0392B';" onmouseout="this.style.backgroundColor='#E74C3C';">BACK</button></a>
    </div>
</body>
</html>