/** *文档加载时加载的方法** */
$(function() {
	/* 登录点击事件 */
	$('.login').click(function() {
		var condition = GetQueryString("urlBack");// 获取登录后返回页面的标识
		if (condition == null) {// 跳转到index
			condition = "index.jsp";
			userLogin(condition);//用户登录
		} else {// 跳转到原来页面
			userLogin(condition);//用户登录
		}
	});
});

/* 用户登录 */
function userLogin(obj) {
	var account = $('.account').val();// 获取用户名
	var password = $('.password').val();// 获取用户密码
	$.ajax({
		url : "login.do",
		type : "POST",
		data : {
			"username" : account,
			"password" : password
		},
		dataType : "text",
		success : function(dataBack) {
			if (dataBack == "1") {// 登录成功
				$('.password-span').html("");
				window.location.href = obj;//回到页面
			} else {// 登录失败
				$('.password-span').html("<span>用户名和密码不匹配</span>");
			}
		},
		error : function() {
		}
	});
}

/* 获取地址栏参数的方法 */
function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
