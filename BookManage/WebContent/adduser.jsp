<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>insert</title>
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
<h3>添加新用户</h3>
<form action = "AddUserServlet" method = "post">
	&nbsp;&nbsp;&nbsp;id:<input type="" name="id" value=""><br><br>
	用户名：<input type="text" name="username" value=""><br><br>
	  c姓名：<input type="text" name="name" value=""><br><br>
	 &nbsp;&nbsp;&nbsp;电话：<input type="text" name="phone" value=""><br><br>
	  &nbsp;&nbsp;&nbsp;地址：<input type="text" name="address" value=""><br><br>
  <tr><td><input type="submit" value="确定" ></td>
      <td><input type="reset" value="重置" ></td>
  </tr>
</div>
</form>
</body>
</html>