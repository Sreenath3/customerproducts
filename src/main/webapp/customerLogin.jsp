<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	font-family: verdana;
	background-color:lightblue;
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
<h2 style="color:blue;">Login Page</h2>
		<table align="center">
		<form action="customer/checkuser1" method="post">
		<tr><th><h3 style="font-size: 20px;">CustomerId*</h3></th></tr>
			<tr><th><input type="text" name=id  placeholder="Enter Customeremail"></th></tr>
			<tr><th><h3 style="font-size: 20px;">CustomerEmail*</h3></th></tr>
			<tr><th><input type="text" name=email  placeholder="Enter Customeremail"></th></tr>

			<tr><th><h3 style="font-size: 20px;">Customerpassword*</h3></th></tr>
			<tr><th><input type="password" name="password" value="password"></th></tr>
			
			

			<tr><th><button class="btn btn-primary" type="submit">Login</button></th></tr>
			</table>
			</form>

</body>
</html>