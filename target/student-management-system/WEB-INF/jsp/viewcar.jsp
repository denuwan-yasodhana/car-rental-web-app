<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Cars On Board</title>
</head>
<body>
<h1>Cars On Board</h1>
<a href="${pageContext.request.contextPath}/home">Back</a><br><br>
<form action="/Car-Rent-System/viewcarID/" method="post">
   <tr><td>Car ID : </td><td><input type="text" id = "custID"/></td>
      <td></td><td><input type="submit" value="Search"/></td></tr>
</form>
<table border="2" width="70%" cellpadding="2">  
   <tr><th>CarId</th><th>Car Model</th><th>Rent</th><th>Status</th><th>Edit</th><th>Delete</th><th>Action</th></tr>
   <c:forEach var="cars" items="${list}">   
      <tr>
         <td>${cars.carid}</td>
         <td>${cars.carmodel}</td>
         <td>${cars.rent}</td>
         <td>${cars.status}</td>
         <td><a href="/Car-Rent-System/changecar/${cars.carid}">Edit</a></td>
         <td><a href="/Car-Rent-System/deletecar/${cars.carid}">dlt</a></td>
         <td><a href="/Car-Rent-System/actioncar/${cars.carid}">Action</a></td>
      </tr>
   </c:forEach>  
   </table>
   <a href="${pageContext.request.contextPath}/CarAdd">Add new car</a>

    
</body>
</html>
