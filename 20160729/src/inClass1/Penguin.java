package inClass1;

public class Penguin {
	private String name;
	private int health;
	private int love;
	private String sex;

	public Penguin() {
		super();
	}

	public Penguin(String name, int health, int love, String sex) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// 输出信息
	public void show() {
		System.out.println(this.name + "的健康值为" + this.health + ",亲密度是" + this.love + ",是" + this.sex);
	}
}
