package studentManageSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
	private String userName = "admin";
	private String passWord = "123";

	static Scanner in = new Scanner(System.in);

	/**
	 * 老师登录用户名验证
	 */
	void teacherUNLoad() {
		System.out.print("请输入用户名：");
		String userN = in.next();
		if (userN.equals(getUserName())) {
			teacherPWLoad();
		} else {
			System.out.println("没有该用户！\t1.重新输入 0.返回主菜单");
			if (in.nextInt() == 0) {
				Test.mainSystem();
			} else {
				System.out.println("==========================================");
				teacherUNLoad();
			}
		}
	}

	/**
	 * 老师登录密码验证
	 */
	void teacherPWLoad() {
		System.out.print("请输入密码：");
		String passW = in.next();
		if (passW.equals(getPassWord())) {
			System.out.println("登陆成功！");
			Test.teacherMenu();
		} else {
			System.out.println("密码输入错误，请重新输入！");
			teacherPWLoad();
		}
	}

	/**
	 * 添加学生数据
	 */
	void addStudentInformation() {
		int flag = 0;
		try {
			System.out.println("==========================================");
			System.out.print("请输入学号：");
			long userNumber = in.nextLong();
			System.out.print("请输入密码：");
			String passWord = in.next();

			System.out.print("请输入姓名：");
			String name = in.next();
			System.out.print("请输入性别：");
			String sex = in.next();
			System.out.print("请输入电话号码：");
			String phoneNumber = in.next();
			System.out.print("请输入家庭住址：");
			String address = in.next();
			System.out.print("请输入年龄：");
			int age = in.nextInt();
			System.out.print("请输入QQ号：");
			long QQNumber = in.nextLong();

			for (int i = 0; i < Test.st.length; i++) {
				if (Test.st[i] == null) {
					// flag++;
					Test.st[i] = new Friends(userNumber, passWord, name, sex, phoneNumber, address, age, QQNumber, "no",
							"noRem");
					System.out.println("成功添加信息!");
					break;
				}
			}
//			if (flag == 0) {
//				System.out.println("存储空间不够！无法添加新数据！");
//				// teacherMenu();
//			}
			System.out.print("是否继续？（任意键继续，N或n返回上一级）：");
			if (!(in.next().equalsIgnoreCase("n"))) {
				addStudentInformation();
			} else {
				Test.teacherMenu();
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法！");
		}
	}

	/**
	 * 查找学生信息
	 */
	void searchStudentInformation() {
		System.out.println("学号\t密码\t姓名\t性别\t电话号码\t地址\t年龄\tQQ号");
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.st[i] != null) {
				System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getPassWord() + "\t"
						+ Test.st[i].getName() + "\t" + Test.st[i].getSex() + "\t" + Test.st[i].getPhoneNumber() + "\t"
						+ Test.st[i].getAddress() + "\t" + Test.st[i].getAge() + "\t" + Test.st[i].getQQNumber());
			}
		}
		// for (Students student:st) {
		// if(student!=null){
		// System.out.println(student);
		// }
		// }
		System.out.print("任意键返回上一级：");
		if (in.next().equalsIgnoreCase("y")) {
			Test.teacherMenu();
		} else {
			Test.teacherMenu();
		}
	}

	/**
	 * 修改学生信息
	 */
	void updataStudentInformation() {
		try {
			System.out.print("请输入学号：");
			long userNumber = in.nextLong();
			int flag = 0;
			for (int i = 0; i < Test.st.length; i++) {
				if (userNumber == Test.st[i].getUserNumber()) {
					flag++;
					System.out.println("请修改信息！");
					System.out.print("请输入新的学号：");
					Test.st[i].setUserNumber(in.nextLong());
					System.out.print("请输入新的密码：");
					Test.st[i].setPassWord(in.next());
					System.out.print("请输入新的姓名：");
					Test.st[i].setName(in.next());
					System.out.print("请输入新的性别：");
					Test.st[i].setSex(in.next());
					System.out.print("请输入新的电话号码：");
					Test.st[i].setPhoneNumber(in.next());
					System.out.print("请输入新的地址：");
					Test.st[i].setAddress(in.next());
					System.out.print("请输入新的年龄：");
					Test.st[i].setAge(in.nextInt());
					System.out.print("请输入新的QQ号：");
					Test.st[i].setQQNumber(in.nextLong());

					System.out.println("修改后的信息如下：");
					searchStudentInformation();

					break;
				}
			}
			if (flag == 0) {
				System.out.println("没有该人！无法修改信息！");
			}
			System.out.print("任意键返回上一级：");
			if (in.next().equalsIgnoreCase("y")) {
				Test.teacherMenu();
			} else {
				Test.teacherMenu();
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法！");
		}
	}

	/**
	 * 删除学生信息
	 */
	void deleteStudentInformation() {

		int flag = 0;
		// 将数组（学生）遍历一遍
		System.out.println("学号\t密码\t姓名\t性别\t电话号码\t地址\t年龄\tQQ号");
		for (int i = 0; i < Test.st.length; i++) {
			// System.out.println(i);
			if (Test.st[i] != null) {
				System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getPassWord() + "\t"
						+ Test.st[i].getName() + "\t" + Test.st[i].getSex() + "\t" + Test.st[i].getPhoneNumber() + "\t"
						+ Test.st[i].getAddress() + "\t" + Test.st[i].getAge() + "\t" + Test.st[i].getQQNumber());
			}
		}

		try {
			System.out.print("请输入需要删除的学生的学号：");
			long userNumber = in.nextLong();
			for (int i = 0; i < Test.st.length; i++) {
				if (userNumber == Test.st[i].getUserNumber()) {
					flag++;
					Test.st[i] = null;
					// 后面的数据往前挪
					for (int j = i + 1, k = i; j < Test.st.length; j++, k++) {
						Test.st[k] = Test.st[j];
						Test.st[j] = null;
					}
					for (int u = 0; u < Test.st.length; u++) {
						// 去掉没有数据的数组显示的null
						if (Test.st[u] != null) {
							System.out.println(Test.st[u]);
						}
					}
					break;
				}
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法！");
		}
		if (flag == 0) {
			System.out.println("没有该人！无法删除信息！");
		}
		System.out.print("任意键返回上一级：");
		if (in.next().equalsIgnoreCase("y")) {
			Test.teacherMenu();
		} else {
			Test.teacherMenu();
		}
	}

	/* 对外接口 */
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}