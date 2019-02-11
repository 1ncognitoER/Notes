package inClass03;

public class Seller extends Thread {

	@Override
	public void run() {
		while(true){
			synchronized(BreadRoom.object){
				if(BreadRoom.num >= 5){
					System.out.println(currentThread().getName()+"卖出了第"+(BreadRoom.num--)+"个面包");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					
					BreadRoom.object.notifyAll();
					try {
						BreadRoom.object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}