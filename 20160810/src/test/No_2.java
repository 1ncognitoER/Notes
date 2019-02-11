package test;

import java.util.Scanner;

/**
 * @author Blood Moon
 * @version 1.0
 *
 */

public class No_2 {

	public static void main(String[] args) {
		maoPao();
	}

	/**
	 * 冒泡排序法
	 */
	public static void maoPao() {
		int temp;
		int a[] = { 4, 65, 7, 8, 0, 1, 5 };
		for (int i = 0; i < a.length - 1; i++) { // 冒泡排序
			for (int j = 0; j < a.length - i - 1; j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

		}
		for (int i : a) { // 增强for循环 打印数组
			System.out.print(i + "\t");
		}
		System.out.println("数组中最大值为：" + a[a.length - 1]); // 最大值是排序后的最后一个数
	}

	/**
	 * 冒泡2
	 */
	public static void maoPao1() {
		Scanner in = new Scanner(System.in);
		int temp = 0;
		// 输入数组
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入数组的第" + (i + 1) + "个值：");
			arr[i] = in.nextInt();
		}
		// 排序
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {

				if (arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}

			}
		}
		// 输出排序后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// arr[i]=in.nextInt();
		}
		System.out.println();
		System.out.println(arr[4]);
	}

}
