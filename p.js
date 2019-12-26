var x=10;
var y=10;
var s="name";
var v=true;
var h=["sd",34];
var a=[1,2,3,4,5,6,7,8,9];
var r=0;
console.log(typeof(x));
console.log(typeof(s));
console.log(typeof(v));
console.log(typeof(h));
function sum()
{
for(var i=0;i<=9;i++)
{
	r=r+i;
}
	console.log(r);
	document.getElementById("id1").innerHTML=r;
}
function sum1()
{
	var p=document.getElementById("id2").value;
	var q=document.getElementById("id3").value;
	r=parseInt(p)+parseInt(q);
	document.getElementById("id4").innerHTML=r;
	
}
function fullname()
{
	var n1=document.getElementById("id5").value;
	var n2=document.getElementById("id6").value;
	var j=n1+" "+n2;
	document.getElementById("id7").value=(j);
}
function image()
{
	document.getElementById("im").src="../image/d2.jpg";
}
function userValidation()
{
	var userValue=document.getElementById("txtName").value;
	var namePattern="^[A-Za-z]+$";
	if(!userValue.match(namePattern))
		document.getElementById("errorName").innerHTML="name should be alphabets";
	else
		document.getElementById("errorName").innerHTML="";
}
function radioValidation()
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
	function checkValidation()
	{
	var ele=document.getElementsByClassName("Language");
	var count=0;
	for(var i=0;i<ele.length;i++)
	{
		if(ele[i].checked)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorLanguage").innerHTML="select atleast one Language";
		return false;
	}
	else{
		document.getElementById("errorLanguage").innerHTML="";
		return true;
	}	
}
function dropDownValidation()
	{
	var elem=document.getElementsByClassName("state");
	var count=0;
	for(var i=0;i<elem.length;i++)
	{
		if(elem[i].selected)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorDropDown").innerHTML="select a state";
		return false;
	}
	else{
		document.getElementById("errorDropDown").innerHTML="";
		return true;
	}	
}

function formValidation(form)
{
	userValidation();
	radioValidation();
	checkValidation();
	dropDownValidation();
	if(userValidation()&&radioValidation()&&checkValidation()&&dropDownValidation())
		return true;
	else
		return false;
	
}

