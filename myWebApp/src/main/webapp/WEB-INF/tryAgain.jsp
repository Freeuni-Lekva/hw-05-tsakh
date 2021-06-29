<%--
  Created by IntelliJ IDEA.
  User: tsakh
  Date: 29.06.21
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information incorrect</title>
</head>
<body>
    <h1>Please Try Again</h1>
    <h2>Either you username or password is incorrect. Please try again</h2>
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
