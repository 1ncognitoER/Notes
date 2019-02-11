package test;

import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) {
		loading();
	}
	/**
	 * 方法1
	 */
	public static void loading(){
		Scanner in = new Scanner(System.in);
		String userN = "admin";
		String passW = "admin";
		int count = 0;// 登陆次数计数
		
		do{
			System.out.print("请输入用户名：");
			String nN=in.next();
			System.out.print("请输入密码：");
			String pW=in.next();
			
			if(userN.equals(nN) && passW.equals(pW)){
				System.out.println("登陆成功！");
			}else{
				count++;
				System.out.println("用户名和密码不匹配！");
			}
			
			
		}while(count!=3);
	}
	//方法2
	public static void loading1() {
		Scanner in = new Scanner(System.in);
		String userN = "admin";
		String passsW = "admin";
		int count = 0;// 用户名计数
		int count1 = 0;// 密码计数
		Boolean flag = false;

		do {
			System.out.print("请输人用户名：");
			String uN = in.next();

			if (userN.equals(uN)) {
				System.out.println("输入的用户名正确！");
				flag = false;

				System.out.print("请输人用密码：");
				String pW = in.next();

				if (passsW.equals(pW)) {
					flag = false;
					System.out.println("输入密码正确！");
					System.out.println("登陆成功！");
				} else {
					if (count1 == 2) {
						System.out.println("输入超过三次！不能登录！");
						flag = false;
					} else {

						System.out.println("输入的密码错误，请重新输入！");
						flag = true;
						count1++;
						// System.out.println(count1);
					}
				}
			} else {
				if (count == 2) {
					System.out.println("输入超过三次！不能登录！");
					flag = false;
				} else {
					System.out.println("输入的用户名错误，请重新输入！");
					flag = true;
					count++;
					// System.out.println(count);
				}
			}
		} while (flag);		
	}
}
