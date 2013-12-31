<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>ok</title>
<script src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../js/init.js"></script>
<style type="text/css">
div {
	border: 1px dotted blue;
	margin: 5px;
}
.nav {
	float: right;
	top: 10px;
	right: 10px;
}
.divform {
	width: 400px;
	height: 300px;
	padding: 5px;
}
.center {
	position: absolute;
	top: 40%;
	left: 50%;
}
.btn {
	position: absolute;
	top: 75%;
	left: 50%;
	width: 88px;
	height: 30px;
	margin-left: -44px;
	margin-top: -15px;"
}
</style>
</head>
<body background="../images/bg.jpg">
	<div>
		<div class="nav"><a href="sys/login">Sign up</a></div>
		<div class="nav"><a href="sys/login">Sign in</a></div>
	</div>
	<div class="center" style="width: 400px; height: 300px; margin-left: -200px; margin-top: -150px;">
		<form class="divform" action="login">
			<div style="border:1px dotted red;">
				<div>用户名：</div>
				<div style="position: absolute; float: right;"><input type="text" id="username" /></div>
			</div>
			<div>
				<div style="width:100px;">密码：</div>
				<div style="position: absolute; float: right;"><input type="text" id="password" /></div>
			</div>
			<div class="btn"><input type="submit" value="Sign in" /></div>
		</form>
	</div>
</body>
</html>
