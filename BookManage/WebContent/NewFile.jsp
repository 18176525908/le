<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
<table border="3" align="center" id="1">
    <tr>
        <td>id</td>
        <td>昵称</td>
        <td>姓名</td>
        <td>性别</td>
        <td>电话</td>
        <td>地址</td>
        <td>权限</td>
        <td>密码</td>
        <td>注册码</td>
        <td alian="center">操作</td>
    </tr>
<c:forEach items="${user}" var="u">
    <tr>
        <td>${u.id}</td>
        <td>${u.username}</td>
        <td>${u.name}</td>
        <td>${u.sex}</td>
        <td>${u.phone}</td>
        <td>${u.address}</td>
        <td>${u.power}</td>
        <td>${u.password}</td>
        <td>${u.loginNum}</td>
        <td><a href="UpdateUser?id=${u.id}">修改</a></td>
        <td><a href="DeleteUserServlet?id=${u.id}">删除</a></td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>