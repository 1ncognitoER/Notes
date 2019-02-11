<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" border="1px">
		<tr>
			<th>学号</th>
			<th>姓名</th>
		</tr>
	
	<%
	Map<Integer,String> m = new HashMap<Integer,String>();
	m.put(101, "qwer");
	m.put(102, "asdf");
	m.put(103, "zxcv");
	Set<Integer> s = m.keySet();
	for(Integer i:s){
	%>
	<tr>
		<td><%=i %></td>
		<td><%=m.get(i) %></td>
	</tr>
	<%} %>
	
	</table>
	
</body>
</html>