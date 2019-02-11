package drink;

import java.util.Scanner;

public class DrinkTest {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Drink dr = new Drink();
		
		System.out.print("请选择饮料（1.coffee 2.cola 3.mineralWater）：");
		switch (in.nextInt()) {
		case 1:
			dr.maker(new Coffee()).show();
			break;
		case 2:
			dr.maker(new Cola()).show();
			break;
		case 3:
			dr.maker(new mineralWater()).show();
			break;
		default:
			System.out.println("没有该种饮料！");
			break;
		}
		
	}
}
