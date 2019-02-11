package test;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Num=in.nextInt();
		// 用以控制每行数据的输出
		for (int i = 1; i <= Num; i++) { // 前面的直角三角形
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < Num; k++) {//倒的三角形
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
