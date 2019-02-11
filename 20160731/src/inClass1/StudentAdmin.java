package inClass1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentAdmin {

	static Scanner in = new Scanner(System.in);
	static Student[] stu = new Student[10];

	{
		stu[0] = new Student("a", 13);
		stu[1] = new Student("b", 11);
		// stu[2]=new Student("a",14);
	}

	/**
	 * 开始菜单
	 */
	public void start() {

		// 无法用try-catch来实现输入异常的捕捉后再次调用开始菜单（即start（）方法）
		// 思路：可以自定义一个异常类来实现该功能

//		do {
			try {
				System.out.println("------------------------------");
				System.out.println("\t欢迎进入学生管理系统\t");
				System.out.println("\t1.添加学生信息\t");
				System.out.println("\t2.查询学生信息\t");
				System.out.println("\t3.修改学生信息\t");
				System.out.println("\t4.删除学生信息\t");
				System.out.println("\t0.退出学生管理系统\t");
				System.out.println("------------------------------");
				System.out.print("请输入选项：");

				int n = in.nextInt();//
				switch (n) {
				case 0:
					outSystem();// 退出系统
					break;
				case 1:
					addStudent();// 添加学生信息
					break;
				case 2:
					searchStudent();// 查询学生信息
					break;
				case 3:
					updateStudent();// 修改学生信息
					break;
				case 4:
					deleteStudent();// 删除学生信息
					break;
				default:
					System.out.println("输入的序号有误！");
					start();
				}

			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("输入的数据非整型！请重新输入");
//				System.out.print("输入y继续：");
//				if("y".equalsIgnoreCase(in.next())){
//					start();
//				}else{
//					System.exit(0);
//				}
			}

//		} while (true);

	}

	/**
	 * 删除学生信息
	 */
	private void deleteStudent() {
		try {
			System.out.print("请输入需要删除的学生的姓名：");
			String name = in.next();
			for (int i = 0; i < stu.length; i++) {
				if (name.equalsIgnoreCase(stu[i].getName())) {
					stu[i] = null;
					System.out.println("删除成功！");
					break;
				}
//				if (i == stu.length - 1) {
//					System.out.println("查无此人！");
//				}
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("数组出现空指针异常！");
		}
	}

	/**
	 * 修改学生信息
	 */
	private void updateStudent() {
		try {
			System.out.print("请输入需要修改的学生的姓名：");
			String name1 = in.next();
			System.out.print("请输入该学生的姓名：");
			String name = in.next();
			System.out.print("请输入该学生的年龄：");
			int age = in.nextInt();
			for (int i = 0; i < stu.length; i++) {
				if (name1.equalsIgnoreCase(stu[i].getName())) {
					stu[i].setName(name);
					stu[i].setAge(age);
					break;
				}
				if (i == stu.length - 1) {
					System.out.println("查无此人！");
					break;
				}
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("录入的信息含有非法字符！");
		}
	}

	/**
	 * 查询学生信息
	 */
	private void searchStudent() {
		for (Student student : stu) {
			if (student != null) {
				System.out.println(student);
			}
		}
	}

	/**
	 * 退出系统
	 */
	private void outSystem() {
		System.exit(0);
	}

	/**
	 * 添加学生
	 */
	private void addStudent() {

		try {
			System.out.print("请输入学生的姓名：");
			String name = in.next();
			System.out.print("请输入学生的年龄：");
			int age = in.nextInt();
			Student s = new Student(name, age);

			for (int i = 0; i < stu.length; i++) {

				if (stu[i] == null) {
					stu[i] = s;
					System.out.println("成功添加信息！");
					break;
				}
			}

		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法，请重新输入！");
		}
	}

}