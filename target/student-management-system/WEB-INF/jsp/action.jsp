<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Action</title>
</head>
<body>
<h1>Rent it or Send for Service</h1>
<a href="${pageContext.request.contextPath}/home">Back</a><br><br>
<form>
<table border="2" width="70%" cellpadding="2">  
   <tr><th>CarId</th><th>Car Model</th><th>Rent</th><th>Status</th></tr>
      <tr>
         <td>${command.carid}</td>
         <td>${command.carmodel}</td>
         <td>${command.rent}</td>
         <td>${command.status}</td>
      </tr>
   </table>
   <br>
   <br>
   <a href="/Car-Rent-System/bookingcar/${command.carid}">Book Car</a>
   <a href="/Car-Rent-System/servicecar/${command.carid}">Give for Service</a>
</form>


    
</body>
</html>
