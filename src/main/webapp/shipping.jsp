
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../customer/shiping" method="post">
	
	<label>Email Id</label>
		<input type="email" name="email" required autofocus /> </th></th>
		<br>
	<label>Mobile Number</label>
	<input type="number" name="mobile" required autofocus /> </th></th>
	<br>
	<label>Address</label>
	<input type="text" name="address" required autofocus /> </th></th>
	<br>
	<label>Payment</label>
	<input type="text" name="payment" required autofocus /> </th></th>
	<br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>