package pizza;

public class BaconicPizza extends Pizza {
	private int grammage;

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}
	public void inputShow(){
		System.out.print("请输入培根克数：");
		setGrammage(in.nextInt());
		System.out.print("请输入pizza的大小：");
		setSize(in.nextInt());
		System.out.print("请输入pizza的价格：");
		setPrice(in.nextInt());
		
		System.out.println("名称：BaconicPizza");
		System.out.println("培根的克数："+this.grammage);
		System.out.println("pizza大小："+super.getSize());
		System.out.println("pizza价格："+super.getPrice());
	}
	
}