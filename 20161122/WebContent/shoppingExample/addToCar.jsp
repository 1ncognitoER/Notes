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
	<%
		String g = request.getParameter("goods");
		String n = request.getParameter("number");
		Enumeration<String> em = session.getAttributeNames();
		boolean flag = true;
		while(em.hasMoreElements()){
			String s = em.nextElement();
			if(g.equals(s)){
				//该商品在购物车中的数量
				int a = Integer.parseInt((String)session.getAttribute(s));
				//加和后的数量
				int b = a + Integer.parseInt(n);
				session.setAttribute(s,b+"");
				flag = false;
			}
		}
		if(flag){
			//只有购物车中没有该商品时执行
			session.setAttribute(g,n);
		}
		response.sendRedirect("myGoods.jsp");
	%>
</body>
</html>