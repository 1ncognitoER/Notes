<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String sex = request.getParameter("sex");
	String[] hobby = request.getParameterValues("hobby");
	String[] selects = request.getParameterValues("selects");
	String textArea = request.getParameter("textArea");
	%>
	<div>账号：<%=username %></div>
	<div>密码：<%=password %></div>
	<div>性别：<%=sex %></div>
	<div>
	爱好：
	<%
		for(String s: hobby){
			out.print(s+" ");
		}
	%>
	</div>
	<div>
	选择：
	<%
		for(String ss: selects){
			out.print(ss+" ");
		}
	%>
	</div>
	<div>文本：<%=textArea %></div>

</body>
</html>