function add(){
    debugger;
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var ans = num1 + num2;
    document.getElementById("answer").innerHTML = ans;
}

function sub(){
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var ans = num1 - num2;
    document.getElementById("answer").innerHTML = ans;
}

function multiply(){
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var ans = num1 * num2;
    document.getElementById("answer").innerHTML = ans;
}

function div(){
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var ans = num1 / num2;
    document.getElementById("answer").innerHTML = ans;
}
/*
if (num1==null || num2==null){
    alert("Field(s) is/are empty!");
}
else {
        document.getElementById("answer").innerHTML = ans;
}
*/
