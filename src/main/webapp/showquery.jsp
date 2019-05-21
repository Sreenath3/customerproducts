<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Return</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="main.css">
<script src="webjars/jquery/2.0.0/jquery.min.js"></script><style>
body {
	font-family: verdana;
	
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 10px 10px;
  margin: 15px 0;
  border: none;
  cursor: pointer;
  width: 50%;
}
h2
{
 text-align:center;
}
a
{
font-family:verdana;
}
h3
{
font-family:verdana;
}


</style>
</head>
<body>
<h2 style="background-color:lightblue;padding:25px;width: 100%"><marquee>Returning Product to merchant</marquee></h2>
<form action="../customer/saveee65" method="Post">
    <table align="center">
			
		
			<tr><th><h3 style="font-size: 20px;">Productid</h3></th></tr>
			<tr><th><input type="text" name="productid"  placeholder="productid"></th></tr>
			<tr><th><h3 style="font-size: 20px;">ProductName</h3></th></tr>
			<tr><th><input type="text" name="productname"  placeholder="productname"></th></tr>
			<tr><th><h3 style="font-size: 20px;">Cause for return</h3></th></tr>
			<tr><th><input type="text" name="cause"  placeholder="cause"></th></tr>
			<tr><th><button class="btn btn-primary" type="submit">send</button></th></tr>
			</table>
			</form>
			
</body>
</html>