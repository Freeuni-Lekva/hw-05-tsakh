<%--
  Created by IntelliJ IDEA.
  User: tsakh
  Date: 30.06.21
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
    <h1>The Name <%=request.getAttribute("username")%> Is Already In Use </h1>
    <h2>Please enter another name and password.</h2>
    <form action="" method="POST" >
        <label for = "username"> Username </label>
        <input type = "text" name = "username" id = "username" value = "${username}" /><br/>
        <label for = "password"> Password </label>
        <input type = "password" name = "password" id = "password" /><br/>
        <button type = "submit"> Login </button>
    </form>
    <a href = "creating" >
        create new account
    </a>
</body>
</html>
