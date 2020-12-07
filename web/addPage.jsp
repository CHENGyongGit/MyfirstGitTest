<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-11-30
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="testInsert" method="post">
    <table border="1">
        <tr>
            <th>姓名</th>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <th>性别</th>
            <td><input type="text" name="sex"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
