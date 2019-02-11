package afterClass;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {

	/**
	 * 现有一手机销售网站。用户登陆该网站可以查看所有手机 的价格和品牌。当用户选择某一手机时会显示出具体的手
	 * 机商品信息（品牌、价格、款式（智能或者非智能）、颜 色等）。此时判断用户是否购买。如果购买，购买后输出
	 * 剩余的产品。如果不购买提醒用户是退出还是继续查看手 机。（假设该网站每个款式的手机只有一个） 要求： 使
	 * 用list集合不要全部代码放在main方法 中注意注释
	 * 
	 * @return
	 */

	// 创建Scanner对象
	static Scanner in = new Scanner(System.in);
	// 创建ArrayList集合
	static ArrayList ar = new ArrayList();
	// 创建admin对象
	static Admin admin = new Admin();
	// 记录需要购买的商品品牌
	static String bra;

	// 初始化数据
	{
		ar.add(new Phone("iphone", 6666, "智能", "玫瑰金", 1));
		ar.add(new Phone("nubia", 1999, "智能", "黑色", 1));
		ar.add(new Phone("sumsang", 2888, "智能", "白色", 1));
		ar.add(new Phone("NOKIA", 555, "非智能", "绅士黑", 1));
	}

	public void show() {
		for (Object object : ar) {
			System.out.println(object);
		}
	}

	/**
	 * 购买判断
	 */
	public void buyJudge() {

		try {
			System.out.println("====================================");
			System.out.println("是否需要购买？\t1.购买 0.退出");
			if (in.nextInt() == 0) {
				System.exit(0);
			} else {
				buy();
//				for (int i = 0; i < ar.size(); i++) {
//					if (bra.equals(((Phone) ar.get(i)).getBrand())) {
//						((Phone) ar.get(i)).number--;
////						System.out.println(((Phone) ar.get(i)).number);
//					}
//				}
			}
		} catch (InputMismatchException e) {
			System.out.println("输入的选项不是整型数据！");
		}
	}

	private void buy() {
		System.out.println("====================================");
		System.out.println("购买成功！");
		for (int i = 0; i < ar.size(); i++) {
			if (bra.equals(((Phone) ar.get(i)).getBrand())) {
				((Phone) ar.get(i)).number--;
				System.out.println(bra + "剩余数量为：" + ((Phone) ar.get(i)).getNumber());
			}
		}
	}

	/**
	 * 主菜单
	 */
	public void menu() {
		try {
			System.out.println("====================================");
			System.out.println("\t\t1.登录");
			System.out.println("\t\t0.退出");
			System.out.println("====================================");
			System.out.print("请选择：");
			switch (in.nextInt()) {
			case 0:
				System.exit(0);// 结束程序
				break;
			case 1:
				login();
				break;
			default:
				System.out.println("没有该选项");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("输入的数据类型不是整型！");// 数据错误结束程序
		}

	}

	/**
	 * 登录方法
	 */
	private void login() {

		Boolean flag = false;

		System.out.print("请输入用户名：");
		String id = in.next();
		System.out.print("请输入密码：");
		String pW = in.next();
		if (admin.getUserName().equals(id)) {

			do {
				if (admin.getPassWord().equals(pW)) {
					System.out.println("登录成功！");

					allShow();// 展示所用手机信息

				} else {
					System.out.println("密码输入错误！请重新输入！");
					flag = true;
				}
			} while (flag);

		} else {
			System.out.println("用户名输入错误！请重新输入！");
			login();
		}
	}

	private void allShow() {
//		//注意:一个循环中只能有一个it.next();
//		Iterator it = ar.iterator();
//		while (it.hasNext()) {
//			System.out.print("Phone [brand=" + ((Phone) it.next()).getBrand() + "\t\t price="
//					+ ((Phone) it.next()).getPrice() + "]");
//		}
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		
		//显示所有的机型信息
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("Phone [brand=" + ((Phone) ar.get(i)).getBrand() + "\t\t price="
					+ ((Phone) ar.get(i)).getPrice() + "]");
		}
		//查看详细机型信息
		System.out.print("选择品牌查看详细信息：");
		bra = in.next();
		for (int i = 0; i < ar.size(); i++) {
			if (((Phone) ar.get(i)).getBrand().equals(bra)) {
				System.out.println(ar.get(i));
			}
		}
		
	}

}