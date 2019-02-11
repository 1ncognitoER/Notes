<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page two</title>
</head>
<body>
	<%
	String s = request.getParameter("txt");
	String ss =  request.getParameter("pic");
	%>
	<%=s %>
	<img alt="" src="img/<%=ss%>">
</body>
</html>