package inClass01;

public class ThreadOne extends Thread {
	public void run(){
		int i = 1;
		while(i<50){
			System.out.println("线程1"+"第"+(i++)+"个");
			try {
				Thread.sleep(100);//休眠0.1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}