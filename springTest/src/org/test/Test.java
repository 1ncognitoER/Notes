package org.test;

import org.bean.Student;
import org.dao.DaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DaoImpl di = context.getBean("daoImpl", DaoImpl.class);
		di.insertStudent(new Student(4, "ÏôÑ×"));
	}

}
