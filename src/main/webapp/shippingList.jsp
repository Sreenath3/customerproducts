<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="main.css">
        <style>
        body
        {
        background-color:skyblue;
         font-family:verdana;
        }
       
        
        </style>
</head>
<body>
<h1 align="center">Shipping Details</h1>
<h3 align="right"><a href="/">Login Page</a></h3>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>Id</th>
				
				<th>Address</th>
				<th>MobileNumber</th>
				<th>Email</th>
				
				<th>Payment</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="trainees" items="${SHIPPINGLIST}">
				<tr>
					<td>${trainees.id}</td>
					<td>${trainees.address}</td>
					<td>${trainees.mobilenumber}</td>
					<td>${trainees.email}</td>
					<td>${trainees.payment}</td>
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	

</body>
</html>