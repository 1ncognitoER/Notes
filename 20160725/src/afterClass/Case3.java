package afterClass;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		int money=5000;
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入取款金额：");
		int getMoney=input.nextInt();
		if(getMoney<=0){
			System.out.println("输入的取款金额不正确！");
		}else if(getMoney>=money){
			System.out.println("余额不足！");
		}else{
			System.out.println("取款成功！");
			int finalMoney=money-getMoney;
			System.out.println("余额为"+finalMoney);
		}
		
	}

}
