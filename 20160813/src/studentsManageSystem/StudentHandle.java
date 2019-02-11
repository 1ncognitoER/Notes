package studentsManageSystem;

import java.util.List;
import java.util.Scanner;

public class StudentHandle {
	// private Students student;
	//
	// public StudentHandle(){
	// this.student = new Students();
	// }

	public static void handle(List data, Scanner input) {
		// 登陆验证
		// System.out.println(data.size());
		System.out.print("请输入学号：");
		long id = input.nextLong();

		for (int index = 0; index < data.size(); index++) {
			// 学号验证
			if (id == ((Students) (data.get(index))).getIDNumber()) {
				// 密码验证
				System.out.print("请输入密码：");
				String pW = input.next();
				if (pW.equals(((Students) (data.get(index))).getPassWord())) {
					System.out.println("登录成功！");
					// 进入学生系统菜单
					studentsMenu(data, input);
				} else {
					System.out.println("用户密码输入错误,请重新登陆！");
					handle(data, input);
				}
			} else {
				continue;
				// System.out.println("没有该用户,请重新登陆！");
				// handle(data,input);
			}
		}
	}

	private static void studentsMenu(List data, Scanner input) {
		// TODO Auto-generated method stub
		System.out.println("==========================================");
		System.out.println("\t\t1.查询信息");
		System.out.println("\t\t2.添加信息");
		System.out.println("\t\t3.修改信息");
		System.out.println("\t\t4.删除信息");
		System.out.println("\t\t0.返回主菜单");
		System.out.println("==========================================");
		System.out.print("请选择：");
		switch (input.nextInt()) {
		case 0:
			Test.mainSystem();
			// break;
		case 1:
			search(data, input);
			break;
		case 2:
			add(data, input);
			break;
		case 3:
			modify(data, input);
			break;
		case 4:
			delete(data, input);
			break;
		default:
			break;
		}
	}

	private static void delete(List data, Scanner input) {
		// TODO Auto-generated method stub
		System.out.print("请输入需要被删除学生的学号：");
		long idNumber = input.nextLong();
		for(int index=0 ; index<data.size(); index++){
			if(idNumber== ((Students)(data.get(index))).getIDNumber()){
				data.remove(index);
				System.out.print("删除成功！\t“y”或“Y”继续删除\t“n”或“N”返回学生菜单:");
				if ("y".equalsIgnoreCase(input.next())) {
					delete(data, input);
				} else {
					studentsMenu(data, input);
				}
			}else{
				continue;
			}
			System.out.println("没有该数据！");
			delete(data, input);
		}
	}

	private static void modify(List data, Scanner input) {
		// TODO Auto-generated method stub
		System.out.print("请输入需要被修改学生的学号：");
		long idNumber = input.nextLong();
		for (int index = 0; index < data.size(); index++) {
			if (idNumber == ((Students) (data.get(index))).getIDNumber()) {
				System.out.println("==================================================");
				System.out.println("1.ID 2.passWord 3.name 4.age 5.phoneNumber 6.score");
				System.out.println("==================================================");
				System.out.print("请选择需要修改的项：");
				switch (input.nextInt()) {
				case 1:
					System.out.print("请输入新的学号：");
					idNumber = input.nextLong();
					((Students) (data.get(index))).setIDNumber(idNumber);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				case 2:
					System.out.print("请输入新的密码：");
					String pWord = input.next();
					((Students) (data.get(index))).setPassWord(pWord);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				case 3:
					System.out.print("请输入新的姓名：");
					String name = input.next();
					((Students) (data.get(index))).setName(name);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				case 4:
					System.out.print("请输入新的年龄：");
					int age = input.nextInt();
					((Students) (data.get(index))).setAge(age);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				case 5:
					System.out.print("请输入新的电话号码：");
					String phoneNumber = input.next();
					((Students) (data.get(index))).setPhoneNumber(phoneNumber);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				case 6:
					System.out.print("请输入新的分数：");
					int score = input.nextInt();
					((Students) (data.get(index))).setScore(score);
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(data, input);
					} else {
						studentsMenu(data, input);
					}
					// break;
				default:
					modify(data, input);
					break;
				}
			} else {
				continue;
			}
			System.out.print("没有对应的信息请重新输入！");
			modify(data, input);
		}
	}

	private static void add(List data, Scanner input) {
		// TODO Auto-generated method stub
		System.out.print("请输入新学号：");
		long idNumber = input.nextLong();
		System.out.print("请输入密码：");
		String pWord = input.next();
		System.out.print("请输入姓名：");
		String name = input.next();
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		System.out.print("请输入电话号码：");
		String phoneNumber = input.next();
		System.out.print("请输入分数：");
		int score = input.nextInt();
		data.add(new Students(idNumber, pWord, name, age, phoneNumber, score));
		System.out.println("添加成功！");
		System.out.print("是否继续添加信息？\t“y”或“Y”继续添加\t“n”或“N”返回学生菜单:");
		if ("y".equalsIgnoreCase(input.next())) {
			add(data, input);
		} else {
			studentsMenu(data, input);
		}
	}

	private static void search(List data, Scanner input) {
		// TODO Auto-generated method stub
		for (Object object : data) {
			System.out.println(object);
		}
		System.out.println("==========================================");
		System.out.print("是否继续？\t“y”或“Y”继续\t“n”或“N”返回登陆界面:");
		if ("y".equalsIgnoreCase(input.next())) {
			studentsMenu(data, input);
		} else {
			Test.mainSystem();
		}
	}

}
