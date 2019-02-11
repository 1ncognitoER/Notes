package inClass03;

public class Chef extends Thread {

	@Override
	public void run() {
		while(true){
			synchronized(BreadRoom.object){
				if(BreadRoom.num <= 5){
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					BreadRoom.num += 4;
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