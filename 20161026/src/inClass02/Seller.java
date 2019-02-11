package inClass02;

public class Seller extends Thread {
	private Object o;

	public Seller(Object o) {
		this.o = o;
	}

	@Override
	public void run() {
		// 售票
		while (Film.num > 0) {
			// synchronized(o){//同步代码块
			// if(Film.num > 0){
			// System.out.println(this.currentThread().getName()+"售出了第+"+(Film.num--)+"张票！");
			// try {
			// Thread.sleep(50);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			// }
			sell();
		}
	}

	public static synchronized void sell() {
		if (Film.num > 0) {
			System.out.println(currentThread().getName() + "售出了第+" + (Film.num--) + "张票！");
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}