package test;

import java.util.Scanner;

/**
 * @author Blood Moon
 */
public class Case {

	public static void main(String[] args) {
		int[]arr =new int[5];
		
		input(arr);
		output(calcu(arr));
		
	}
	/**
	 *
	 *@param 输入数组数据
	 *
	 */
	public static int[] input(int[] array){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("请输入第"+(i+1)+"个工程师的月薪：");
			array[i]=in.nextInt();
		}
		return array;
	}
	/**
	 * 数组数据计算
	 * @param array
	 * @return
	 */
	public static int[] calcu(int[] array){
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>1000){
				sum++;
			}else{
				array[i]+=1000;
			}
		}
		System.out.println("月薪大于1000的有"+sum+"人。");
		return array;
	}
	/**
	 * 输出数组数据
	 * @param array
	 */
	public static void output(int[]array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
