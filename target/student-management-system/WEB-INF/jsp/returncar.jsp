<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Return Car</title>
</head>
<body>
<h1>Return Car</h1>
<a href="${pageContext.request.contextPath}/home">Back</a><br><br>
<form action="/Car-Rent-System/returnThecar/${command.carID}/${command.customerID}" method="Post">
    <table border="0">
        <tr><td>Car ID : </td><td>${command.carID}</td></tr>
        <tr><td>Customer ID : </td><td>${command.customerID}</td></tr>
        <br>
        <tr>
            <td></td><td><input type="submit" value="Return Now"/></td>
        </tr>
   </table>
</form>
</body>
</html>
