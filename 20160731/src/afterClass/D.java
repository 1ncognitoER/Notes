package afterClass;

public class D {
	private final int num;
	private int num1;
	
	public void show(){
		System.out.println(num+" "+num1);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum() {
		return num;
	}

//	public void setNum(int num) {
//		this.num = num;
//	}

	public D(int num, int num1) {
		super();
		this.num = num;
		this.num1 = num1;
	}
}