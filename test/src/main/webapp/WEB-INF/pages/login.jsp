<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>webinf</title>
<script type="text/javascript" src="../js/init.js"></script>
<style type="text/css">
div {
	border: 1px dotted blue;
}
.nav {
	position: absolute;
	top: 10px;
	right: 10px;
}
.center {
	position: absolute;
	top: 50%;
	left: 50%;
}
</style>
</head>
<body background="../images/bg.jpg">
	<div class="nav"><a href="sys/registe.do">注册</a></div>
	<div class="center" style="width: 400px; height: 300px; margin-left: -200px; margin-top: -150px;">
		用户名：<input type="text" id="username" /><br>
		密码：<input type="text" id="password" /><br>
		<input type="submit" />
	</div>
</body>
</html>