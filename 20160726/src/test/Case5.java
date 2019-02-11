package test;

import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		int rows = input();
		output(rows);
	}

	public static int input() {
		Scanner In = new Scanner(System.in);
		System.out.print("请输入打印菱形的行数：");
		int rows = In.nextInt();
		rows=rows/2+1;
		return rows;
	}

	public static void output(int rows) {
//		// 实心菱形
//		System.out.println("实心菱形如下：");
//		for (int i = 1; i <=2*rows-1; i++) {
//			if (i <= rows)// 上半部分输出
//			{
//				// 用以控制每行前面的空格数
//				for (int k = i; k < rows; k++) {
//					System.out.print(" ");
//				}
//				// 用以控制每行数据的输出
//				for (int j = 1; j <= i; j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			} else// 下半部分输出
//			{
//				// 用以控制每行前面的空格数
//				for (int k = rows; k < i; k++) {
//					System.out.print(" ");
//				}
//				// 用以控制每行数据的输出
//				for (int j = i; j <2*rows; j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//		}

		// 空心菱形
		System.out.println("空心菱形如下：");
		for (int i = 1; i <= 2*rows-1; i++) {
			if (i <= rows) {// 上半部分输出
				for (int k = i; k < rows; k++) {// 用以控制每行前面的空格数
					System.out.print(" ");
				}
				// 用以控制每行数据的输出
				for (int j = 1; j <= i; j++) {
					if (j == 1 || j == i || j == 2 || j == i - 1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			} else {// 下半部分输出
				for (int k = rows; k < i; k++) {// 用以控制每行前面的空格数
					System.out.print(" ");
				}
				for (int j = i; j < 2*rows; j++) {// 用以控制每行数据的输出
					if (j == i || j ==2*rows-1 || j == i + 1  || j == 2*(rows - 1)/**/)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}
}
