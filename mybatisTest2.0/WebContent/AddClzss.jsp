<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加班级</title>
</head>
<body>
	<form action="ClzssServlet" method="post">
		班级序号：<input type="text" name="clzssId"/><br/>
		班级名称：<input type="text" name="clzssName"/><br/>
		班级备注：<input type="text" name="clzssContent"/><br/>
		<input type="hidden" name="handle" value="add"/><br/>
		<input type="submit" value="确认添加"/>
		<input type="reset" value="清空"/>
	</form>
</body>
</html>