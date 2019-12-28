function mailValidation()
{
var x=document.getElementById("eid").value;
var pattern="^[A-Za-z0-9]+[@]{1}[a-z]+(.com|.co.in.|.in)$";
if(x==null||x=="")
document.getElementById("errormail").innerHTML="plz enter your email";
else
document.getElementById("errormail").innerHTML="";
}
function pwdValidation()
{
	var Value=document.getElementById("pid").value;
	var pwdPattern="^[A-Za-z0-9@!#$&*]{8,}$";
	if(!Value.match(pwdPattern))
		document.getElementById("errorpwd").innerHTML="password should contain atleast 8 characters";
	else
		document.getElementById("errorpwd").innerHTML="";
}
function confirmpwdValidation()
{
	var password=document.getElementById("pid").value;
	var confirmpwd=document.getElementById("pid1").value;
	if(!password.match(confirmpwd))
	document.getElementById("errorpwd1").innerHTML="plz match the password";
else
	document.getElementById("errorpwd1").innerHTML="";
}
function userValidation()
{
	var userValue=document.getElementById("txtname").value;
	var namePattern="^[A-Za-z]+$";
	if(!userValue.match(namePattern))
		document.getElementById("errorname").innerHTML="name should be alphabets";
	else
		document.getElementById("errorname").innerHTML="";
}
function ageValidation()
{
var x=document.getElementById("num").value;
var valuePattern="^[0-9]{1,3}$";
if(x==null||x=="")
document.getElementById("errorage").innerHTML="plz enter your age";
else if(!x.match(valuePattern))
document.getElementById("errorage").innerHTML="age should be in digits";
else
document.getElementById("errorage").innerHTML="";
}
function genderValidation()
{
	var elements=document.getElementsByName("gender");
	var count=0;
	for(var i=0;i<elements.length;i++)
	{
		if(elements[i].checked)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorGender").innerHTML="select atleast one gender";
		return false;
	}
	else{
		document.getElementById("errorGender").innerHTML="";
		return true;
	}
}
function weightValidation()
{
var x=document.getElementById("wth").value;
var valuePattern="^[0-9]{1,3}$";
if(x==null||x=="")
	document.getElementById("errorwth").innerHTML="plz enter weight";
else if(!x.match(valuePattern))
document.getElementById("errorwth").innerHTML="weight should be in digits";
else
document.getElementById("errorwth").innerHTML="";
}

function planValidation()
{
	var elements=document.getElementsByName("weight");
	var count=0;
	for(var i=0;i<elements.length;i++)
	{
		if(elements[i].checked)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorwt").innerHTML="select atleast one plan";
		return false;
	}
	else{
		document.getElementById("errorwt").innerHTML="";
		return true;
	}
}
function heightValidation()
{
var x=document.getElementById("ht").value;
var valuePattern="^[0-9]{1}[']{1}[0-9]{1}$";
if(x==0||x==null)
document.getElementById("errorht").innerHTML="plz enter your height";
else if(!x.match(valuePattern))
document.getElementById("errorht").innerHTML="height should be in n'n format";
else
document.getElementById("errorht").innerHTML="";
}
function formValidation()
{
a=mailValidation();
b=pwdValidation();
c=confirmpwdValidation();
d=ageValidation();
e=userValidation();
f=genderValidation();
g=weightValidation();
h=heightValidation();
i=planValidation();
if(a&&b&&c&&d&&e&&f&&g&&h&&i)
return true;
else
return false;
}









	
