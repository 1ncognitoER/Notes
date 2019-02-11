package inClass2;

public class Animal {
	String type;
	String color;
	String sex;
	
	public Animal(String type, String color, String sex) {
		this.type = type;
		this.color = color;
		this.sex = sex;
	}
	
	public void show(){
		System.out.println("Lion [type=" + type + ", color=" + color + ", sex=" + sex +"]");
	}
}
