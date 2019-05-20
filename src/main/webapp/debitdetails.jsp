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
	width: 150%;
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
	width: 150%;
}
</style>
</head>
<body>
	<form action="../customer/coupondetails" method="Post">
	<h3 align="right"><a href="/">Login Page</a></h3>
		<table align="center">
			<tr>
				<th><h1 align="center">Debit Details</h1></th>
			</tr>
			
			<tr>
				<th><h3>Enter Card Number</h3>
					<input type="text"  required autofocus placeholder="card number"/></th>
			</tr>
			<tr>
				<th><h3>Account Holder Name</h3>
					<input type="text"  required autofocus  placeholder="name"/></th>
			</tr>
			<tr>
				<th><h3>Valid Thru</h3>
					<input type="text" style="width:50%" required autofocus placeholder="       /     " ></th>
					<th><h3>Enter CVV</h3>
					<input type="text" style="width:50%" required autofocus ></th>
		
			</tr>
			
				
			
			<br>
			<tr>
				<th><button class="btn btn-primary" type="submit">Add
						card</button></th>
			</tr>
		

	</form>
	

</body>
</html>