package test1;

public class ZhiFuBao implements IPay {

	@Override
	public void pay(Bank bank) {
		bank.show();
	}
	
}
