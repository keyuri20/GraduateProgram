<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<style type="text/css">
 p
 {
 font-size: 35pt;
 font-family: serif;
 text-align: center;
 font-weight: bold;
 }
 span,th
 {
 text-align: center;
 width: 20%;
 font-family: serif;
 font-size: 15pt;
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
<body style="background-image: csula.jpg;">
<br>
<br>
<br>
<div class="container" style="border : 1px solid; border-radius: 5px; padding: 30px; border-color: lightgrey; width: 50%;">
<p>Login</p>
<table class="table table-striped table-bordered">
<form action="login.html" method="post">
<tr>
<th >Username:</th>
<td><input type="text" name="username" placeholder="Username" class="form-control"></td>
</tr><br>
<tr>
<th>Password:</th>
<td><input type="password" name="password" placeholder="Password" class="form-control"></td>
</tr><br>
<tr>
<td colspan="2"><input type="submit" name="login" value="Login" class="btn btn-success"></td></tr>
 <tr><td colspan="2"><span>Register <a href="register.html">Here</a></span></td></tr>
 <div style="color:red">${error}</div>
 
 </form>
</table>


</div>
</body>
</html>