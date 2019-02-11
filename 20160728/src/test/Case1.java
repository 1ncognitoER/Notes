package test;

import java.util.Scanner;

public class Case1 {

	/**
	 * @author Blood Moon
	 *		查找字符串出现的次数
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str1=in.next();
		System.out.print("请输入要查找的字符：");
		String str2=in.next();
		int num=0;
		
		for(;str1.indexOf(str2)!=-1;){
			str1=str1.substring(str1.indexOf(str2)+str2.length());
			num++;
		}
		System.out.println(num);
	}

}
