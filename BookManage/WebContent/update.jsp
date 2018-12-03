<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.divForm{
position: absolute;/*绝对定位*/
width: 500px;
height: 400px;
font-size:20px;
border: 1px solid white;
text-align: center;/*(让div中的内容居中)*/
top: 50%;
left: 50%;
margin-top: -250px;
margin-left: -250px;
}
</style>
</head>
<body>
<div class="divForm">
<form action="UpdateUserServlet" mothod="post">
<h4>修改用户</h4>
	<input type="hidden" name="id" value="${u.id}"><br><br>
	用户名：<input type="text" name="username" value="${u.username}"><br><br>
	  &nbsp;&nbsp;&nbsp;姓名：<input type="text" name="name" value="${u.name}"><br><br>
	 &nbsp;&nbsp;&nbsp;电话：<input type="text" name="phone" value="${u.phone}"><br><br>
	  &nbsp;&nbsp;&nbsp;地址：<input type="text" name="address" value="${u.address}"><br><br>
	<input type="submit" value="修改"> 
</form>
</div>
</body>
</html>