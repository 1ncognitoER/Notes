<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
</head>
<body>
	<form action="student.do" method="post">
		序号：<input type="text" name="studentId"/><br/>
		姓名：<input type="text" name="studentName"/><br/>
		性别：<input type="text" name="studentSex"/><br/>
		年龄：<input type="text" name="studentAge"/><br/>
		备注：<input type="text" name="studentContent"/><br/>
		班级：<input type="text" name="clzssId"/>
		<input type="hidden" name="handle" value="add"/><br/>
		<input type="submit" value="确认添加"/>
		<input type="reset" value="清空"/>
	</form>
</body>
</html>