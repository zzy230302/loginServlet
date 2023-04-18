<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/18
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.setContentType("text/html;charset=utf-8");
    request.setCharacterEncoding("utf-8");
    String name=request.getParameter("username");
    String password=request.getParameter("password");


%>
您的用户名是：<%=name%><br>
您的密码是：<%=password%>
</body>
</html>
