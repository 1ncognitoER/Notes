package afterClass;

import java.util.Scanner;

public class Case6 {

	public static void main(String[] args) {
		double max = 0;
//		double min=0;
		double min =2e31-1;
		Scanner input = new Scanner(System.in);

		for (; true;) {
			System.out.print("请输入一个整数(0结束)：");
			double num = input.nextInt();
			//第一种方法
			if (num == 0) {
				break;
			}
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			
			
//			//第二种方法
//			if (num == 0) {
//				break;
//			}
//			if (num > max) {
//				max = num;
//			}
//			if (num < max) {
//				if(num<min)//min永远会等于零，所以不可取
//					min = num;
//			}
			
			
		}
		System.out.println("最大值为：" + max + "最小值为：" + min);
	}

}
