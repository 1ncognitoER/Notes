package inClass;

import inClass1.Default_1;

public class PrivateTest {
	private String name;
	
	public static void main(String[] args) {
		PrTe a = new PrTe();
		
		PrivateTest b = new PrivateTest();
		b.name="selfname";
		
		DefaultTest c = new DefaultTest();
		c.age=10;
		
		Default_1 e = new Default_1();
		e.number=12;
		
		
		
	}

}

class PrTe{
	private int num;
	
	static int af;
}
