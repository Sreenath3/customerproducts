<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="../customer/order" method="post">
	
	<label>Product Name</label>
		<input type="name" name="name" required autofocus /> </th></th>
		<br>
	<label>Product quantity</label>
	<input type="number" name="quantity" required autofocus /> </th></th>
	<br>

	<br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>