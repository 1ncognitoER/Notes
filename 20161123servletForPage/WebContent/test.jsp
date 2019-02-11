<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*,org.employee.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>结合jsp 和 servlet 实现分页</title>
</head>
<body>
	<%
		List<Employee> employee = (List<Employee>)request.getAttribute("employee");
		int currentPage = (Integer)request.getAttribute("currentPage");
		int maxPage = (Integer)request.getAttribute("maxPage");
	%>
	<table width="100%" border="1px">
		<caption>employee information</caption>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>salary</th>
		</tr>
		<%
			for (Employee em : employee) {
		%>
		<tr>
			<td><%=em.getId()%></td>
			<td><%=em.getName()%></td>
			<td><%=em.getSalary()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href = "MyServlet?currentPage=1">home</a>
	<%if(currentPage != 1){ %>
	<a href = "MyServlet?currentPage=<%=currentPage-1%>">previous</a>
	<%} %>
	<%if(currentPage < maxPage){ %>
	<a href = "MyServlet?currentPage=<%=currentPage+1%>">next</a>
	<%} %>
	<a href = "MyServlet?currentPage=<%=maxPage%>">end</a>
</body>
</html>