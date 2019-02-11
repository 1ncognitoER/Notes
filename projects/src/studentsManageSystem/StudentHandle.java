package studentsManageSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentHandle {
	/**
	 * 登录验证及基本CRUD操作
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	public static void handle(Scanner input) throws Exception {

		// 将数据从文件调入集合
		List<Students> data = new ArrayList<Students>();
		data = FileDeal.readFile();
		// //测试代码
		// FileHandle.clearFile();
		// for (Students students : data) {
		// System.out.println(students);
		// }

		// 输入待比较的数据
		System.out.print("请输入学号：");
		long id = input.nextLong();
		// 循环遍历集合
		for (int index = 0; index < data.size(); index++) {
			// 学号验证
			if (id == ((Students) (data.get(index))).getIDNumber()) {
				// 密码验证
				System.out.print("请输入密码：");
				String pW = input.next();
				if (pW.equals(((Students) (data.get(index))).getPassWord())) {
					System.out.println("登录成功！");
					// 进入学生系统菜单
					studentsMenu(input);
				} else {
					System.out.println("用户密码输入错误,请重新登陆！");
					handle(input);
				}
			} else {
				continue;
			}
		}
		System.out.println("没有该用户,请重新登陆！");
		handle(input);
	}

	/**
	 * 学生菜单
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	private static void studentsMenu(Scanner input) throws Exception {
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
			search(input);
			break;
		case 2:
			add(input);
			break;
		case 3:
			modify(input);
			break;
		case 4:
			delete(input);
			break;
		default:
			System.out.println("请重新选择！");
			studentsMenu(input);
			break;
		}
	}

	/**
	 * 删除操作
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	private static void delete(Scanner input) throws Exception {
		// TODO Auto-generated method stub
		List<Students> data = new ArrayList<Students>();
		data = FileDeal.readFile();

		System.out.print("请输入需要被删除学生的学号：");
		long idNumber = input.nextLong();
		for (int index = 0; index < data.size(); index++) {
			if (idNumber == ((Students) (data.get(index))).getIDNumber()) {
				// 删除集合中的数据
				data.remove(index);
				// 将集合中的数据存入文件
				FileDeal.writeFile(data);
				// // 测试代码
				// System.out.println("----------------");
				// for (Students students : FileHandle.readFile()) {
				// System.out.println(students);
				// }
				System.out.print("删除成功！\t“y”或“Y”继续删除\t“n”或“N”返回学生菜单:");
				if ("y".equalsIgnoreCase(input.next())) {
					delete(input);
				} else {
					studentsMenu(input);
				}
			} else {
				continue;
			}
			System.out.println("没有该数据！");
			delete(input);
		}
	}

	/**
	 * 修改操作
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	private static void modify(Scanner input) throws Exception {
		// TODO Auto-generated method stub
		List<Students> data = new ArrayList<Students>();
		data = FileDeal.readFile();

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
					// 修改集合中的学号数据
					((Students) (data.get(index))).setIDNumber(idNumber);
					// 将集合中德数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				case 2:
					System.out.print("请输入新的密码：");
					String pWord = input.next();
					// 修改集合中的密码数据
					((Students) (data.get(index))).setPassWord(pWord);
					// 将集合的数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				case 3:
					System.out.print("请输入新的姓名：");
					String name = input.next();
					// 修改集合中的姓名数据
					((Students) (data.get(index))).setName(name);
					// 将集合中的数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				case 4:
					System.out.print("请输入新的年龄：");
					int age = input.nextInt();
					// 修改集合中的年龄数据
					((Students) (data.get(index))).setAge(age);
					// 将集合中的数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				case 5:
					System.out.print("请输入新的电话号码：");
					String phoneNumber = input.next();
					// 修改集合中的电话号码数据
					((Students) (data.get(index))).setPhoneNumber(phoneNumber);
					// 将集合中的数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				case 6:
					System.out.print("请输入新的分数：");
					int score = input.nextInt();
					// 修改集合中的分数数据
					((Students) (data.get(index))).setScore(score);
					// 将集合中的数据存入文件
					FileDeal.writeFile(data);
					// // 测试代码
					// System.out.println("----------------");
					// for (Students students : FileHandle.readFile()) {
					// System.out.println(students);
					// }
					System.out.print("修改成功！\t“y”或“Y”继续修改\t“n”或“N”返回学生菜单:");
					if ("y".equalsIgnoreCase(input.next())) {
						modify(input);
					} else {
						studentsMenu(input);
					}
					break;
				default:
					modify(input);
					break;
				}
			} else {
				continue;
			}
			System.out.print("没有对应的信息请重新输入！");
			modify(input);
		}
	}

	/**
	 * 增加操作
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	private static void add(Scanner input) throws Exception {
		// TODO Auto-generated method stub
		List<Students> data = new ArrayList<Students>();
		data = FileDeal.readFile();

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
		// 将数据写入集合
		data.add(new Students(idNumber, pWord, name, age, phoneNumber, score));
		// 将集合数据写入文件
		FileDeal.writeFile(data);

		System.out.println("添加成功！");
		System.out.print("是否继续添加信息？\t“y”或“Y”继续添加\t“n”或“N”返回学生菜单:");
		if ("y".equalsIgnoreCase(input.next())) {
			add(input);
		} else {
			studentsMenu(input);
		}
	}

	/**
	 * 查询操作
	 * 
	 * @param data
	 * @param input
	 * @throws Exception
	 */
	private static void search(Scanner input) throws Exception {
		// TODO Auto-generated method stub
		List<Students> data = new ArrayList<Students>();
		data = FileDeal.readFile();

		for (Object object : data) {
			System.out.println(object);
		}
		System.out.println("==========================================");
		System.out.print("是否继续？\t“y”或“Y”继续\t“n”或“N”返回登陆界面:");
		if ("y".equalsIgnoreCase(input.next())) {
			studentsMenu(input);
		} else {
			Test.mainSystem();
		}
	}

}
