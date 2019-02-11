package afterClass;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		String s;
		
		Scanner input = new Scanner(System.in );
		System.out.print("请输入天气的第一个字母：");
		s=input.next();
		
		switch (s) {
		case "d":
			System.out.println("干燥");
			break;
		case "m":
			System.out.println("潮湿");
			break;
		case "h":
			System.out.println("炎热");
			break;
		case "r":
			System.out.println("下雨");
			break;
		default:
			System.out.println("输入不合法！");
			break;
		}
	}

}
