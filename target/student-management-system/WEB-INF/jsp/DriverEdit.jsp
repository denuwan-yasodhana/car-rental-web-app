
<html>
<head>
    <title>Edit Driver Page</title>
</head>
<body>
<form action="/Car-Rent-System/EditDriver" method="post">
    <table>
        <tr>
            <td>Driver ID</td><td><input type="text" name="DriversID" value="${command.driverid}"/></td>
        </tr>
        <tr>
            <td>Driver Name</td><td><input type="text" name="DriverName" value="${command.drivername}"/></td>
        </tr>
        <tr>
            <td>Experience From</td><td><input type="text" name="phoneNumber" value="${command.phonenumber}"/></td>
        </tr>
        <tr>
            <td>Phone Number</td><td><input type="text" name="ExperienceFrom" value="${command.experienceform}"/></td>
        </tr>
        <tr>
            <td>Address</td><td><input type="text" name="address" value="${command.address}"/></td>
        </tr>
        <tr>
            <td></td><td><input type="submit" value="Edit & Save"/></td>
        </tr>
    </table>
</form>
</body>
</html>
