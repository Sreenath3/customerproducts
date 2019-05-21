<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
   <style>
        body
        {
        background-color:skyblue;
         font-family:verdana;
        }
       
        
        </style>
<body>
<table border="1" align="center">
		<thead>
			<tr>
				<th>DeliveryId</th>
				<th>DeliveryDate</th>
				<th>Status</th>
				<th>Quantity</th>
				
				<th>ProductID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="trainees" items="${AA}">
				<tr>
					<td>${trainees.id}</td>
					<td>${trainees.deliveryDate}</td>
					<td>${trainees.deliveryStatus}</td>
					<td>${trainees.productQuantity}</td>
					<td>${trainees.productID}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>