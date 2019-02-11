package test;

import java.util.Scanner;

/**
 * @author Blood Moon
 * 小型面积计算系统
 */
public class Case3 {
	
	static boolean flag = true;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		do{
		menu();
		}while(flag);
	}
	/*
	 *主菜单 
	 */
	private static void menu() {
			System.out.println("-------------------------");
			System.out.println("\t面积计算系统\t");
			System.out.println("-------------------------");
			System.out.println("1.计算三角形面积");
			System.out.println("2.计算矩形面积");
			System.out.println("3.计算圆形面积");
			System.out.println("0.退出");
			
			System.out.print("请输入序号：");
			int key=in.nextInt();
			
			switch (key) {
			case 0:
				flag=false;
				break;
			case 1:
				calculateSanJiao();
				break;
			case 2:
				calculateJvXing();
				break;
			case 3:
				calculateYuanXing();
				break;
			default:
				System.out.println("输入的序号不合法！！！");
				break;
			}
	}
	/**
	 * 计算三角形的面积
	 */
	public static void calculateSanJiao(){
		System.out.print("请输入三角形的底：");
		int di=in.nextInt();
		System.out.print("请输入三角形的高：");
		int gao=in.nextInt();
		System.out.println("三角形的面积为："+(di*gao/2));
	}
	/**
	 * 计算矩形的面积
	 */
	public static void calculateJvXing(){
		System.out.print("请输入矩形的长：");
		int chang=in.nextInt();
		System.out.print("请输入矩形的宽：");
		int kuan=in.nextInt();
		System.out.println("矩形的面积为："+(chang*kuan));
	}
	/**
	 * 计算园形的面积
	 */
	public static void calculateYuanXing(){
		double pai=3.14159;
		System.out.print("请输入园形的半径：");
		int r=in.nextInt();
		System.out.println("园形的面积为："+(pai*r*r));
	}
}
