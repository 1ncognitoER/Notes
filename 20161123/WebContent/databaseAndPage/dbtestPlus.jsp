<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.util.ArrayList"%>
<%@page import="databaseTest.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页技术（改进）</title>
</head>
<body>

	<%
		//当前页
		int currentPage = 1;
		//首次访问该页面	request.getParameter("currentPage")为空
		if (request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		//运用Java命名和目录接口（JNDI）用于连接数据源
		Context context = new InitialContext();
		//连接数据源
		DataSource ds = (DataSource) context.lookup("java:comp/env/dataSource");
		//创建连接
		Connection conn = ds.getConnection();
		//数据库中当前页的最后一条数据的序号
		int end = currentPage * 10 + 1;
		//数据库中当前页的第一条数据的序号
		int start = (currentPage - 1) * 10;
		//申明集合用于缓存查询结果
		List<Employee> li = new ArrayList<Employee>();
		//查询员工信息
		PreparedStatement psTwo = conn.prepareStatement(
				"select * from (select employees.*,rownum as r from employees where rownum<?) e where e.r>?");
		psTwo.setInt(1, end);
		psTwo.setInt(2, start);
		ResultSet rs = psTwo.executeQuery();
		while (rs.next()) {
			li.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(8)));
		}
		conn.close();
	%>
	<table width="100%" border="1px">
		<caption>employee information</caption>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>salary</th>
		</tr>
		<%
			for (Employee em : li) {
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
	
	<%
		if(currentPage<=1){
	%>
	<a href="dbtestPlus.jsp?currentPage=<%=currentPage + 1%>">next</a>
	<%
		}else if(li.size()==10){
	%>
	<a href="dbtestPlus.jsp?currentPage=<%=currentPage - 1%>">previous</a>
	<a href="dbtestPlus.jsp?currentPage=<%=currentPage + 1%>">next</a>
	<%
		}else{
	%>
	<a href="dbtestPlus.jsp?currentPage=<%=currentPage - 1%>">previous</a>
	<%
		}
	%>
	
</body>
</html>