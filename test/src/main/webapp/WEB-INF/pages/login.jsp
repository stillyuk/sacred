<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登陆系统</title>
<script src="../jquery/jquery.js"></script>
<script type="text/javascript" src="../js/init.js"></script>
<link type="text/css" rel="stylesheet" href="../css/css.css" />
</head>
<body>
	<div class="head">
		<div class="head-action">
			<a class="button primary" href="">Sign in</a>
			<a class="button" href="">Sign up</a>
		</div>
	</div>
	<div class="auth-form" id="loginForm">
		<form action="login">
			<div class="auth-form-head"><h1>Sign in</h1></div>
			<div class="auth-form-body">
				<label for="login_field">Username or Email</label>
				<input id="login_field" class="input-block" type="text" />
				<label for="password_field">Password</label>
				<input id="password_field" class="input-block" type="text" />
				<input class="button" type="submit" value="Sign in" />
			</div>
		</form>
	</div>
</body>
</html>
