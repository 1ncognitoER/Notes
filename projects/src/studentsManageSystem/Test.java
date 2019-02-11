package studentsManageSystem;

import java.util.*;

public class Test {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/* 初始化数据 */
		// List<Students> data = new ArrayList<Students>();
		// data.add(new Students(2016001, "123", "caozhenyu", 21, "17701086342",
		// 66));
		// data.add(new Students(2016002, "123", "wangxianfu", 20,
		// "15905531234", 77));
		// FileHandle.writeFile(data);
		/* 测试代码 */
		// for (Students student : FileHandle.readFile()) {
		// System.out.println(student);
		// }

		// 主程序入口
		mainSystem();
	}

	/**
	 * 主程序入口
	 * 
	 * @throws Exception
	 */
	public static void mainSystem() throws Exception {
		// 用户界面
		System.out.println("==========================================");
		System.out.println("\t\t   用户登录");
		System.out.println("\t\t1.学生登录");
		System.out.println("\t\t2.老师登陆");
		System.out.println("\t\t0.退出");
		System.out.println("==========================================");
		System.out.print("请选择登陆方式：");
		try {
			switch (input.nextInt()) {
			case 0:
				System.out.println("退出成功！");
				System.exit(0);
				break;
			case 1:
				students();
				break;
			case 2:
				teacher();
				break;
			default:
				System.out.println("请重新输入序号！");
				mainSystem();
				// break;
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("输入的数据非序号！");
		}
	}

	/**
	 * 学生子系统
	 * 
	 * @throws Exception
	 */
	public static void students() throws Exception {
		// 调用StudentHandle中的handle方法
		StudentHandle.handle(input);
	}

	/**
	 * 老师子系统
	 */
	public static void teacher() {
	}
}
