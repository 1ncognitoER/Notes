package studentManageSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Friends extends Students {

	private String isFriend;
	private String remark;// 备注

	static Scanner in = new Scanner(System.in);

	/**
	 * 学生登录用户名验证
	 */
	void UNLoad() {
		try {
			System.out.print("请输入学号：");
			Test.userN = in.nextLong();
			for (int i = 0; i < Test.st.length; i++) {

				if (Test.st[i] != null) {// 避免数组的空指针
					if (Test.userN == Test.st[i].getUserNumber()) {
						PWLoad(i);
					} else {
						continue;
					}
				} else {
					System.out.println("没有该用户！\t1.重新输入 0.返回主菜单");
					if (in.nextInt() == 0) {
						Test.mainSystem();
					} else {
						System.out.println("==========================================");
						UNLoad();
					}
				}
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("数据输入不合法！");
		}
	}

	/**
	 * 学生登录密码验证
	 * 
	 * @param i
	 *            数组遍历下标
	 * 
	 */
	void PWLoad(int i) {
		System.out.print("请输入密码：");
		String passW = in.next();
		if (passW.equals(Test.st[i].getPassWord())) {
			System.out.println("登录成功！");
			Test.studentsMenu();
		} else {
			PWLoad(i);
		}
	}

	/**
	 * 查询个人信息
	 */
	void showInformation() {
		try {
			System.out.println("学号\t密码\t姓名\t性别\t电话号码\t地址\t年龄\tQQ号");
			for (int i = 0; i < Test.st.length; i++) {
				if (Test.userN == Test.st[i].getUserNumber()) {
					System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getPassWord() + "\t"
							+ Test.st[i].getName() + "\t" + Test.st[i].getSex() + "\t" + Test.st[i].getPhoneNumber()
							+ "\t" + Test.st[i].getAddress() + "\t" + Test.st[i].getAge() + "\t"
							+ Test.st[i].getQQNumber());
					// // 在此终止避免数组空指针
					// System.out.print("任意键返回上一级：");
					// if (in.next().equalsIgnoreCase("y")) {
					// Test.studentsMenu();
					// } else {
					// Test.studentsMenu();
					// }

				} else {
					continue;
				}

			}
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("数组出现空指针！");
		}
	}

	/**
	 * 修改密码
	 */
	void updataPassWork() {
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.userN == Test.st[i].getUserNumber()) {
				do {
					System.out.print("请输入新密码：");
					String pW1 = in.next();
					System.out.print("请再次输入新密码：");
					String pW2 = in.next();
					if (pW1.equals(pW2)) {
						Test.st[i].setPassWord(pW1);
						System.out.println("新密码设置成功！");
						// 跳回学生菜单
						System.out.print("任意键返回上一级：");
						if (in.next().equalsIgnoreCase("y")) {
							Test.studentsMenu();
						} else {
							Test.studentsMenu();
						}
					} else {
						System.out.println("两次输入的密码不匹配！重新输入！");
						continue;
					}
				} while (true);
			} else {
				continue;
			}
		}

	}

	/**
	 * 查询同学信息
	 */
	void searchInformation() {
		System.out.println("学号\t姓名\t性别\t电话号码\t地址\t年龄\tQQ号\t好友");
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.st[i] != null) {
				System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getName() + "\t" + Test.st[i].getSex()
						+ "\t" + Test.st[i].getPhoneNumber() + "\t" + Test.st[i].getAddress() + "\t"
						+ Test.st[i].getAge() + "\t" + Test.st[i].getQQNumber() + "\t"
						+ ((Friends) Test.st[i]).getIsFriend());
			} else {
				System.out.print("任意键返回上一级：");
				if (in.next().equalsIgnoreCase("y")) {
					Test.studentsMenu();
				} else {
					Test.studentsMenu();
				}

			}
		}

	}

	/**
	 * 添加好友
	 */
	void addFriends() {
		long uN;

		try {
			System.out.print("请输入你要加的好友的学号：");
			uN = in.nextLong();
			System.out.print("请好友备注：");
			String remark = in.next();
			for (int i = 0; i < Test.st.length; i++) {
				if (Test.st[i] != null) {
					if (Test.st[i].getUserNumber() == uN) {
						((Friends) Test.st[i]).setIsFriend("yes");
						((Friends) Test.st[i]).setRemark(remark);
						System.out.println("好友添加成功！");
						// 跳回学生菜单
						System.out.print("任意键返回上一级：");
						if (in.next().equalsIgnoreCase("y")) {
							Test.studentsMenu();
						} else {
							Test.studentsMenu();
						}
					} else {
						continue;
					}
				} else {
					// 跳回学生菜单
					System.out.print("任意键返回上一级：");
					if (in.next().equalsIgnoreCase("y")) {
						Test.studentsMenu();
					} else {
						Test.studentsMenu();
					}
				}
			}

		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的学号不合法！");
		}

	}

	/**
	 * 打印好友列表
	 */
	void showFriendsInformation() {
		System.out.println("学号\t姓名\t备注\t性别\t电话号码\t地址\t年龄\tQQ号\t好友");
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.st[i] != null) {
				if (!(((Friends) Test.st[i]).getIsFriend().equals("no"))) {
					System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getName() + "\t"
							+ ((Friends) Test.st[i]).getRemark() + "\t" + Test.st[i].getSex() + "\t"
							+ Test.st[i].getPhoneNumber() + "\t" + Test.st[i].getAddress() + "\t" + Test.st[i].getAge()
							+ "\t" + Test.st[i].getQQNumber() + "\t" + ((Friends) Test.st[i]).getIsFriend());
				} else {
					continue;
				}
			} else {
				// 跳回学生菜单
				System.out.print("任意键返回上一级：");
				if (in.next().equalsIgnoreCase("y")) {
					Test.studentsMenu();
				} else {
					Test.studentsMenu();
				}
			}
		}
	}

	/**
	 * 删除好友
	 */
	void deleteFriends() {

		// 打印好友列表
		System.out.println("学号\t姓名\t备注\t性别\t电话号码\t地址\t年龄\tQQ号\t好友");
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.st[i] != null) {
				if (!(((Friends) Test.st[i]).getIsFriend().equals("no"))) {
					System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getName() + "\t"
							+ ((Friends) Test.st[i]).getRemark() + "\t" + Test.st[i].getSex() + "\t"
							+ Test.st[i].getPhoneNumber() + "\t" + Test.st[i].getAddress() + "\t" + Test.st[i].getAge()
							+ "\t" + Test.st[i].getQQNumber() + "\t" + ((Friends) Test.st[i]).getIsFriend());
				} else {
					continue;
				}
			}
		}
		// 删除好友操作
		try {
			System.out.print("请输入需要删除的好友的学号：");
			long uN = in.nextLong();

			for (int i = 0; i < Test.st.length; i++) {
				if (Test.st[i] != null) {
					if (Test.st[i].getUserNumber() == uN) {
						((Friends) Test.st[i]).setIsFriend("no");
						((Friends) Test.st[i]).setRemark("noRemark");
						System.out.println("好友删除成功！");
						// 跳回学生菜单
						System.out.print("任意键返回上一级：");
						if (in.next().equalsIgnoreCase("y")) {
							Test.studentsMenu();
						} else {
							Test.studentsMenu();
						}
					} else {
						continue;
					}
				} else {
					// 跳回学生菜单
					System.out.print("任意键返回上一级：");
					if (in.next().equalsIgnoreCase("y")) {
						Test.studentsMenu();
					} else {
						Test.studentsMenu();
					}
				}
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法！");
		}
	}

	/**
	 * 修改备注
	 */
	void updataStudentRemark() {
		// 打印好友列表
		System.out.println("学号\t姓名\t备注\t性别\t电话号码\t地址\t年龄\tQQ号\t好友");
		for (int i = 0; i < Test.st.length; i++) {
			if (Test.st[i] != null) {
				if (!(((Friends) Test.st[i]).getIsFriend().equals("no"))) {
					System.out.println(Test.st[i].getUserNumber() + "\t" + Test.st[i].getName() + "\t"
							+ ((Friends) Test.st[i]).getRemark() + "\t" + Test.st[i].getSex() + "\t"
							+ Test.st[i].getPhoneNumber() + "\t" + Test.st[i].getAddress() + "\t" + Test.st[i].getAge()
							+ "\t" + Test.st[i].getQQNumber() + "\t" + ((Friends) Test.st[i]).getIsFriend());
				} else {
					continue;
				}
			}
		}
		// 修改备注
		try {
			System.out.print("请输入需要修改备注好友的学号：");
			long uN = in.nextLong();
			System.out.print("请重新设置备注：");
			String remark = in.next();

			for (int i = 0; i < Test.st.length; i++) {
				if (Test.st[i] != null) {

					if (Test.st[i].getUserNumber() == uN) {

						((Friends) Test.st[i]).setRemark(remark);
						System.out.println("备注设置成功！");

						// // 跳回学生菜单
						System.out.print("任意键返回上一级：");
						if (in.next().equalsIgnoreCase("y")) {
							Test.studentsMenu();
						} else {
							Test.studentsMenu();
						}

					} else {
						continue;
					}

				} else {
					// 跳回学生菜单
					System.out.print("任意键返回上一级：");
					if (in.next().equalsIgnoreCase("y")) {
						Test.studentsMenu();
					} else {
						Test.studentsMenu();
					}
				}
			}
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("输入的数据不合法！");
		}

	}

	/* 构造方法 */
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friends(long userNumber, String passWord, String name, String sex, String phoneNumber, String address,
			int age, long qQNumber, String isFriend, String remark) {
		super(userNumber, passWord, name, sex, phoneNumber, address, age, qQNumber);
		this.isFriend = isFriend;
		this.remark = remark;
	}

	/* 对外接口 */
	public String getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(String isFriend) {
		this.isFriend = isFriend;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}