package pay;

public class BOC extends Bank {
	public BOC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println(super.name+"银行为你付款！");
	}
}