package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.AOPed;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AOPed aed = context.getBean("AOPed", AOPed.class);
		// aed.aop();
		// aed.aopOne();
		aed.aopTwo();
	}

}
