package studentManageSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 学生管理系统demo测试类
 * 
 * @author Blood Moon
 *
 */
public class Test {

	static Scanner in = new Scanner(System.in);

	static Students[] st = new Friends[50];
	// 创建老师和好友对象
	static Teacher te = new Teacher();
	static Friends fr = new Friends();
	// 用来记录登录的账号
	static long userN;

	/**
	 * 主方法
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 部分数据初始化
		st[0] = new Friends(201, "111", "demo", "boy", "17701", "r1", 23, 18001, "yes", "em");
		st[1] = new Friends(202, "222", "demo1", "G", "17702", "r2", 19, 18000, "no", "noRem");
		st[2] = new Friends(203, "333", "demo2", "boy", "17703", "r3", 24, 18003, "yes", "oR");
		// 进入系统
		mainSystem();
	}

	/**
	 * 登录主菜单
	 */
	static void mainSystem() {
		System.out.println("==========================================");
		System.out.println("\t\t   用户登录");
		System.out.println("\t\t1.老师登录");
		System.out.println("\t\t2.学生登录");
		System.out.println("\t\t0.退出系统");
		System.out.println("==========================================");
		System.out.print("请选择登陆方式：");
		try {
			switch (in.nextInt()) {
			case 0:
				outSystem();
				break;
			case 1:
				teacherSystem();
				break;
			case 2:
				studentSystem();
				break;
			default:
				System.out.println("请重新输入！");
				mainSystem();
				// break;
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据非序号！");
		}
	}

	/**
	 * 退出程序
	 */
	static void outSystem() {
		System.exit(0);
	}

	/**
	 * 进入学生子系统
	 */
	static void studentSystem() {
		fr.UNLoad();
	}

	/**
	 * 学生主菜单
	 */
	static void studentsMenu() {
		System.out.println("==========================================");
		System.out.println("\t\t1.查询个人信息");
		System.out.println("\t\t2.修改密码");
		System.out.println("\t\t3.查询同学信息");
		System.out.println("\t\t4.添加好友");
		System.out.println("\t\t5.显示所有好友信息");
		System.out.println("\t\t6.删除好友");
		System.out.println("\t\t7.修改好友备注");
		System.out.println("\t\t0.返回主菜单");
		System.out.println("==========================================");
		System.out.print("请选择功能模块：");
		switch (in.nextInt()) {
		case 0:
			Test.mainSystem();
			break;
		case 1:
			fr.showInformation();
			break;
		case 2:
			fr.updataPassWork();
			break;
		case 3:
			fr.searchInformation();
			break;
		case 4:
			fr.addFriends();
			break;
		case 5:
			fr.showFriendsInformation();
			break;
		case 6:
			fr.deleteFriends();
			break;
		case 7:
			fr.updataStudentRemark();
			break;
		default:
			System.out.println("请重新选择功能模块！");
			studentsMenu();
			break;
		}
	}

	/**
	 * 进入老师子系统
	 */
	static void teacherSystem() {
		// teacherUNLoad();
		te.teacherUNLoad();
	}

	/**
	 * 老师功能菜单
	 */
	static void teacherMenu() {
		System.out.println("==========================================");
		System.out.println("\t\t1.添加学生信息");
		System.out.println("\t\t2.查询学生信息");
		System.out.println("\t\t3.修改学生信息");
		System.out.println("\t\t4.删除学生信息");
		System.out.println("\t\t0.返回主菜单");
		System.out.println("==========================================");
		System.out.print("请选择功能模块：");
		try {
			switch (in.nextInt()) {
			case 0:
				Test.mainSystem();
				break;
			case 1:
				te.addStudentInformation();
				break;
			case 2:
				te.searchStudentInformation();
				break;
			case 3:
				te.updataStudentInformation();
				break;
			case 4:
				te.deleteStudentInformation();
				break;
			default:
				System.out.println("请重新选择功能模块！");
				teacherMenu();
				break;
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据非序号！");
		}
	}

}
