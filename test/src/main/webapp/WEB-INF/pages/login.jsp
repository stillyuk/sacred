<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登陆系统</title>
<script src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../js/init.js"></script>
<style type="text/css">
div {
	border: 1px dotted green;
	margin: 5px;
}
.nav {
	float: right;
	top: 10px;
	right: 10px;
}
.divform {
	position: absolute;
	top: 40%;
	left: 50%;
	width: 400px;
	height: 300px;
	padding: 5px;
	margin-top: -150px;
	margin-left: -200px;
}
.center {
	position: absolute;
	top: 40%;
	left: 50%;
}
.btn {
	position: absolute;
	top: 85%;
	left: 50%;
	width: 84px;
	height: 30px;
	margin-left: -42px;
	margin-top: -15px;
}
</style>
</head>
<body background="../images/bg.jpg">
	<div class="nav"><a href="sys/login">Sign up</a></div>
	<div class="nav"><a href="sys/login">Sign in</a></div>
	<div class="divform">
		<form action="login">
			<div style="height: 80px;">
				<div style="width: 100px;">用户名：</div>
				<div style="float: right;"><input type="text" id="username" name="username" /></div>
			</div>
			<div style="height: 80px;">
				<div style="width: 100px;">密码：</div>
				<div style="float: right;"><input type="text" id="password" name="password" /></div>
			</div>
			<div class="btn"><input type="submit" value="Sign in" /></div>
		</form>
	</div>
</body>
</html>
