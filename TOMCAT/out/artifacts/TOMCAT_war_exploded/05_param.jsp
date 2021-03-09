<%--
  Created by IntelliJ IDEA.
  User: bitweb
  Date: 21. 3. 8.
  Time: 오후 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>서블릿</title>
    <script type="text/javascript" src="param.js"></script>
</head>
<body>
<form method="get" action="/Param" name="frm">
    아이디 : <input type="text" name="id"><br>
    나 &nbsp; 이 : <input type="text" name="age"><br>
    <input type="submit" value="전송" onclick="return check()">
</form>
</body>
</html>