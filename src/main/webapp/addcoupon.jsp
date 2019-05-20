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
	<form action="../customer/coupondetails" method="Post">
	<h3 align="right"><a href="/">Login Page</a></h3>
		<table align="center">
			<tr>
				<th><h1 align="center">Adding a Coupon</h1></th>
			</tr>
			
			<tr>
				<th><h3>CouponName</h3>
					<input type="text" name="couponName" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>DiscountValue</h3>
					<input type="text" name="couponDiscountValue" required autofocus /></th>
			</tr>
			
			<br>
			<tr>
				<th><button class="btn btn-primary" type="submit">Add
						Coupon</button></th>
			</tr>
		

	</form>
	

</body>
</html>