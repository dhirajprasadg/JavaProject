/**
 * 
 */

function sayHellooo() {
	alert("Hello World----------------")
}

function sayHellozara(name, age) {
	alert(name + " is " + age + " years old.");
}

function validateEmail() {
}

function validate() {

	if (document.myForm.Name.value == "dhiraj") {
		alert(" Please enter other name : " + document.myForm.Name.value);

		document.myForm.Name.focus();

		return false;
	}

	if (document.myForm.EMail.value == "") {
		var emailID = document.myForm.EMail.value;
		atpos = emailID.indexOf("@");
		dotpos = emailID.lastIndexOf(".");
		if (atpos < 1 || (dotpos - atpos < 2)) {
			alert("Please enter correct email ID : "
					+ +document.getElementById("uniqueID").value)
			document.myForm.EMail.focus();
			return false;
		}
		return (true);
	}

	if (document.myForm.Zip.value == "" || isNaN(document.myForm.Zip.value)
			|| document.myForm.Zip.value.length != 5) {
		alert("Please provide a zip in the format #####.");
		document.myForm.Zip.focus();
		return false;
	}

	if (document.myForm.Country.value == "-1") {
		alert("Please provide your country!");
		return false;
	}
	return (true);
}