<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/18
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="add.jsp">新增</a>
<form action="./findByNames" method="post">
    <input name="name" placeholder="姓名">
    <input type="submit">
</form>
<table>
    <tr>
        <th>编号</th><th>姓名</th><th>性别</th><th>生日</th><th>操作</th>
    </tr>
    <c:forEach items="${list}" var="row">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
            <td>${row.gender}</td>
            <td>${row.birthday}</td>
            <td><a href="selectByID?id=${row.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
