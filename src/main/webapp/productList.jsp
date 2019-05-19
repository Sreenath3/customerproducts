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
<h1 align="center">Product Details</h1>
<h3 align="right"><a href="/">Login Page</a></h3>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>Serialnumber</th>
				<th>ProductPrice</th>
				<th>Productname</th>
				<th>Category</th>
				
				<th>ProductId</th>
				<th>Brand</th>
				<th>Productstock</th>
				
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="trainees" items="${PRODUCTLIST}">
				<tr>
					<td>${trainees.serialnumber}</td>
					<td>${trainees.productPrice}</td>
					<td>${trainees.productname}</td>
					<td>${trainees.productcategory}</td>
					<td>${trainees.productid}</td>
					<td>${trainees.brand}</td>
				 <td>${trainees.productstock}</td> 
					
					
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	

</body>
</html>