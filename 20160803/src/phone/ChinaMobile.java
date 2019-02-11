package phone;

public class ChinaMobile extends Card {
	
	public ChinaMobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChinaMobile(String carrieroperator) {
		super(carrieroperator);
	}

	public void show(){
		System.out.println(super.carrieroperator +"为您服务！");
	}
}