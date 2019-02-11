package drink;

public class mineralWater extends Drink {
	private String name="矿泉水";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.print("请选择容量：");
		super.setContent(in.nextInt());
		System.out.println("名称："+this.getName());
		System.out.println("容量："+super.getContent());
	}
}