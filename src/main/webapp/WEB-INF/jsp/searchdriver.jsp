<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Driver</title>
</head>
<body>
<h1>Driver You Searched</h1>
<a href="${pageContext.request.contextPath}/home">Back</a><br><br>
<table border="2" width="70%" cellpadding="2">
    <tr><th>DriverID</th><th>DriverName</th><th>Experience</th><th>PhoneNo</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
         <td>${driver.driverid}</td>
         <td>${driver.drivername}</td>
         <td>${driver.experienceform}</td>
         <td>${driver.phonenumber}</td>
         <td>${driver.address}</td>
            <td><a href="changedriver/${driver.driverid}">Edit</a></td>
            <td><a href="deletedriver/${driver.driverid}">Dlt</a></td>
      </tr>
   </table>
</body>
</html>
