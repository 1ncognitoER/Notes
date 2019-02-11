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
		//获取指定名字（名称为 username 和 password ）的值
		String account = request.getParameter("username");
		String password = request.getParameter("password");
		//判断用户名和密码
		if("admin".equals(account) && "000000".equals(password)){
			//登陆成功
			session.setMaxInactiveInterval(10);//设置会话时间
			session.setAttribute("loginName", account);//将用户名同步到 loginName
			response.sendRedirect("RSthree.jsp");//重定向到 RSthree.jsp 页面
		}else{
			response.sendRedirect("RSone.jsp");//重定向到 RSone.jsp 页面,重新登陆
		}
	%>
</body>
</html>