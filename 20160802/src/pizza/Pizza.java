package pizza;

import java.util.Scanner;

public class Pizza {
	private int size;
	private int price;
	
	static Scanner in = new Scanner(System.in);
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//工厂模式
	public Pizza make(Pizza piz){
		return piz;
	}
	
	public void inputShow(){
		System.out.print("请输入pizza的大小：");
		setSize(in.nextInt());
		System.out.print("请输入pizza的价格：");
		setPrice(in.nextInt());
		
		System.out.println("名称：pizza");
		System.out.println("pizza大小："+getSize());
		System.out.println("pizza价格："+getPrice());
	}
	
}