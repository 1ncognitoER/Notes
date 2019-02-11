package inClass;

public class People {
	String name;
	@Override
	public String toString() {
		return "People [name=" + name + ", sex=" + sex + "]";
	}

	String sex;
	
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	public People(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	public People show(){
		return new People("胡歌","男");
	}
	
}