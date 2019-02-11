package phone;

public class Card {
	public String carrieroperator;
	//工厂
	public Card cons(Card card){
		return card;
	}
	
	public Card(String carrieroperator) {
		super();
		this.carrieroperator = carrieroperator;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void show(){
		System.out.println("运营商为您服务");
	}
}