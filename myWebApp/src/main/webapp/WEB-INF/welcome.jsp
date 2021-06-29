<%--
  Created by IntelliJ IDEA.
  User: tsakh
  Date: 29.06.21
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome <%=request.getAttribute("username")%> </title>
</head>
<body>
    <h1>Welcome <%=request.getAttribute("username")%> </h1>
</body>
</html>
