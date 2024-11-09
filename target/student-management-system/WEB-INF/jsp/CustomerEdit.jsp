<html>
<head>
  <title>Edit Customer Page</title>
</head>
<body>
<form action="/Car-Rent-System/EditCus" method="post">
  <table>
    <tr>
      <td>Customer ID</td><td><input type="text" name="customerID" value="${command.customerid}"/></td>
    </tr>
    <tr>
      <td>Customer Name</td><td><input type="text" name="customerName"value="${command.customername}"/></td>
    </tr>
    <tr>
      <td>Phone Number</td><td><input type="text" name="phoneNumber" value="${command.phonenumber}" /></td>
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
