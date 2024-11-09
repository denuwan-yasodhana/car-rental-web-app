<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drivers on Work</title>
</head>
<body>
	<h1>Drivers on Work</h1>
    <a href="${pageContext.request.contextPath}/home">Back</a><br><br>
    <form name="searchform" onsubmit="return OnSubmitForm();" method="Post">
        <tr><td>Car ID</td><td><input type="text" id = "DriveID"/></td><td><input type="submit" value="Search"/></td></tr>
    </form>
    <br>
	<table border="2" width="70%" cellpadding="2">  
        <tr><th>DriverID</th><th>DriverName</th><th>Experience</th><th>PhoneNo</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
   <c:forEach var="cardriver" items="${list}">   
   <tr>  
        <td>${cardriver.driverid}</td>
        <td>${cardriver.drivername}</td>
        <td>${cardriver.experienceform}</td>
        <td>${cardriver.phonenumber}</td>
        <td>${cardriver.address}</td>
        <td><a href="changedriver/${cardriver.driverid}">Edit</a></td>
        <td><a href="deletedriver/${cardriver.driverid}">Dlt</a></td>
   </tr>
   </c:forEach>  
   </table>
    <br>
    <a href="${pageContext.request.contextPath}/DriverAdd">Add new driver</a>

	
</body>
<script>
    function OnSubmitForm()
    {
        var DriveID= document.getElementById("DriveID").value;
        document.searchform.action="/Car-Rent-System/searchdriver/"+DriveID;
        return true;
    }
</script>
</html>
