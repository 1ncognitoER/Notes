package org.czy.action;

public class LoginAction {
	/* 类属性和表单中name属性名称一致，struts2会通过get/set方法自动进行数据的双向传递 */
	private String account;
	private String password;
	/**
	 * 默认请求处理方法
	 * @return
	 */
	public String execute() {
		if ("incognitoER".equalsIgnoreCase(account) && "000000".equals(password)) {
			return "success";
		} else {
			return "failed";
		}
	}
	/**
	 * 自定义请求处理方法 在action配置中的method需要指明
	 * @return
	 */
	public String logout() {
		System.out.println("logout account");
		return "success";
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
