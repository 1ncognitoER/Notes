package inClass2;

public class Lion extends Animal {
	String shiXing;

	@Override
	public String toString() {
		return "Lion [type=" + super.type + ", color=" + super.color + ", sex=" + super.sex + ", shiXing=" + shiXing + "]";
	}

	public Lion(String type,String color,String sex,String shiXing) {
		super(type,color,sex);
		this.shiXing = shiXing;
	}
	
	public void show(){
		System.out.println(super.type+"\t"+super.color+"\t"+super.sex);
	}
	public void show1(){
		super.show();
	}

}
