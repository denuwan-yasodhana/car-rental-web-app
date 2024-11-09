<%--
  Created by IntelliJ IDEA.
  User: KOBI
  Date: 1/13/2023
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><%@ page import="com.myapp.enums.CarStatus" %>
<html>
<head>
  <title>Edit Car Page</title>
</head>
<body>
<form action="/Car-Rent-System/editcar" method="post">
  <table>
    <tr>
      <td>Car ID</td><td><input type="text" name="CarID" value="${command.carid}"/></td>
    </tr>
    <tr>
      <td>Car Model</td><td><input type="text" name="CarModel" value="${command.carmodel}"/></td>
    </tr>
    <tr>
      <td>Rent Monthly</td><td><input type="text" name="Rent" value="${command.rent}"/></td>
    </tr>
    <tr>
      <td><label for="carStat">Status:</label></td>
      <td>
        <select name="carStat" id="carStat">
          <option value="Available"><%=CarStatus.Available%></option>
          <option value="On Rent"><%=CarStatus.OnRent%></option>
          <option value="On Service"><%=CarStatus.OnService%></option>
        </select></td>
    </tr>
    <tr>
      <td></td><td><input type="submit" value="Edit & Save"/></td>
    </tr>
  </table>
</form>
</body>
</html>

<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
