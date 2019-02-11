package afterClass;

public class Dog {
	private String name;
	private String strain;
	private int age;
	private String feeling="happy";
	
	public void makeSound(){
		if("happy".equalsIgnoreCase(this.feeling)){
			System.out.println("汪汪~！");
		}else{
			System.out.println("呜呜~");
		}
	}
	public void run(){
		if("happy".equalsIgnoreCase(this.feeling)){
			System.out.println("欢快的跑！");
		}else{
			System.out.println("一动不动！");
		}
	}
	public void show(){
		System.out.println("我的名字叫"+this.name+" 我是一条"+this.strain+" 我"+this.age+"岁了 "+"见到你我很"+this.feeling);
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, String strain,int age,String feeling) {
		super();
		this.name = name;
		this.strain = strain;
		this.age = age;
		if("happy".equalsIgnoreCase(feeling) || "unhappy".equalsIgnoreCase(feeling)){
			this.feeling = feeling;
		}else{
			System.out.println("心情输入错误，请输入英文！");;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}
