package fingerGuessingGame;

import java.util.Scanner;

public class Opponent {

	private String name;

	public String getName() {
		return name;
	}

	public Opponent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Opponent(String name) {
		super();
		this.name = name;
	}

	/**
	 * VS
	 */
	void VS() {

		System.out.println("1.剪刀\t2.石头\t3.布\t0.返回选角界面");
		System.out.print("请选择：");
		int shouShi = new Scanner(System.in).nextInt();

		CalculateAndShow(shouShi);

	}

	/**
	 * 随机生成和输出记分板
	 */
	void CalculateAndShow(int shouShi) {
		int num = 0;// 记录系统随机生成数

		switch (shouShi) {

		case 1:// 玩家出剪刀
			num = (int) (1 + Math.random() * 3);
			if (num == 1) {// 系统出剪刀
				System.out.println(getName() + "出剪刀" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else if (num == 2) {// 系统出石头
				Menu.score1++;
				System.out.println(getName() + "出石头" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else {// 系统出布
				Menu.score++;
				System.out.println(getName() + "出布" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			}
			VS();
			// break;
		case 2:// 玩家出石头
			num = (int) (1 + Math.random() * 3);
			if (num == 1) {// 系统出剪刀
				Menu.score++;
				System.out.println(getName() + "出剪刀" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else if (num == 2) {// 系统出石头
				System.out.println(getName() + "出石头" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else {// 系统出布
				Menu.score1++;
				System.out.println(getName() + "出布" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			}
			VS();
			// break;
		case 3:// 玩家出布
			num = (int) (1 + Math.random() * 3);
			if (num == 1) {// 系统出剪刀
				Menu.score1++;
				System.out.println(getName() + "出剪刀" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else if (num == 2) {// 系统出石头
				Menu.score++;
				System.out.println(getName() + "出石头" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			} else {// 系统出布
				System.out.println(getName() + "出布" + " 你与" + getName() + "的比分为：" + Menu.score + ":" + Menu.score1);
			}
			VS();
			// break;
		case 0:
			new Menu().selectOpponent();
			// break;
		default:
			System.out.println("你竟然还有第四种出拳方式，好厉害啊！");
			VS();
			break;
		}
	}

}
