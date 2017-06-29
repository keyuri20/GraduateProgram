<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
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
<br>
<br>
<br>
<div class="container" style="border : 1px solid; border-radius: 5px; padding: 30px; color: lightgrey; width: 50%;">
<a style="float:left;" href="list.html"><button class="btn btn-primary" style="font-family: serif; font-size: medium;">Back</button></a>
<a style="float:right;" href="logout.html"><button class="btn btn-danger" style="font-family: serif; font-size: medium;">Logout</button></a>

<h2 style="color:black">${department.dept_name}</h2>
<table class="table table-striped table-bordered">
<tr><a href="addProg.html?d_no=${department.d_no}" ><button class="btn btn-primary" style="font-family: serif; font-size: medium;">Add Program</button></a></tr>
</table>
<table class="table table-striped table-bordered">
<th>Programs</th><th colspan="2">Operations</th>
<br>
<c:forEach items="${program}" var="programs">
<tr>
  <td style="color: black;">${programs.program_name}</td>
  <td><a href="editProg.html?p_no=${programs.p_no}&d_no=${department.d_no}">Edit</a></td>
  <td><a href="deleteProg.html?p_no=${programs.p_no}">Delete</a></td>
</tr>
</c:forEach>
</table>
<table>
<tr><a href="addReq.html?d_no=${department.d_no}"><button class="btn btn-primary" style="font-family: serif; font-size: medium;">Add Additional Requirement</button></a></tr>
</table>
<br/>
<table class="table table-striped table-bordered">
<th>Additional Requirements</th><th>Type</th><th colspan=3>Operations</th>
<c:forEach items="${additional_info}" var="additional">
<tr>
  <td style="color: black;">${additional.name}</td>
  <td style="color: black;">${additional.type}</td>
  <td><a href="editReq.html?ad_id=${additional.ad_id}&d_no=${department.d_no}">Edit</a></td>
  <td><a href="deleteReq.html?ad_id=${additional.ad_id}">Delete</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>