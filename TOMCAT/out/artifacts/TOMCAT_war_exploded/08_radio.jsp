<%--
  Created by IntelliJ IDEA.
  User: bitweb
  Date: 21. 3. 8.
  Time: 오후 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html charset=UTF-8">
    <title>라디오 버튼 </title>
</head>
<body>
    <form method="get" action="/Radio">
        <label for="gender"> 성별 :</label>
        <input type="radio" id="gender"
            name="gender" value="남자" checked>남자
        <input type="radio" id="gender" name="gender" value="여자">여자 <br>
        <br>
        <label for="chk_mail"> 메일 정보 수신 여부 : </label>
        <input type="radio" id="chk_mail" name="chk_mail" value="yes"checked>수 신
        <input type="radio" id="chk_mail" name="chk_mail" value="no">거 부
        <br>
        <label for="content">간단한 가입 인사를 적어주세요</label><br>
        <textarea id="content" name="content" rows="3" cols="35"></textarea>
        <input type="submit" value="전송">
    </form>
</body>
</html>
