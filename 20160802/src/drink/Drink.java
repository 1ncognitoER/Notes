package drink;

import java.util.Scanner;

public class Drink {
	private int content;//容量
	
	Scanner in = new Scanner(System.in);

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
	//工程模式
	public Drink maker(Drink dr){
		return dr;
	}
	public void show(){
		System.out.println("容量："+this.content);
	}
}