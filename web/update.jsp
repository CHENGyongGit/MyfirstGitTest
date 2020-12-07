<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-11-30
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
待修改信息：
<form method="post" action="testUpdate">
    <table border="1">
        <tr>
            <th>姓名</th>
            <td>
                <input type="hidden" name="id" value="${adc.id}">
                <input type="text" name="name" value="${adc.name}">
            </td>
        </tr>
        <tr>
            <th>性别</th>
            <td>
                <input type="text" name="sex" value="${adc.sex}">
            </td>
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
