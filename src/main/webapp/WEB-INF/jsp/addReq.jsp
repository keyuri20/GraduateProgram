<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Additional Requirement</title>
<style type="text/css">
 
 
 h2
 {
 color:black;
 font-family: serif;
 text-align: center;
 font-weight: bold;
 }
 span,th
 {
 text-align: center;
 width: 20%;
 font-family: serif;
 font-size: medium;
 font-weight: bold;
 }
 td
 {
 font-family: serif;
 font-size: medium;
 text-align: center;
 width:30%;
 color:black;
 }
th{
 text-align: center;
color:black;
}

</style>

</head>
<body>
<br/>
<br/>
<br/>
<div class="container" style="border : 1px solid; border-radius: 5px; padding: 30px; border-color: lightgrey; width: 50%;">
<a style="float:left;" href="details.html?d_no=${d_no}"><button class="btn btn-primary" style="font-family: serif; font-size: medium;">Back</button></a>
<a style="float:right;" href="logout.html"><button class="btn btn-danger" style="font-family: serif; font-size: medium;">Logout</button></a>
<h2>Add Additional Requirement</h2>
<hr style="clear:both; width:40%;">
<table class="table table-striped table-bordered">
<form action="addReq.html" method="post" >
<tr><td>Additional Requirement Name:</td><td><input type="text" name="name" class="form-control" placeholder="Enter Requirement Name" required></td></tr><br>
<tr><td>Additional Requirement Type:</td><td><input type="text" name="type" class="form-control" placeholder="Enter Requirement Type" required></td></tr><br>
<!-- <tr><td><input type="radio" name="radio" value="required" checked>Required</td></tr><br>
<tr><td><input type="radio" name="radio" value="notrequired">Not Required</td></tr><br>
 -->
 <tr><td colspan="2"><input type="submit" name="add" value="Add" class="btn btn-success"></td></tr>
</form>
</table>
</body>
</html>