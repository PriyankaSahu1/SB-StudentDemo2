<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   <style type="text/css">
  
  div {
 
  width: 500px;
  border: 15px solid green;
  padding: 50px;
  margin: 20px;
}
tr:hover {
	background-color: cyan;
}
  
  </style>
</head>
<body>
<center>
<div>
<h3>${std }</h3>
<h1>Welcome!! Insert Student Details:</h1>
<form action="/AddStudent">
<table  class="table table-striped">
<tr>
<td>Name:</td>
<td><input type="text" name="name">
</tr>
<tr>
<td>Roll:</td>
<td><input type="text" name="roll">
</tr>
<tr>
<td>Stream:</td>
<td><input type="text" name="stream">
</tr>
<tr>
<td>Grade:</td>
<td><input type="text" name="grade">
</tr>
<tr><td>
<input type="submit" value="submit" class="btn btn-info"></td>
</tr>
</table></form>

<form action="getStudent">
Enter roll to find details:
<input type="text" name="roll"><br>
<input type="submit">
</form>
<h1>${s.roll }</h1>
</div>
</center>
</body>
</html>