package afterClass;

import java.util.Scanner;

/**
 * @author Blood Moon
 *
 */

public class Case1 {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试分数：");
		grade = input.nextInt();

		if (grade < 0 || grade > 100) {
			System.out.println("输入的分数不合法！");
		} else {
			if (grade < 60) {
				System.out.println("购买学习资料！");
			} else if (grade >= 60 && grade < 70) {
				System.out.println("奖励一顿大餐！");
			} else if (grade >= 70 && grade < 80) {
				System.out.println("奖励一部手机！");
			} else {
				System.out.println("奖励一台电脑！");
			}
		}
	}
}
