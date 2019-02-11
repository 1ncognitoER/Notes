package afterClass;

import java.util.Scanner;

public class P50 {

	public static void main(String[] args) {
		//申明一个变量x用来保存输入的数据
		int x;
		//输入数据
		Scanner input = new Scanner(System.in );
		System.out.print("请输入积分：");
		x = input.nextInt();
		//数据处理
		if(x<5000){
			System.out.println("国庆节快乐！送您一张贺卡！");
		}else if(x<10000){
			System.out.println("国庆节快乐！送您一个杯子！");
		}else if(x<30000){
			System.out.println("国庆节快乐！送您一套餐具！");
		}else{
			System.out.println("国庆节快乐！送您一套精美骨质瓷器！");
		}
	}

}
