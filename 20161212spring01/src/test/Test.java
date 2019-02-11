package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Clzss;
import bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/* setter测试 */
		// Student s = context.getBean("studentOne", Student.class);
		/* constructor测试 */
		// Student s = context.getBean("studentTwo", Student.class);
		/* 内嵌对象 */
		// Student s = context.getBean("studentThree", Student.class);
		/* 引入对象 */
		// Student s = context.getBean("studentFour", Student.class);
		// System.out.println(s);
		/* 内嵌集合 */
		Clzss c = context.getBean("clzssTwo", Clzss.class);
		System.out.println(c);
	}

}