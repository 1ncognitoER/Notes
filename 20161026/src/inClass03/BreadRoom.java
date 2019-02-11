
package inClass03;

/**
 * 
 * 线程协作测试
 * 
 * @author Blood Moon
 *
 */
public class BreadRoom {
	
	public static int num = 10;
	public static final Object object = new Object();
	public static void main(String[] args) {
		Thread chef = new Chef();
		Thread chef1 = new Chef();
		Thread chef2 = new Chef();
		Thread s1 = new Seller();
		s1.setName("售货员1");
		Thread s2 = new Seller();
		s2.setName("售货员2");
		chef.start();
		//chef1.start();
		//chef2.start();
		s1.start();
		s2.start();
	}

}