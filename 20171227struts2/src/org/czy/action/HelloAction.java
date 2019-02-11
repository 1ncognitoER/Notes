package org.czy.action;

public class HelloAction {
	/**
	 * 在struts2中，默认执行execute方法，方法都是public修饰，返回值都是String类型，并且方法无参数
	 * @return
	 */
	public String execute() {
		System.out.println("Hello struts2");
		return "success";
	}
}
