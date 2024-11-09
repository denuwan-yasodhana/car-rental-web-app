<html>
<body>
<h2>Hello World Car Rent Services!</h2>
<html>
<body>

<div style="text-align:center"><form action="${pageContext.request.contextPath }/admin" method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login" /></td>
        </tr>
    </table>
</form>
</div>

<div class="response">
    <%
        if (request.getParameter("failed") != null && request.getParameter("failed").equals("true")) {
    %>
    <label style="width: 100%; text-align: center; color: red"> The
        Username or password you entered is incorrect. Please try again. </label>
    <%
        }
    %>
</div>


</body>
</html>
