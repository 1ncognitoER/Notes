package inClass;

import java.util.Scanner;

/**
 * 类和对象测试类
 * @author Blood Moon
 * 
 */
public class TestAdmin {
	
	static boolean flag=true;
	static boolean flag1=true;
	static Admin a = new Admin();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do{
			System.out.print("请输入用户名：");
			String userN=in.next();
			System.out.print("请输入密码：");
			String passW=in.next();
			
			if(a.getUserName().equals(userN) && a.getPassWord().equals(passW)){
				System.out.println("登录成功！");
				flag=false;
				
				do{
					System.out.println("请输入新密码：");
					String newPW1=in.next();
					System.out.println("请再次输入新密码：");
					String newPW2=in.next();
					
					if(newPW1.equals(newPW2)){
						flag1=false;
						a.setPassWord(newPW1);
						System.out.println("密码设置成功！");
						System.out.println("新密码为："+a.getPassWord());
						
						System.out.println("请用新密码登录！");
						flag=true;
						
					}else{
						flag1=true;
						System.out.println("两次输入的密码不匹配！");
					}
					
				}while(flag1);
				
				
				
			}else{
				System.out.println("登录失败！");
			}
			
		}while(flag);
		
	}
	

}
