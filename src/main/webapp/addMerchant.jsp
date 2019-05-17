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
	<form action="../customer/saveee2" method="Post">
		<table align="center">
			<tr>
				<th><h1 align="center">Adding a new Merchant</h1></th>
			</tr>
			<tr>
				<th><h3>Merchant Name</h3>
					<input type="text" name="name" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Merchant Email</h3>
					<input type="text" name="email" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Merchant Phone</h3>
					<input type="text" name="phone" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Merchant Address</h3>
					<input type="text" name="address" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Merchant ShopName</h3>
					<input type="text" name="shopname" required autofocus /></th>
			</tr>
			<tr>
				<th><h3>Productid</h3>
					<input type="text" name="productid" required autofocus /></th>
			</tr> 
			
			<br>
			<tr>
				<th><button class="btn btn-primary" type="submit">Add
						Merchant</button></th>
			</tr>
		

	</form>
	<form action="../customer/saveee3" method="Post">
		
			<tr><th><button class="btn btn-primary" type="submit">Existing
				Merchants List</button></th></tr>
		</table>

	</form>

</body>
</html>