<%@ page import="com.myapp.enums.CarStatus" %>
<html>
<body>
<form action="register" method="post">
    <table>
        <tr>
            <td>Car ID</td><td><input type="text" name="CarID"/></td>
        </tr>
        <tr>
            <td>Car Model</td><td><input type="text" name="CarModel"/></td>
        </tr>
        <tr>
            <td>Rent Monthly</td><td><input type="text" name="Rent"/></td>
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
            <td></td><td><input type="submit" value="Add"/></td>
            
        </tr>
    </table>
</form>
</body>
</html>
