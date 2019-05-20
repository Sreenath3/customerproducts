<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="main.css">
<script src="webjars/jquery/2.0.0/jquery.min.js"></script>
<style>
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


</style>

</head>
<body>
	<div class="container">
		<h2
			style="text-align: center; background-color: skyblue; padding: 20px; width: 100%;">
			<b>Return Product</b>
			
		</h2>
		<h3 align="right"><a href="/">Login Page</a></h3>
		<a style="color: blue;font-size:20px;float:right;" href="/customerLogin.jsp"><b>Customer Login</b></a>
	
	<form action="customer/checkuser" method="post">
	<a style="color: blue;font-size:20px;float:left" href="/admin.jsp"><b>Admin Login</b></a>
		
		<h2 style="color:blue;">Login Page</h2>
		<table align="center">
		
		<tr><th><h3 style="font-size: 20px;">CustomerId*</h3></th></tr>
			<tr><th><input type="text" name=id  placeholder="Enter Customeremail"></th></tr>
			<tr><th><h3 style="font-size: 20px;">CustomerEmail*</h3></th></tr>
			<tr><th><input type="text" name=email  placeholder="Enter Customeremail"></th></tr>

			<tr><th><h3 style="font-size: 20px;">Customerpassword*</h3></th></tr>
			<tr><th><input type="password" name="password" value="password"></th></tr>
			<tr><th><h3 style="font-size: 20px;">OrderId*</h3></th></tr>
			<tr><th><input type="text" name="orderid"  placeholder="Orderid"></th></tr>
			

			<tr><th><button class="btn btn-primary" type="submit">Login</button></th></tr>
			</table>

		</div>



	</form>
	<div align="right" class="container">
	<a style="color: blue;font-size:20px;" href="/manager.jsp"><b>Merchant Login</b></a>
	<br>
	<a style="color: blue;font-size:20px;" href="/addcustomer.jsp"><b>Customer signup</b></a>
	
	
	</div>

	
	</div>

</body>
</html>