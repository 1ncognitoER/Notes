package pizza;

public class SeafoodPizza extends Pizza {
	private String  ingredient;

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public void inputShow(){
		System.out.print("请输入配料信息：");
		setIngredient(in.next());
		System.out.print("请输入pizza的大小：");
		setSize(in.nextInt());
		System.out.print("请输入pizza的价格：");
		setPrice(in.nextInt());
		
		System.out.println("名称：SeafoodPizza");
		System.out.println("配料："+this.ingredient);
		System.out.println("pizza大小："+super.getSize());
		System.out.println("pizza价格："+super.getPrice());
	}
	
}

