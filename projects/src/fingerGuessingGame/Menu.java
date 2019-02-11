package fingerGuessingGame;

import java.util.Scanner;

public class Menu {
	static int score = 0;// 玩家得分
	static int score1 = 0;// 系统得分
	static Scanner in = new Scanner(System.in);

	/**
	 * 游戏开始界面
	 */
	void startGame() {
		System.out.println("==================================");
		System.out.println("\t欢迎进入猜拳小游戏\t");
		System.out.println("==================================");
		System.out.print("Y或y开始游戏,N或n结束游戏：");
		String str = in.next();
		if (str.equalsIgnoreCase("n")) {
			outSystem();// 退出游戏
		} else if (str.equalsIgnoreCase("y")) {
			selectOpponent();// 选择对手
		} else {
			System.out.println("选择不合法！请重新输入！");
			startGame();
		}
	}

	/**
	 * 选择对手
	 */
	void selectOpponent() {

		score = 0;// 玩家数据清零
		score1 = 0;// 系统数据清零

		System.out.println("==================================");
		System.out.println("您的对手有：1.太白 2.天香 3.神威  4.丐帮");
		System.out.println("0.返回开始界面");
		System.out.println("==================================");
		System.out.print("请选择：");

		int num = in.nextInt();

		switch (num) {
		case 0:
			startGame();
			break;
		case 1:
			new Opponent("太白").VS();
			break;
		case 2:
			new Opponent("天香").VS();
			break;
		case 3:
			new Opponent("神威").VS();
			break;
		case 4:
			new Opponent("丐帮").VS();
			break;
		default:
			System.out.println("没有你输入序，请重新输入！");
			selectOpponent();
			break;
		}
	}

	/**
	 * 结束程序
	 */
	private void outSystem() {
		System.exit(0);
	}
}
