package afterClass;

import java.util.Scanner;

public class TimeJudgment {
	/**
	 * 闰年判断及每月天数计算
	 * @param args
	 */
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		
		Scanner input =new Scanner(System.in );
		System.out.print("请输入年份：");
		year = input.nextInt();
		System.out.print("请输入月份：");
		month = input.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0){
			
			System.out.println(year+"为闰年！");
			
			if(month==1 || month==3|| month==5|| month==7|| month==8|| month==10|| month==12){
				day=31;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}else if(month==4 || month==6|| month==9|| month==11){
				day=30;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}else{
				day=29;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}
		}else{
			System.out.println(year+"不是闰年！");
			if(month==1 || month==3|| month==5|| month==7|| month==8|| month==10|| month==12){
				day=31;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}else if(month==4 || month==6|| month==9|| month==11){
				day=30;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}else{
				day=28;
				System.out.println(year+"年"+month+"月有"+day+"天！");
			}
		}
	}

}
