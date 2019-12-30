function mailValidation()
{
var x=document.getElementById("eid").value;
var pattern="^[A-Za-z0-9]+[@]{1}[a-z]+(.com|.co.in.|.in)$";
if(x==null||x==""){
document.getElementById("errormail").innerHTML="plz enter email";
return false;
}
else if(!x.match(pattern)){
document.getElementById("errormail").innerHTML="write in correct format";
return false;
}
else{
document.getElementById("errormail").innerHTML="";
return true;
}
}
function pwdValidation()
{
	var Value=document.getElementById("pid").value;
	var pwdPattern="^[A-Za-z0-9@!#$&*]{8,}$";
	if(Value==null||Value==""){
document.getElementById("errorpwd").innerHTML="plz enter password";
return false;
}
	else if(!Value.match(pwdPattern)){
		document.getElementById("errorpwd").innerHTML="password should contain atleast 8 characters"
return false;
}
	else{
document.getElementById("errorpwd").innerHTML="";
return true;
}
}
function confirmpwdValidation()
{
	var password=document.getElementById("pid").value;
	var confirmpwd=document.getElementById("pid1").value;
	if(confirmpwd==null||confirmpwd==""){
document.getElementById("errorpwd1").innerHTML="plz enter password";
return false;
}
	else if(!password.match(confirmpwd)){
	document.getElementById("errorpwd1").innerHTML="plz match the password";
return false;
}
else{
	document.getElementById("errorpwd1").innerHTML="";
return true;
}
}
function userValidation()
{
	var userValue=document.getElementById("txtname").value;
	var namePattern="^[A-Za-z]+$";
	if(userValue==null||userValue==""){
document.getElementById("errorname").innerHTML="plz enter name";
return false;
}
	else if(!userValue.match(namePattern)){
		document.getElementById("errorname").innerHTML="name should be alphabets";
return false;
}
	else{
		document.getElementById("errorname").innerHTML="";
return true;
}
}
function fnameValidation()
{
	var userValue=document.getElementById("fname").value;
	var namePattern="^[A-Za-z]+$";
	if(userValue==null||userValue==""){
document.getElementById("errorFname").innerHTML="plz enter Fathers name";
return false;
}
	else if(!userValue.match(namePattern)){
		document.getElementById("errorFname").innerHTML="name should be alphabets";
return false;
}
	else{
		document.getElementById("errorFname").innerHTML="";
return true;
}
}
function mnameValidation()
{
	var userValue=document.getElementById("mname").value;
	var namePattern="^[A-Za-z]+$";
	if(userValue==null||userValue==""){
document.getElementById("errorMname").innerHTML="plz enter mothers name";
return false;
}
	else if(!userValue.match(namePattern)){
		document.getElementById("errorMname").innerHTML="name should be alphabets";
return false;
}
	else{
		document.getElementById("errorMname").innerHTML="";
return true;
}
}

function dtValidation()
{
var x=document.getElementById("dt").value;
if(x==null||x==""){
document.getElementById("errordt").innerHTML="plz enter DOB";
return false;
}
else{
document.getElementById("errordt").innerHTML="";
return true;
}
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
function addrValidation()
{
var x=document.getElementById("addr").value;
if(x==null||x==""){
document.getElementById("errorAddr").innerHTML="plz enter address";
return false;
}
else{
document.getElementById("errorAddr").innerHTML="";
return true;
}
}
function numValidation()
{
var x=document.getElementById("num").value;
var pattern="^[6-9]{1}[0-9]{9}$";
if(x==0||x==""){
document.getElementById("errorNum").innerHTML="plz enter phno";
return false;
}
else if(!x.match(pattern)){
document.getElementById("errorNum").innerHTML="plz enter valid phno";
return false;
}
else{
document.getElementById("errorNum").innerHTML="";
return true;
}
}
function formValidation()
{
a=mailValidation();
b=pwdValidation();
c=confirmpwdValidation();
d=userValidation();
e=fnameValidation();
f=mnameValidation();
g=dtValidation();
h=genderValidation();
i=addrValidation();
j=numValidation();
if(a&&b&&c&&d&&e&&f&&g&&h&&i&&j)
return true;
else
return false;
}









	
