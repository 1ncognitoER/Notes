<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<!-- .action为扩展名。扩展名要和web.xml中配置的struts2的核心过滤器<url-pattern>相匹配 -->
	<form action="login.action" method="post">
		账号：<input type="text" name="account"/><br>
		密码：<input type="password" name="password"/><br>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>