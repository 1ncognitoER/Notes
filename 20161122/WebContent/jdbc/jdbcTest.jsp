<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!-- 导入自定义类Student -->
<%@page import="jdbcTest.Student" %>
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
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "hr";
		String passWord = "000000";
		Connection conn = DriverManager.getConnection(url, user, passWord);
		PreparedStatement pstmt = conn.prepareStatement("select * from students");
		ResultSet rs = pstmt.executeQuery();
		
		List<Student> li = new ArrayList<Student>();
		while(rs.next()){
			int account = rs.getInt(1);
			String name = rs.getString(3);
			String classid = rs.getString(6);
			li.add(new Student(account,name,classid));
		}
		conn.close();
	%>
	<%=li %>
</body>
</html>