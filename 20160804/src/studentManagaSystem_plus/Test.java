package studentManagaSystem_plus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		mainSystem(in);
	}

	/**
	 * 登录主菜单
	 */
	static void mainSystem(Scanner in) {
		System.out.println("==========================================================");
		System.out.println("\t\t\t   用户登录");
		System.out.println("\t\t\t1.老师登录");
		System.out.println("\t\t\t2.学生登录");
		System.out.println("\t\t\t0.退出系统");
		System.out.println("==========================================================");
		System.out.print("请选择登陆方式：");
		try {
			switch (in.nextInt()) {
			case 0:
//				outSystem();
				break;
			case 1:
//				teacherSystem();
				break;
			case 2:
//				studentSystem();
				break;
			default:
				System.out.println("请重新输入！");
				mainSystem(in);
				// break;
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据非序号！");
		}
	}
}