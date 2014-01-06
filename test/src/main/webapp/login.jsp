<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>用户登录</title>
<link rel="stylesheet" href="style.css" type="text/css" />
<body>
	<s:form action="doLogin.action">
		<table border="1">
			<tr>
				<s:textfield name="loginName" label="用户名"
					style="width:300px; height:40px" />
			</tr>
			<tr>
				<s:textfield name="loginPwd" label="密码"
					style="width:300px; height:40px;" />
			</tr>
			
		</table>
		<s:submit value="确认" />
		<s:reset value="取消" />
	</s:form>
</body>
</html>