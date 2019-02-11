package inClass02;

/**
 * 线程同步的两种方法
 * 
 * @author Blood Moon
 *
 */
public class Film {

	public static int num = 100;
	private final static Object o = new Object();

	public static void main(String[] args) {
		Thread one = new Seller(o);
		one.setName("售票员1");
		Thread two = new Seller(o);
		two.setName("售票员2");
		Thread three = new Seller(o);
		three.setName("售票员3");

		one.start();
		two.start();
		three.start();
	}
}