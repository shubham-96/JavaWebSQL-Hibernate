<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- <link rel="stylesheet" href="style.css"> -->
<script src="login.js"></script>
</head>
<body class="w3-pale-blue">
<div align="center" class="w3-pale-blue">
	<div align="left" class="w3-padding w3-blue" style="position:fixed; width:100%; z-index:5">
		<h2>Register</h2>
		<div class="w3-bar">
		<a class="w3-button w3-blue w3-hover-white" href="index.jsp">Home</a>
		<a class="w3-button w3-blue w3-disabled">List</a>
		</div>
	</div>	
	<div align="left" class="w3-container" style="width:60%">
		<a><noscript>javascript is disabled!</noscript></a>
		<form action="EmployeeServlet" method="post"><br />
			<div class="w3-container w3-light-grey w3-leftbar w3-border-blue w3-padding-16" style="margin-top:120px">
			<p><label>Employee ID:</label>
			<input id="EmployeeID" class="w3-input" type="text" name="empID"></p>
			<input id="fetchEmployee" class="w3-button w3-blue w3-hover-white" style="float:right; position:relative; bottom:54px" type="button" onclick="loadDoc()" value="Fetch"><br /> 

			Name: <input id="username" class="w3-input" type="text" name="username"><br /> <br />

			Company Employee ID: <input id="CompanyEmployeeID" class="w3-input" type="text" name="compEmpID"><br /> <br />

			Department: <select required class="w3-select" name="department">
							<option disabled selected> -- select department -- </option>
							<option id="SD">SD</option>
							<option id="QA">QA</option>
							<option id="CARE">CARE</option>
							<option id="ROA">ROA</option>
							<option id="TECHOPS">TECHOPS</option>
						</select><br /> <br />

			Are you coming ? <input id="self" class="w3-check" type="checkbox" name="self"><br /><br />

			<div class="w3-row">
				<div class="w3-col" style="width:15%; position:relative; bottom:8px"><p>Gender: </p></div>
				<div class="w3-col" style="width:15%">
				<input class="w3-radio" id="genderM" type="radio" name="gender" value="MALE"> Male<br />
				</div><div class="w3-rest">
				<input class="w3-radio" id="genderF" type="radio" name="gender" value="FEMALE"> Female<br /><br />
				</div>
			</div>
			Mode of Travel (Arrival): <input class="w3-input" list="travelmode" name="travelmode_arrival">
				<datalist id="travelmode">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist><br /><br />

			Mode of Travel (Departure): <input class="w3-input" list="travelmode" name="travelmode_departure">
				<datalist id="travelmode">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist><br />
			
			<div class="w3-row">
				<div class="w3-col" style="width:15%; position:relative; bottom:5px"><p>Family: </p></div>
				<div class="w3-col" style="width:15%">
				<input class="w3-check" type="checkbox" name="spouse" value="Spouse"> Spouse<br />
				</div><div class="w3-rest">
				<input class="w3-check" type="checkbox" name="children" value="Children"> Children<br /> <br />
				</div>
			</div>
			
			Contact No. : <input id="contact" class="w3-input" type="text" name="contact"><br /><br />

			Additional Information (Optional): <br />
			<textarea class="w3-border-0" name="message" rows="5" cols="40">
		        </textarea><br /> <br />

		        <input class="w3-button w3-blue w3-hover-white" type="submit" name="Submit">
			<button class="w3-button w3-blue w3-hover-white" type="button" onclick="alert('JavaScript is enabled!')">Check JS</button>
			</div>
		</form>	
	<footer class="w3-panel"><p></p></footer>
	</div>
</div>
</body>
</html>
