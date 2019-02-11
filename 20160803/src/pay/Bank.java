package pay;

public class Bank {
	public String name;
	//工厂模式
	public Bank constr(Bank bank){
		return bank;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show(){
		System.out.println("银行为你付款！");
	}

	public Bank(String name) {
		super();
		this.name = name;
	}
}