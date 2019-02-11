package drink;

import java.util.Scanner;

public class Cola extends Drink {
	private String brand;

	Scanner in = new Scanner(System.in);
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Cola(String brand) {
		super();
		this.brand = brand;
	}
	public Cola() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.print("请问你需要什么品牌的可乐（1.可口可乐\t2.百事可乐）：");
		int num = in.nextInt();
		if(num==1){
			this.setBrand("可口可乐");
			System.out.print("请选择容量：");
			super.setContent(in.nextInt());
			System.out.println("可乐品牌："+this.getBrand());
			System.out.println("容量："+super.getContent());
		}else if(num==2){
			this.setBrand("百事可乐");
			System.out.print("请选择容量：");
			super.setContent(in.nextInt());
			System.out.println("可乐品牌："+this.getBrand());
			System.out.println("容量："+super.getContent());
		}else{
			System.out.println("没有你要的品牌！");
		}
		
	}
}
