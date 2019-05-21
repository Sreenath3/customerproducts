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
	padding: 10px 15px;
	margin: 6px 0;
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
	<form action="../customer/saveee56" method="Post">
	<h3 align="right"><a href="/">Login Page</a></h3>
		<table align="center">
			<tr>
				<th><h1 align="center">Delivery Status</h1></th>
			</tr>
			<tr>
				<th><h3>DeliveryId*</h3>
					<input type="text" name="id" required autofocus /></th>
			</tr>
			
			<tr>
				<th><button class="btn btn-primary" type="submit">
						Check</button></th>
			</tr>
		

	

</body>
</html>