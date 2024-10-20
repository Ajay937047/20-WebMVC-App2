<%@page import="in.ashokit.binding.StudentRegistrationBinding"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<style>
h1 {
	font-size: 3rem;
	color: brown; /* Changed to brown */
	text-align: center;
	padding: 2rem;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	margin-top: 10px;
}

button {
	padding: 0.5rem 1rem;
	font-size: 0.8rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	margin-bottom: 18px;
}

.action-button {
	padding: 0.3rem 0.5rem;
	font-size: 0.7rem;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	margin: 0 2px;
}

table {
	width: 90%; /* Set the width of the table to 90% */
	height: 250px; /* Set the height of the table to 250 pixels */
	border: 2px solid #000; /* Add a 2px solid black border to the table */
	border-collapse: collapse;
	/* Collapse borders into a single border line */
	background-color: #f0f0f0; /* Set the background color of the table */
	margin: 0 auto; /* Center the table horizontally */
}

thead {
	background-color: orange;
	/* Set the background color of the table header */
}

tr {
	background-color: wheat;
	/* Set the background color of the table rows */
}

th {
	color: red; /* Set the text color of the table header cells to red */
	border: 1px solid #000;
	/* Add a 1px solid black border to table header cells */
	padding: 8px; /* Add padding inside table header cells */
}

td {
	border: 1px solid #000;
	/* Add a 1px solid black border to table cells */
	padding: 8px; /* Add padding inside table cells */
}
</style>

<head>
<meta charset="ISO-8859-1">
<title>STUDENT LIST</title>
<a href="/webapp/searching"><button>Go Back</button></a>
<a href="/webapp/welcome"><button>Go Student INFO</button></a>
</head>
<body style="background-color: blue;">
	<h1>STUDENT LIST</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Status</th>
				<th>Actions</th>
				<!-- New column for buttons -->
			</tr>
		</thead>
		<tbody>
			<%
			List<?> list = (List<?>) request.getAttribute("register_results");
			if (list != null && !list.isEmpty()) {
				for (Object obj : list) {
					String id = "";
					String name = "";
					String status = "";
					if (obj instanceof StudentRegistrationBinding) {
				StudentRegistrationBinding item = (StudentRegistrationBinding) obj;
				int stdId = item.getStudentid();
				id = Integer.toString(stdId);
				name = item.getStudentFirstName();
				status = item.getStudentAccStatus();
					}
			%>
			<tr>
				<td><%=id%></td>
				<td><%=name%></td>
				<td><%=status%></td>
				<td>
					<!-- Form to delete a student (GET method) -->
					<form action="/webapp/deleteStudent" method="get"
						style="display: inline;">
						<input type="hidden" name="studentId" value="<%=id%>">
						<button type="submit" class="action-button">Delete</button>
					</form> <!-- Form to change status of a student (GET method) -->
					<form action="/webapp/changeStatus" method="get"
						style="display: inline;">
						<input type="hidden" name="studentId" value="<%=id%>">
						<button type="submit" class="action-button">Change Status</button>
					</form>

				</td>
			</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td colspan="4">No data available</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>
