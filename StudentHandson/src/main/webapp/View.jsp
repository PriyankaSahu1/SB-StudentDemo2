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
body{
text-align: center;}
  
  </style>
</head>
<body>

<br><br><br>
<form action="getStudent">
Enter roll to find details:
<input type="text" name="roll"><br>
<input type="submit" class="btn btn-info">
</form>
<h1>${s.roll }</h1>


</body>
</html>