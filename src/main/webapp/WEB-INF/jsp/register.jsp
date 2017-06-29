<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<style type="text/css">
 
 
 h2
 {
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
 }
</style>
</head>

<body>
<br>
<br>
<br>
<div class="container" style="border : 1px solid; border-radius: 5px; padding: 30px; border-color: lightgrey ; width: 50%;">
<h2>Register Here</h2>
<hr style="clear:both; width:40%;">
<form action="register.html" method="post" >
<table class="table table-striped table-bordered">
<tr><th>First Name:</th><td><input type="text" name="firstname" placeholder="Enter First Name" class="form-control" required></td></tr>
<tr><th>Last Name:</th><td><input type="text" name="lastname" placeholder="Enter Last Name" class="form-control" required></td></tr>
<tr><th>Email:</th><td><input type="text" name="email" placeholder="Enter Email ID" class="form-control" required></td></tr>
<tr><th>Password:</th><td><input type="password" name="password" placeholder="Enter Password" class="form-control" required></td></tr>
<td colspan="2"><input type="submit" name="submit" value="Submit" class="btn btn-success"></td>
<tr><td colspan="2"><span> Already Registered? Login <a href="login.html">Here</a></span></td></tr>
</table>
</form>
</div>
</body>
</html>