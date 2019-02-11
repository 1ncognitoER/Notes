package bean;

import org.aspectj.lang.ProceedingJoinPoint;

public class AOPCut {
	public void before(){
		System.out.println("before");
	}
	public void after(){
		System.out.println("after");
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("before around");
		pjp.proceed();
		System.out.println("after around");
		return null;
	}
	public void throwing(){
		System.out.println("run throwing");
	}
	public void returning(int ret){
		System.out.println("returning="+ret);
	}
}
