<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<head><title>Deparments</title>
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
 tr,td
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
<a style="float:right;" href="logout.html"><button class="btn btn-danger" style="font-family: serif; font-size: medium;">Logout</button></a><br><br>
<table class="table table-striped table-bordered">
<tr><a href="addDept.html"><button class="btn btn-primary" style="font-family: serif; font-size: medium;">Add Departments</button></a></tr>
</table>
<table class="table table-striped table-bordered">
<h2 style="color:black">Departments</h2>
<hr style="clear:both; width:40%;">
<tr><th>Department Name</th><th>Number Of Programs</th><th colspan=3>Operations</th></tr>
<c:forEach items="${department}" var="departments" varStatus="s">
<tr>
  <td>${departments.dept_name}</td>
  <td>${sizes[s.index]}</td>
  <td><a href="details.html?d_no=${departments.d_no}">Details</a>
  <td><a href="editDept.html?d_no=${departments.d_no}">Edit</a>
</tr>
</c:forEach>
</table>
</body>
</html>