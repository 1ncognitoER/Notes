package pay;

public class CCB extends Bank {
	public CCB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println(super.name+"银行为你付款！");
	}
}