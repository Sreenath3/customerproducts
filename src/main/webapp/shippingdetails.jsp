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
<style>
body {
	background-color: skyblue;
	 font-family:verdana;
}

input[type=text] {
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
	width: 100%;
}
</style>
</head>
<body>
	<form action="../customer/shiping" method="Post">
	<h3 align="right"><a href="/">Login Page</a></h3>
		<table align="center">
			<tr>
				<th><h1 align="center">Shipping Details</h1></th>
			</tr>
			
			<tr>
				<th><h3>Address</h3>
					<input type="text" name="address" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Mobilenumber</h3>
					<input type="text" name="mobilenumber" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>
						<b>Email
					</h3>
					<input type="text" name="email" required autofocus></th>
			</tr>
			<tr>
				<th><h3>
						<b>Payment
					</h3>
					<input type="text" name="payment"></th>
			</tr>
			<br>
			<tr>
				<th><button class="btn btn-primary" type="submit">proceed
						</button></th>
			</tr>
			<br>
			
			
		

	</form>
	<form action="../customer/saveee7" method="Post">
	<tr>
				<th><button class="btn btn-primary" type="submit">Existing Customers
						</button></th>
			</tr>
			</table>
			</form>
	

</body>
</html>