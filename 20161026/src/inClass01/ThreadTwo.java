package inClass01;

public class ThreadTwo extends Thread {
	public void run(){
		int i = 100;
		while(i<125){
			System.out.println("线程2"+"第"+(i++)+"个");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}