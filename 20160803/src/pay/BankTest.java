package pay;

public class BankTest {
	public static void main(String[] args) {
		IPay i = new JD();
		Bank bank = new Bank();
		i.pay(bank.constr(new ABC("中国农业银行")));//工厂模式
	}
}
