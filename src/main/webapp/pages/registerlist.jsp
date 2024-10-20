<%@page import="java.sql.Date"%>
<%@page import="in.ashokit.entity.StudentRegistrationEntity"%>
<%@page import="in.ashokit.entity.StudentEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
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

table {
    width: 90%; /* Set the width of the table to 90% */
    height: 250px; /* Set the height of the table to 250 pixels */
    border: 2px solid #000; /* Add a 2px solid black border to the table */
    border-collapse: collapse; /* Collapse borders into a single border line */
    background-color: #f0f0f0; /* Set the background color of the table */
    margin: 0 auto; /* Center the table horizontally */
}
thead {
    background-color: orange; /* Set the background color of the table header */
}
tr {
    background-color: wheat; /* Set the background color of the table rows */
}
th {
    color: red; /* Set the text color of the table header cells to red */
    border: 1px solid #000; /* Add a 1px solid black border to table header cells */
    padding: 8px; /* Add padding inside table header cells */
}
td {
    border: 1px solid #000; /* Add a 1px solid black border to table cells */
    padding: 8px; /* Add padding inside table cells */
}
</style>

<head>
    <meta charset="ISO-8859-1">
    <title>STUDENT LIST</title>
    <a href="/webapp/welcome"><button>Go Back</button></a>
</head>
<body>
    <h1>REGISTER STUDENT LIST</h1>
    <table border="1">
        <thead>
            <tr>
                <th>STUDENT ID</th>
                <th>STUDENT NAME</th>
                <th>EMAIL ID</th>
                <th>CONTACT NO</th>
                <th>DATE OF BIRTH</th>
              
                
                
            </tr>
        </thead>
        <tbody>
            <%
                List<?> list = (List<?>) request.getAttribute("registerlist");
                if (list != null && !list.isEmpty()) {
                    for (Object obj : list) {
                        // Assuming obj is an object with fields id, name, and location
                        String id = "";
                        String fullname = "";
                        String email="";
                        Long phno=null;
                        Date dob=null;
                        String status="";
                        if (obj instanceof StudentRegistrationEntity) {
                        	StudentRegistrationEntity item = (StudentRegistrationEntity) obj;
                        	int stdId = item.getStudentid();
                            id = Integer.toString(stdId);
                            fullname = item.getStudentFirstName()+" "+item.getStudentLastName();
                            email=item.getStudentEmail();
                            phno=item.getStudentphno();
                            dob=item.getStudentDateOfBirth();
                            status=item.getStudentAccStatus();
                        }
            %>
                        <tr>
                            <td><%= id %></td>
                            <td><%= fullname %></td>
                            <td><%= email %></td>
                            <td><%= phno %></td>
                            <td><%= dob %></td>
                           
                        </tr>
            <%
                    }
                } else {
            %>
                <tr>
                    <td colspan="3">No data available</td>
                </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>