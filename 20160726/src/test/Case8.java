package test;

import java.util.Scanner;

public class Case8 {
	/*
	 * 第一题： 小球初始高度100 每次掉下弹起原来的一半 求10次过后的最后高度和小球经历的总路径
	 * 
	 * 第二题： 有一对兔子，从出生后第3个月起每个月都生 一对兔子，小兔子长到第三个月后每个月又生 一对兔子，假如兔子都不死.
	 * 问每个月的兔子总数为多少？
	 */
	static double sum = 0.0;// 小球经历的总路径

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// No.1
		double hight = 100;// 初始高度
		int i = 1;// 记录次数
		System.out.println("最后的高度为：" + calculate(i, hight) + "\n经历的总路程为：" + sum);

		System.out.println("=======================================");
		
		// No.2
		System.out.print("请输入经历的月数：");
		int month = in.nextInt();
		System.out.println("经历了" + month + "个月后兔子的总数为：" + calcul(month));
		
	}

	/**
	 * 计算兔子的数量
	 * 
	 * @param month
	 *            经历的月份
	 * @return
	 */
	static long calcul(int month) {
		long number1 = 2;// 成年
		long numbber2 = 0;// 未成年
		if (month == 0 || month == 1 || month == 2 || month == 3) {
			return number1;
		} else {
			for (int i = 4; i <= month; i = i + 3) {
				number1 = number1 + numbber2;// 每次 成年的兔子都是三个月前的兔子总和
				numbber2 = number1;// 每次 未成年的兔子都等于该月的成年兔子
			}
			return numbber2 + number1;
		}

	}

	/**
	 * 计算小球经历10次弹起的最后高度和经历的总路径
	 * 
	 * @param i
	 *            弹起的次数
	 * @param hight
	 *            弹起后的高度
	 * @return
	 */
	static double calculate(int i, double hight) {
		if (i <= 10) {
			sum = sum + hight + hight / 2;// 总路径为每次落下后再弹起的路径之和
			hight = hight / 2;// 落下后弹起的高度为之前的一半
			i++;
			return calculate(i, hight);// 最终高度
		} else {
			return hight;
		}
	}
}
