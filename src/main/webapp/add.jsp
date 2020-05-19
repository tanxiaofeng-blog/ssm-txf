<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/18
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./addOrUpdate" method="post">
    <input type="hidden" name="sid" value="${user.id}">
    姓名：<input type="text" name="name" placeholder="用户名" value="${user.name}"><br>
    性别：<input type="radio" name="gender" value="${user.gender}" >女&nbsp;
    <input type="radio" name="gender" value="${user.gender}">男<br>
    生日：<input type="text" name="birthday" placeholder="生日" value="${user.birthday}"><br>
    <input type="submit">
</form>
</body>
</html>
