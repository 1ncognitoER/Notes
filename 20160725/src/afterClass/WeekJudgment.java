package afterClass;

import java.util.Scanner;

public class WeekJudgment {
	/**
	 * 根据字母判断星期
	 * @param args
	 */
	public static void main(String[] args) {
		String week;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入星期的第一个英文字母：");
		week = input.next();

		if ("m".equals(week) || "M".equals(week)) {
			System.out.println("星期一");
		} else if ("t".equals(week) || "T".equals(week)) {
			System.out.print("请输入第二个字母：");
			week = input.next();
			if ("u".equals(week) || "U".equals(week)) {
				System.out.println("星期二");
			} else if ("h".equals(week) || "H".equals(week)) {
				System.out.println("星期四");
			} else {
				System.out.println("输入的字母和星期不匹配！");
			}
		} else if ("w".equals(week) || "W".equals(week)) {
			System.out.println("星期三");
		} else if ("f".equals(week) || "F".equals(week)) {
			System.out.println("星期五");
		} else if ("s".equals(week) || "S".equals(week)) {
			System.out.print("请输入第二个字母：");
			week = input.next();
			if ("a".equals(week) || "A".equals(week)) {
				System.out.println("星期六");
			} else if ("u".equals(week) || "U".equals(week)) {
				System.out.println("星期天");
			} else {
				System.out.println("输入的字母和星期不匹配！");
			}
		} else {
			System.out.println("输入的字母和星期不匹配！");
		}

	}

}
