var employee = null;

function loadDoc() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      employee = JSON.parse(this.responseText);
      debugger;
      getEmployee();
    }
  };
  xhttp.open("GET", "EmployeeServlet?empID=" + document.getElementById("EmployeeID").value + "&t=" + Math.random(), true);
  xhttp.send();
}
function getEmployee() {
	if(employee.employeeId == document.getElementById("EmployeeID").value) {
		document.getElementById("username").value = employee.name;
		document.getElementById("CompanyEmployeeID").value = employee.companyEmployeeID;

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

function searchByName() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("myInput");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }
	  }
	}
