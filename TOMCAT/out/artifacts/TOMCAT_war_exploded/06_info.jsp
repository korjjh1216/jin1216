<%--
  Created by IntelliJ IDEA.
  User: bitweb
  Date: 21. 3. 8.
  Time: 오후 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> get 방식에서 한글 깨짐 방지 </h3>
<form method="get" action="/Info">
    이름 : <input type="text" name="name"><br>
    주소 : <input type="text" name="addr"><br>
    <input type="submit" value="전송">
</form>
<br>
<form method="post" action="/Info">
    <h3> post 방식에서 한글 깨짐 방지</h3>
    이름 : <input type="text" name="name"><br>
    주소 : <input type="text" name="addr"><br>
    <input type="submit" value="전송">
</form>
</body>
</html>