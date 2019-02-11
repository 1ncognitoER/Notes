package inClass1;

public class Dog {

	private String name;
	private int health;
	private int love;
	private String strain;
	
	public Dog(String name, int health, int love, String strain) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}
	public Dog(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	//输出信息
	public void show(){
		System.out.println(this.name+"的健康值为"+this.health+",亲密度是"+this.love+",是一条"+this.strain);
	}

}
