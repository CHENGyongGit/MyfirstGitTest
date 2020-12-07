<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-11-30
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>性别</th>
        <th colspan="2">操作</th>
      </tr>
        <c:forEach items="${list}" var="abc">
            <tr>
                <td>${abc.id}</td>
                <td>${abc.name}</td>
                <td>${abc.sex}</td>
                <td><a href="testUpdate?id=${abc.id}">修改</a></td>
                <td><a href="testDelete?id=${abc.id}" onclick="alert('删除成功！')">删除</a></td>
            </tr>
        </c:forEach>
        <a href="addPage.jsp">增加</a>
  </table>
  </body>
</html>
