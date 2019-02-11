package pizza;

import java.util.Scanner;

public class PizzaTest {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		menu();
		
	}

	public static void menu() {
		
		
		
		Pizza p =new Pizza();
		
		System.out.print("请选择想要制作的pizza（1.培根pizza 2.海鲜pizza）：");
		int num = in.nextInt();
		if(num==1){
			
			p.make(new BaconicPizza()).inputShow();
			
		}else if(num==2){
			
			p.make(new SeafoodPizza()).inputShow();
			
		}else{
			System.out.println("没有你想要pizza！");
		}
	}

}