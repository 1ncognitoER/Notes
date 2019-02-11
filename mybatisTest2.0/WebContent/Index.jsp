<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	function update(abc,id){
		var tr = abc.parentElement.parentElement;
		var name = tr.children[1].firstChild.value;
		var sex = tr.children[2].firstChild.value;
		var age = tr.children[3].firstChild.value;
		var content = tr.children[4].firstChild.value;
		$.ajax({
			url:"StudentServlet",
			type:"POST",
			data:{"studentId":id,"studentName":name,"studentAge":age,"studentSex":sex,"studentContent":content,"handle":"update"},
			dataType:"text",
			success:function(dataBack){
				if(dataBack == "1"){
					alert("修改成功！");
				}
			},
			error:function(){
				
			}
		});
	}
</script>
</head>
<body>
	<table width="100%" border="1" cellpadding="0" cellspacing="0">
		<caption>Student列表</caption>
		<tr style="background-color: aqua;">
			<th>学生序号</th>
			<th>学生姓名</th>
			<th>学生性别</th>
			<th>学生年龄</th>
			<th>学生备注</th>
			<th>班级名称</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${studentList}" var="s" varStatus="ss">
		<tr align="center">
			<td style="background-color: aqua;">${ss.index+1 }</td>
			<td><input type="text" value="${s.studentName }"></td>
			<td><input type="text" value="${s.studentSex }"></td>
			<td><input type="text" value="${s.studentAge }"></td>
			<td><input type="text" value="${s.studentContent }"></td>
			<td><a href="ClzssServlet?clzssId=${s.clzss.getClzssId() }&handle=select">${s.clzss.getClzssName() }</a></td>
			<td><input type="button" value="修改" onclick="update(this,${s.studentId});">
			<a href = "StudentServlet?studentId=${s.studentId}&handle=delete">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="AddStudent.jsp">添加信息</a>
	<!-- <a href="AddStudent.jsp" target="_block">添加信息</a> -->
</body>
</html>