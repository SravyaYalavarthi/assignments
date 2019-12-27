function mailValidation()
{
var x=document.getElementById("eid").value;
if(x==null||x=="")
document.getElementById("errormail").innerHTML="plz enter your email";
else
document.getElementById("errormail").innerHTML="";
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
if(x==null||x=="")
document.getElementById("errorage").innerHTML="plz enter your age";
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
if(x==""||x==null)
document.getElementById("errorwth").innerHTML="plz enter your weight";
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
if(x==0||x==null)
document.getElementById("errorht").innerHTML="plz enter your height";
else
document.getElementById("errorht").innerHTML="";
}

function timeValidation()
{
var x=document.getElementById("wkt").value;
if(x==""||x==null)
document.getElementById("errortime").innerHTML="plz enter your time";
else
document.getElementById("errortime").innerHTML="";
}
function timeValidation1()
{
var x=document.getElementById("wkt1").value;
if(x==""||x==null)
document.getElementById("errortime1").innerHTML="plz enter your time";
else
document.getElementById("errortime1").innerHTML="";
}
function formValidation(form)
{
mailValidation();
ageValidation();
userValidation();
genderValidation();
weightValidation();
heightValidation();
planValidation();
timeValidation();
timeValidation1();
if(userValidation()&&ageValidation()&&genderValidation()&&weightValidation()&&planValidation()&&heightValidation()&&timeValidation()&&timeValidation1())
return true;
else
return false;
}









	
