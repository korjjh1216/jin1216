<%--
  Created by IntelliJ IDEA.
  User: bitweb
  Date: 21. 3. 8.
  Time: 오후 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert Title Here</title>
</head>
<body>
<form method="get" action="/Login">
    <label for="userid">아이디 : </label>
    <input type="text" name="id" id="userid"><br>
    <label for="userpwd">암 &nbsp; 호 : </label>
    <input type="password" name="pwd" id="userpwd"><br>
    <input type="submit" value="로그인">
</form>
</body>
</html>