package test1;

public class Test {

	public static void main(String[] args) {
		IPay i = new ZhiFuBao();
		Bank bank = new Bank();
		i.pay(bank);
	}

}
