package bean;

public class AOPed {
	public void aop(){
		System.out.println("AOPed");
	}
	public void aopOne(){
		System.out.println("run 1/0");
		int a = 1 / 0;
	}
	public int aopTwo(){
		System.out.println("run returning");
		return 1;
	}
}
