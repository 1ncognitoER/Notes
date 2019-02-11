<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	function doAjax1() {
		$.ajax({
			url:"sevenOne.do",
			type:"POST",
			dataType:"text",
			success:function(dataBack){
				/*将json格式字符串转化为json对象*/
				var jdata = eval("("+dataBack+")");
				alert(jdata.studentName);
			}
		});
	}
	function doAjax2() {
		$.ajax({
			url:"sevenTwo.do",
			type:"POST",
			dataType:"text",
			success:function(dataBack){
				/*将json格式字符串转化为json对象*/
				var jdata = eval("("+dataBack+")");
				alert(jdata.studentName);
			}
		});
	}
	function doAjax3() {
		$.ajax({
			url:"sevenThird.do",
			type:"POST",
			dataType:"json",
			success:function(dataBack){
				alert(dataBack[1].studentName);
			}
		});
	}
</script>
</head>
<body>
	here is index page
	<hr/>
	<input type="button" onclick="doAjax1()" value="BUTTON1"/>
	<input type="button" onclick="doAjax2()" value="BUTTON2"/>
	<input type="button" onclick="doAjax3()" value="BUTTON3"/>
	<hr/>
	${name1 }<br/>
	${name2 }<br/>
</body>
</html>