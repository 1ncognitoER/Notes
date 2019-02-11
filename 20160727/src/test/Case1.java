package test;

import java.util.Scanner;

/**
 * @author Blood Moon
 *
 */
public class Case1 {

	public static void main(String[] args) {
		String[]array=new String[5];
		
//		input(array);
		output(input(array));
	}
	/**
	 *@param 输入数组数据
	 */
	public static String[] input(String[] array){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("请输入第"+(i+1)+"句话：");
			array[i]=in.next();
		}
		return array;
	}
	/**
	 *@param 逆序输出数组数据
	 */
	public static void output(String[] array){
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	
}
