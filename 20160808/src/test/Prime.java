package test;

import java.util.Scanner;

public class Prime {
	/**
	 * 质数:只能被1和自身整除 且不是1
	 * // 判断a是不是质数
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int c = 0;
		
		System.out.print("请输入一个数字：");
		a=in.nextInt();
		
		for (int b = 2; b < a; b++) {
			if (a % b != 0) {
				c++;
			}
		}
		if (c == a - 2) {
			System.out.println(a + "是质数");
		} else {
			System.out.println(a + "不是质数");
		}
	}
}