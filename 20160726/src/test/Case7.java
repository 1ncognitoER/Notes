package test;

import java.util.Scanner;

public class Case7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// //打印矩形
		// rectangle();

		// //打印制定行列的矩形
		// System.out.print("请输入行：");
		// int row=in.nextInt();
		// System.out.print("请输入列：");
		// int column= in.nextInt();
		// rectangle1(row,column);

		 //计算两小数的和
		 System.out.print("请输入第一个小数：");
		 double num1=in.nextDouble();
		 System.out.print("请输入第一个小数：");
		 double num2=in.nextDouble();
		 System.out.println( calculate(num1,num2));

		// //打印100以内所有十位数+个位数=9的数字
//		output();

	}

	// 打印矩形
//	public static void rectangle() {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("^");
//			}
//			System.out.println();
//		}
//	}

	// 打印制定行列的矩形
//	public static void rectangle1(int row, int column) {
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= column; j++) {
//				System.out.print("^");
//			}
//			System.out.println();
//		}
//	}

	// 计算两小数的和
	public static double calculate(double num1, double num2) {
		return num1 + num2;
	}

	// 打印100以内所有十位数+个位数=9的数字
//	public static void output() {
//		for (int i = 1; i <= 100; i++) {
//			int geWei = i % 10;
//			int shiWei = (i / 10) % 10;
//			if (geWei + shiWei == 9) {
//				System.out.print(i + " ");
//			}
//		}
//	}

}
