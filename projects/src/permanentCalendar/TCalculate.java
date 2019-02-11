package permanentCalendar;

import java.util.Scanner;

public class TCalculate {
	
	// 确定1900年1月1号为初始日期，是礼拜一
	final int YEAR = 1900;
	final int MONTH = 1;
//	final int DAY = 1;
	// 从1900年到需要查找的日期经历的总共天数
	int allDay = 0;
	// 经过总天数计算出的星期
	int week;
	// 输入的年份和月份
	int year;
	int month;
	
	// 创建数据输入对象
	Scanner in = new Scanner(System.in);
	/**
	 * 打印万年历
	 */
	void show() {
		int days;// 保存该月的天数
		// 判断该月的天数
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days = 29;
			} else {
				days = 28;
			}
		}
		// 打印开头
		System.out.println("====================================================");
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		// 打印日历前的空格数
		for (int j = 1; j < week; j++) {
			System.out.print("\t");
		}
		// 打印日历的日期
		for (int i = 1; i <= days; i++) {
			if ((week + i - 1) % 7 == 0) {
				System.out.println(i + "\t");
				System.out.println();
			} else {
				System.out.print(i + "\t");
			}

		}
		//打印结尾
		System.out.println();
		System.out.println("====================================================");
	}

	/**
	 * 计算出星期
	 */
	void CalculWeek() {
		switch (allDay%7) {
		case 0:
			week=7;
			break;
		case 1:
			week=1;
			break;
		case 2:
			week=2;
			break;
		case 3:
			week=3;
			break;
		case 4:
			week=4;
			break;
		case 5:
			week=5;
			break;
		case 6:
			week=6;
			break;

		}
//		week = (allDay % 7);
//		 System.out.println(week);
	}

	/**
	 * 
	 * 经过CalculYearDay方法计算，返回1900年到当前年的当前月的一号的总天数到成员变量allDay
	 */
	void CalculMonthDay() {
		switch (month - 1) {
		case 11:
			allDay += 30;// 十二月一号 之前的总天数加十一月的总天数
			// break;
		case 10:
			allDay += 31;// 十一月一号 之前的总天数加十月的总天数
			// break;
		case 9:
			allDay += 30;// 十月一号 之前的总天数加九月的总天数
			// break;
		case 8:
			allDay += 31;// 九月一号 之前的总天数加八月的总天数
			// break;
		case 7:
			allDay += 31;// 八月一号 之前的总天数加七月的总天数
			// break;
		case 6:
			allDay += 30;// 七月月一号 之前的总天数加六月的总天数
			// break;
		case 5:
			allDay += 31;// 六月一号 之前的总天数加五月的总天数
			// break;
		case 4:
			allDay += 30;// 五月一号 之前的总天数加四月的总天数
			// break;
		case 3:
			allDay += 31;// 四月一号 之前的总天数加三月的总天数
			// break;
		case 2:// 三月一号 之前的总天数加二月的总天数
			if (leapYearJudge(year) == true) {
				allDay += 29;
			} else {
				allDay += 28;
			}
			// break;
		case 1:
			allDay += 31;// 二月一号 之前的总天数加一月的总天数
			// break;
		case 0:
			allDay += 1;// 一月一号 之前的总天数加一
			break;
		}
//		System.out.println(allDay);
	}

	/**
	 * 输入方法
	 * 
	 */
	void input() {
		System.out.print("请输入年份：");
		year = in.nextInt();
		// System.out.println(year);
		System.out.print("请输入月份：");
		month = in.nextInt();
		// System.out.println(month);
	}

	/**
	 * 闰年的判断方法
	 * 
	 * @param year
	 *            需要判断的年份
	 * @return 润年就返回真，否则返回假
	 * 
	 */
	boolean leapYearJudge(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 计算1900年到输入的年份的总天数
	 * 
	 * 返回从1900年到输入的年份的总天数到成员变量allDay
	 */
	void CalculYearDay() {
		// boolean flag;
		for (int i = YEAR; i < year; i++) {
			// System.out.println(i);
			if (leapYearJudge(i) == true) {
				allDay = allDay + 366;
			} else {
				allDay = allDay + 365;
			}
		}
	}
}
