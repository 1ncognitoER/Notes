package inClass01;

/**
 * 线程测试类
 * @author Blood Moon
 * 
 * 线程的五种状态：
 * 	1.新建：创建线程对象
 * 	2.就绪：线程对象调用start方法之后线程进入就绪
 *	3.运行：CPU调度进入运行
 *	4.死亡：运行结束或出现异常
 *	5.阻塞：线程调用sleep等方法进入阻塞状态
 *
 * 线程控制：
 * 	voidStart():线程对象调用start方法进入就绪状态
 *  static void sleep(long millons);使线程暂时休眠进入阻塞状态
 *  
 * 线程让步：
 *  sleep和yield的区别：
 *  	1.sleep会让线程进入阻塞状态,而yield会使线程进入就绪状态
 *  	2.sleep允许其他线程线运行,yield只允许优先级不小于自己的先运行
 *  	3.sleep会抛出异常,yield没有异常
 * 
 * void jion();
 * 	调用jion的线程优先运行
 * 
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		//创建线程对象的第一个方法
		Thread one = new ThreadOne();
		//创建线程对象的第二个方法
		Thread two = new Thread(new ThreadTwo());
		//运行线程,调用线程对象的start方法启动线程
		one.start();
		
//		try {
//			one.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		two.start();
	}
}