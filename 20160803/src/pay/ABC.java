package pay;

public class ABC extends Bank {
	public ABC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println(super.name+"银行为你付款！");
	}
}