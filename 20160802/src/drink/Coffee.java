package drink;

import java.util.Scanner;

public class Coffee extends Drink {
	private String makeUp;

	Scanner in = new Scanner(System.in);
	
	public String getMakeUp() {
		return makeUp;
	}

	public void setMakeUp(String makeUp) {
		this.makeUp = makeUp;
	}
	public void show(){
		System.out.print("请问你需要配料（1.加奶\t2.加糖\t3.不加任何东西）：");
		int num = in.nextInt();
		switch (num) {
		case 1:
			this.setMakeUp("奶");
			System.out.print("请选择容量：");
			super.setContent(in.nextInt());
			System.out.println("名称：coffee");
			System.out.println("配料："+this.getMakeUp());
			System.out.println("容量："+super.getContent());
			break;
		case 2:
			this.setMakeUp("糖");
			System.out.print("请选择容量：");
			super.setContent(in.nextInt());
			System.out.println("名称：coffee");
			System.out.println("配料："+this.getMakeUp());
			System.out.println("容量："+super.getContent());
			break;
		case 3:
			this.setMakeUp("null");
			System.out.print("请选择容量：");
			super.setContent(in.nextInt());
			System.out.println("名称：coffee");
			System.out.println("配料："+this.getMakeUp());
			System.out.println("容量："+super.getContent());
			break;
		default:
			System.out.println("没有该配料！");
			break;
		}
	}
	
}