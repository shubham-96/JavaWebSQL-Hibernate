<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style.css">
<script src="login.js"></script>
</head>
<body>
<div align="center">
	<div align="left" class="w3-blue" style="position:fixed; width:100%; z-index:5; padding-left:16px; padding-top:8px">
		<h2>Register</h2>
		<div class="w3-bar">
		<a class="w3-button w3-blue w3-hover-white" href="index.jsp">Home</a>
		<a class="w3-button w3-blue w3-disabled">List</a>
		</div>
	</div>		

	<div align="left" class="w3-container w3-light-grey w3-leftbar w3-border-blue w3-hover-shadow" style="width:70%; position:relative; top:150px">
		<a><noscript>javascript is disabled!</noscript></a>
		<form action="EmployeeServlet" method="post"><br />
		<table id="showlist">
			<tr>
				<th><p>Company Employee ID : </p></th>
				<td><input id="CompanyEmployeeID" class="w3-input w3-border-0" type="text" name="comEmpID"></td>
			</tr>
			<tr>
				<th><p>Employee ID : </p></th>
				<td><input id="EmployeeID" class="w3-input w3-border-0" type="text" name="empID"></td>
				<td id="fetchbutton"><input id="fetchEmployee" class="w3-button w3-white w3-hover-blue" type="button" onclick="loadDoc()" value="Fetch Details"></td>
			</tr>
			<tr>
				<th><p>Name : </p></th>
				<td colspan="2"><input id="username" class="w3-input w3-border-0" type="text" name="username"></td>
			</tr>
			<tr>
				<th><p>Department: </p></th>
				<td colspan="2"><select required class="w3-select w3-border-0" name="department">
					<option disabled selected> -- select department -- </option>
					<option id="SD">SD</option>
					<option id="QA">QA</option>
					<option id="CARE">CARE</option>
					<option id="ROA">ROA</option>
					<option id="TECHOPS">TECHOPS</option>
				</select></td>
			</tr>
			<tr>
				<th><p>Are you coming ? </p></th>
				<td colspan="2"><input id="self" class="w3-check" type="checkbox" name="self"></td>
			</tr>
			<tr>
				<th><p>Gender: </p></th>
				<td colspan="2"><input class="w3-radio" id="genderM" type="radio" name="gender" value="MALE"> Male
				<input class="w3-radio" id="genderF" type="radio" name="gender" value="FEMALE"> Female</td>
			</tr>
			<tr>
				<th><p>Mode of Travel: <br />(Arrival) </p></th>
				<td colspan="2"><input class="w3-input w3-border-0" list="travelmode_arrival" name="travelmode_arrival">
				<datalist id="travelmode_arrival">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist></td>
			</tr>
			<tr>
				<th><p>Mode of Travel: <br />(Departure) </p></th>
				<td colspan="2"><input class="w3-input w3-border-0" list="travelmode_departure" name="travelmode_departure">
				<datalist id="travelmode_departure">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist></td>
			</tr>
			<tr>
				<th><p>Family: </p></th>
				<td><div class="w3-row">
					<div class="w3-col" style="width:15%">
					<input class="w3-check" type="checkbox" name="spouse" value="Spouse"> Spouse<br />
					</div><div class="w3-rest">
					<input class="w3-check" type="checkbox" name="children" value="Children"> Children<br /> <br />
					</div>
				</div></td>
			</tr>
			<tr>
				<th><p>Contact No. : </p></th>
				<td colspan="2"><input id="contact" class="w3-input w3-border-0" type="text" name="contact"></td>
			</tr>
			<tr>
				<th><p>Additional Information: <br />(Optional) </p></th>
				<td colspan="2"><textarea class="w3-border-0" name="message" rows="5" cols="40"></textarea></td>
			</tr>
			<tr>
				<th></th>
				<td><input class="w3-button w3-white w3-hover-blue" type="submit" name="Submit">
				<button class="w3-button w3-white w3-hover-blue" type="button" onclick="alert('JavaScript is enabled!')">Check JS</button></td>
			</tr>
		</table>
		</form>
	<!-- <div align="left" class="w3-container" style="width:70%; position:relative; top:150px">	
		<div class="w3-cell-row">

		<form action="EmployeeServlet" method="post"><br />
			<div align="right" class="w3-container w3-cell w3-leftbar w3-border-blue w3-padding-16" style="width:20%">
				<p style="position:relative; bottom:7px">Employee ID: </p><br /><br />

				<p style="position:relative; bottom:25px">Name: </p><br />

				<p style="position:relative; bottom:17px">Company Employee ID: </p><br />

				<p style="position:relative; bottom:7px">Department: </p><br />

				<p style="position:relative; bottom:22px">Are you coming ? </p><br />

				<p style="position:relative; bottom:45px">Gender: </p>

				<p style="position:relative; bottom:25px">Mode of Travel (Arrival): </p>

				<p>Mode of Travel (Departure): </p><br />

				<p>Family: </p><br />

				<p>Contact No. : </p><br />

				<p>Additional Information (Optional): </p><br />
			</div>
			<div class="w3-container w3-cell w3-padding-16" style="width:80%">

				<input id="EmployeeID" class="w3-input" type="text" name="empID">

				<input id="fetchEmployee" class="w3-button w3-white w3-hover-blue" style="float:right; position:relative; bottom:39.5px" type="button" onclick="loadDoc()" value="Fetch Details"><br />

				<input id="username" class="w3-input" type="text" name="username"><br /><br />

				<input id="CompanyEmployeeID" class="w3-input" type="text" name="compEmpID"><br /> <br />

				<select required class="w3-select" name="department">
					<option disabled selected> -- select department -- </option>
					<option id="SD">SD</option>
					<option id="QA">QA</option>
					<option id="CARE">CARE</option>
					<option id="ROA">ROA</option>
					<option id="TECHOPS">TECHOPS</option>
				</select><br /> <br />

				<input id="self" class="w3-check" type="checkbox" name="self"><br /><br />

				<div class="w3-row">
					<div class="w3-col" style="width:15%">
					<input class="w3-radio" id="genderM" type="radio" name="gender" value="MALE"> Male<br />
					</div><div class="w3-rest">
					<input class="w3-radio" id="genderF" type="radio" name="gender" value="FEMALE"> Female<br />
					</div><br />
				</div>

				<input class="w3-input" list="travelmode" name="travelmode_arrival">
				<datalist id="travelmode">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist><br /><br />

				<input class="w3-input" list="travelmode" name="travelmode_departure">
				<datalist id="travelmode">
					<option value="CAR">
					<option value="TRAIN">
					<option value="PLANE">
					<option value="BUS">
				</datalist><br />

				<div class="w3-row">
					<div class="w3-col" style="width:15%">
					<input class="w3-check" type="checkbox" name="spouse" value="Spouse"> Spouse<br />
					</div><div class="w3-rest">
					<input class="w3-check" type="checkbox" name="children" value="Children"> Children<br /> <br />
					</div>
				</div>

				<input id="contact" class="w3-input" type="text" name="contact"><br /><br />

				<textarea class="w3-border-0" name="message" rows="5" cols="40">
		        </textarea><br /> <br />

				<input class="w3-button w3-white w3-hover-blue" type="submit" name="Submit">
				<button class="w3-button w3-white w3-hover-blue" type="button" onclick="alert('JavaScript is enabled!')">Check JS</button>

			</div>
		</form>

	<footer class="w3-panel"><p></p></footer>
	</div>
	</div> -->
</div>
</body>
</html>
