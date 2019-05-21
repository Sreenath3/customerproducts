<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
          <link href="css/custom.css"
        rel="stylesheet">
 <link rel="stylesheet" type="text/css" href="main.css">
 <style>
       a
       {
       font-size:25px;
       }
       h2
       {
       font-size:30px;
       }
       body
       {
        font-family:verdana;
       }
       button {
	background-color: #4CAF50;
	color: white;
	padding: 10px 10px;
	margin: 15px 0;
	border: none;
	cursor: pointer;
	width: 20%;
}
        </style>
</head>
<body>
	<h2 style="background-color:lightblue;padding:25px;width: 100%"><marquee>Banking System</marquee></h2>
	<h3 align="right"><a href="/">Login Page</a></h3>
	 

	<b style="font-size:25px">Pick Your Option</b>
	
	
	<br>
	
		<a href="../addmoney.jsp">1.Add Money</a>
		<br>
		<br>
		<br>
		<a href="../customer/saveee1">2.Existing
				Customers</a><br>
		<br>
		<br>
		<a href="../customer/balance2">3.RetreivingBalance</a>
		<br>
		<br>
		<br>
			<a href="../tranfermoney.jsp">4.Money Transfer</a>
			<br>
			<br>
			<br>
			<a href="../addproduct.jsp">5.Add a Product</a>
			<br>
			<br>
			<br>
			<a href="../customer/saveee5">6.Existing Coupons</a>
			<br>
			<br>
			<br>
			<a href="../customer/saveee5">6.Existing Coupons</a>
			<br>
			<br>
			<a href="../index2.jsp">7.Delivery Details</a>
			<br>
			<br>
			<br>
			<form action="../shippingdetails.jsp" method="Post">
			<table align="center"></table>
			<tr>
				<th><button class="btn btn-primary" type="submit">Shipping details
						</button></th>
			</tr>
			</table>
			</form>
			
			
			
		
		
		

</body>
</html>