<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
			<tr>
				<th>商品名称</th>
				<th>商品数量</th>
				<th>操作</th>
			</tr>
			<%
			Enumeration<String> em = session.getAttributeNames();
			while(em.hasMoreElements()){
				String s = em.nextElement();
			%>
			<tr>
				<td><%=s %></td>
				<td><%=session.getAttribute(s) %></td>
				<td><a href = "delete.jsp?name=<%=s%>">删除</a></td>
			</tr>
			<%}%>
		</table>
		<a href="buy.jsp">继续购买</a>
	</body>
</html>