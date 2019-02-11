package pay;

public class ICBC extends Bank {
	public ICBC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println(super.name+"银行为你付款！");
	}
}
