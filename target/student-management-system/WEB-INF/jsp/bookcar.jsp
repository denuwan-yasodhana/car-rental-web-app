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
<form name="seform" onsubmit="return OnSubmitForm('${command.carid}');" method="Post">
    <table border="0">
        <tr><td>Car ID : </td><td>${command.carid}</td></tr>
        <tr><td>Car Model : </td><td>${command.carmodel}</td></tr>
        <tr><td>Rent Price : </td><td>${command.rent}</td></tr>
        <br>
            <tr><td>Customer ID : </td><td><input type="text" id = "custID"/></td></tr>
        <tr>
            <td></td><td><input type="submit" value="Book Now"/></td>
        </tr>
   </table>
</form>
<script>
    function OnSubmitForm(carID)
    {
        var custid = document.getElementById("custID").value;
        document.seform.action="/Car-Rent-System/bookcar/"+carID+"/"+custid;
        return true;
    }
</script>
</body>
</html>
