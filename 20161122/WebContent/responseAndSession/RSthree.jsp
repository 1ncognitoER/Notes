<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎！
	<%
		String s = (String)session.getAttribute("loginName");
	%>
	<%=s %>
	<!--方法一-->
	<!-- <a href="RSfour.jsp">个人信息</a> -->
	<!--方法二-->
	<a href="RSfour.jsp?loginName=<%=s%>">个人信息</a>
</body>
</html>