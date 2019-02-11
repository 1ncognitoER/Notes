package test;

import java.util.Scanner;

/**
 * @author Blood Moon
 *@param 有一组数分别为18,25,7,36,13,2,89,63求出最小的值,并将最小的数与最小的数所在的下标输出
 */
public class Case2 {

	public static void main(String[] args) {
		int[]array=new int[8];
		
		calculat(input(array));
		
	}
	/**
	 *@param 输入数组数据
	 */
	public static int[] input(int[] array){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			array[i]=in.nextInt();
		}
		return array;
	}
	/**
	 *@param 计算数组数据
	 */
	public static void calculat(int[] array){
		double min=2e31-1;
		int j=0;
		for (int i = array.length-1; i >= 0; i--) {
			if(array[i]<min){
				min=array[i];
				j=i;
			}
		}
		System.out.println("最小值为："+min+" 最小值的下标为："+j);
	}
}
