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
<h1>Customer You Searched</h1>
<a href="${pageContext.request.contextPath}/home">Back</a><br><br>
<table border="2" width="70%" cellpadding="2">
   <tr><th>CutomerId</th><th>Customer Name</th><th>Phone Number</th><th>Address</th><th>Status</th><th>Edit</th><th>Delete</th></tr>      <tr>
         <td>${customer.customerid}</td>
         <td>${customer.customername}</td>
         <td>${customer.phonenumber}</td>
         <td>${customer.address}</td>
         <td>${customer.cusStatus}</td>
         <td><a href="changecus/${customer.customerid}">Edit</a></td>
         <td><a href="deletecustomer/${customer.customerid}">Dlt</a></td>
         <td><a href="returningcar/${customer.customerid}">Return</a></td>
      </tr>
   </table>
</body>
</html>
