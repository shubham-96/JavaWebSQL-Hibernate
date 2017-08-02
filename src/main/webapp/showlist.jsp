<%@page import="com.ideas.Employe"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="login.js"></script>
<title>Register table</title>
</head>
<body>
<div align="center" class="w3-pale-blue">

    <div align="left" class="w3-container w3-blue">
		<h2>Registered Employees</h2>
		<div class="w3-bar">
		<a class="w3-button w3-blue w3-hover-white" href="index.jsp">Home</a>
		<a class="w3-button w3-blue w3-disabled">Edit</a>
		</div>
	</div>
    
	<div class="w3-container" style="width:86%">
    <div class="w3-row">
        <div align="left" class="w3-col w3-white w3-text-grey" style="width:15%">
            <p style="margin-bottom:0px; margin-top:8px; padding-bottom:8px; padding-left:10px;">Search by:</p></div>
        <div class="w3-col" style="width:15%">
            <select id="filterkey" class="w3-select w3-text-grey w3-border-0" >
							<option disabled selected> -- select filter -- </option>
							<option id="Name">Name</option>
							<option id="CompanyEmployeeID">CompanyEmployeeID</option>
							<option id="Self">Self</option>
							<option id="Department">Department</option>
			</select>
        </div>
        <div align="left" class="w3-rest">
            <input class="w3-input w3-animate-input w3-border-0 w3-padding" style="width:25%" type="text" placeholder="Search by name" id="myInput" onkeyup="search()">
        </div>
    </div>
    <table id="myTable" class="w3-table w3-striped w3-hoverable"><br />
		<tr class="w3-pale-blue">
			<th>EmployeeID</th>
			<th>Name</th>
			<th>CompanyEmployeeID</th>
			<th>ContactNo</th>
			<th>Self</th>
			<th>Gender</th>
			<th>Department</th>
		</tr>
		<% ArrayList<Employe> empList = (ArrayList<Employe>)request.getAttribute("employeeList");

			for (Employe employe : empList){%>
				<tr><td><a href=""><%= employe.getEmployeeId() %></a></td>
				<td><%= employe.getName() %></td>
				<td><%= employe.getCompanyEmployeeID() %></td>
				<td><%= employe.getContactNumber() %></td>
				<td><%= employe.getSelf() %></td>
				<td><%= employe.getGender() %></td>
				<td><%= employe.getDepartment() %></td></tr>
			<%}
		%>
	</table>
	</div>
</div>
</body>
</html>
