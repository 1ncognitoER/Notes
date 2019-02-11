package pay;

public class JD implements IPay {
//	public static void main(String[] args) {
//		Bank b = new ABC();
//	}

	@Override
	public void pay(Bank bank) {
		bank.show();
	}
	
}
