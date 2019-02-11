package inClass;

import java.util.Scanner;

public class Seek {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

//		String[] str = { "q", "w", "e", "r", "t", "y", "u", "i" };
		int[] str = { 12, 23, 34, 45, 56, 67, 78, 89 };

		System.out.print("请输入需要查找的字符：");
//		String s = in.next();
		int s = in.nextInt();

		// 顺序查找
		// int num = sortSeek(str,s);
		// if(num!=-1){
		// System.out.println("该字符串所在位置的下标为："+num);
		// }else{
		// System.out.println("没有该字符串！");
		// }

		//二分查找
		System.out.println(halfSeek(str, s));
		
	}
	static int halfSeek(int[]str,int s){
		int min=0,max=str.length-1,mid=0;
		
		for (;min<max;) {
			
			mid=(min+max)/2;
			
			if(s==str[mid]){
				return mid;
			}else if(s<str[mid]){
				max=mid-1;
			}else{
				min= mid+1;
			}
		}
		return mid;
	}

	/**
	 * 顺序查找
	 * 
	 * @param str
	 *            字符串数组
	 * @param s
	 *            查找的字符
	 * @return 查找到了返回下标，没有查找到返回-1
	 */
	static int sortSeek(String[] str, String s) {
		for (int i = 0; i < str.length; i++) {
			if (s.equals(str[i])) {
				return i;
			}
		}
		return -1;
	}
}