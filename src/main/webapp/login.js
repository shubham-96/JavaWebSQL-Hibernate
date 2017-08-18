var employee = null;

function loadDoc() {
	var xhttp = new XMLHttpRequest();
	debugger;
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			employee = JSON.parse(this.responseText);
			getEmployee();
		}
	};
	xhttp.open("GET", "EmployeeServlet?comEmpID="
			+ document.getElementById("CompanyEmployeeID").value + "&t="
			+ Math.random(), true);
	xhttp.send();
	debugger;
}

function getEmployee() {
	debugger;
	if (employee.companyEmployeeID == document
			.getElementById("CompanyEmployeeID").value) {
		document.getElementById("username").value = employee.name;
		// document.getElementById("CompanyEmployeeID").value =
		// employee.companyEmployeeID;

		if (employee.gender == "MALE")
			document.getElementById("genderM").checked = true;
		else if (employee.gender == "FEMALE")
			document.getElementById("genderF").checked = true;

		if (employee.self)
			document.getElementById("self").checked = true;
		else
			document.getElementById("self").checked = false;

		switch (employee.department) {
		case "SD":
			document.getElementById("SD").selected = true;
			break;
		case "QA":
			document.getElementById("QA").selected = true;
			break;
		case "ROA":
			document.getElementById("ROA").selected = true;
			break;
		case "CARE":
			document.getElementById("CARE").selected = true;
			break;
		case "TECHOPS":
			document.getElementById("TECHOPS").selected = true;
			break;
		}
		document.getElementById("contact").value = employee.contactNumber;
	}
}

function search() {
	var input, filter, table, tr, td, i, j;
	var filterBy = document.getElementById("filterkey");
	filterkey = filterBy.options[filterBy.selectedIndex].text;
	switch (filterkey) {
	case "CompanyEmployeeID":
		i = 1;
		break;
	case "Name":
		i = 2;
		break;
	case "Self":
		i = 4;
		break;
	case "Department":
		i = 6;
		break;
	}

	input = document.getElementById("myInput");
	filter = input.value.toUpperCase();
	table = document.getElementById("myTable");
	tr = table.getElementsByTagName("tr");
	for (j = 0; j < tr.length; j++) {
		td = tr[j].getElementsByTagName("td")[i];
		if (td) {
			if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
				tr[j].style.display = "";
			} else {
				tr[j].style.display = "none";
			}
		}
	}
}
