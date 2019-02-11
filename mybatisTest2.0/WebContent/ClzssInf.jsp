<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>clzss信息</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	function update(cl,clzssId) {
		var tr = cl.parentElement.parentElement;
		var id = tr.children[0].firstChild.value;
		var name = tr.children[1].firstChild.value;
		var content = tr.children[2].firstChild.value;
		$.ajax({
			url:"ClzssServlet",
			type:"POST",
			data:{"clzssId":id,"clzssName":name,"clzssContent":content,"handle":"update"},
			dataType:"text",
			success:function(dataBack){
				if(dataBack=="1"){
					alert("班级信息修改成功！");
				}
			},
			error:function(){}
		}); 
	}
</script>
</head>
<body>
	<table width="100%" border="1" cellpadding="0" cellspacing="0">
		<caption>clzss列表</caption>
		<tr style="background-color: aqua;">
			<th>班级序号</th>
			<th>班级名称</th>
			<th>学生备注</th>
			<th>操作</th>
		</tr>
		<c:if test="${one }">
			<tr align="center">
				<td style="background-color: aqua;"><input type="text" value="${clzss.clzssId }" style="border: none;background-color: aqua;"/></td>
				<td><input type="text" value="${clzss.clzssName }"></td>
				<td><input type="text" value="${clzss.clzssContent }"></td>
				<td><input type="button" value="确认修改" onclick="update(this,${clzss.clzssId});">
				<a href="ClzssServlet?clzssId=${clzss.clzssId}&handle=delete">确认删除</a></td>
			</tr>
		</c:if>
		<c:if test="${all }">
			<c:forEach items="${clzssList}" var="c">
				<tr align="center">
					<td style="background-color: aqua;"><input type="text" value="${c.clzssId }" style="border: none;background-color: aqua;"/></td>
					<td><input type="text" value="${c.clzssName }"></td>
					<td><input type="text" value="${c.clzssContent }"></td>
					<td><input type="button" value="确认修改" onclick="update(this,${c.clzssId});">
					<a href="ClzssServlet?clzssId=${c.clzssId}&handle=delete">确认删除</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<a href="AddClzss.jsp">添加信息</a>
</body>
</html>