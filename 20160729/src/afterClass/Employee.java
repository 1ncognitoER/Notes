package afterClass;

import java.util.Scanner;

public class Employee {
	
	private String name;
	private int age=15;
	private String technicalDirection;
	private int workAge;
	
	public void show(String workPlace,String workDuty){
		System.out.println("我的名字是"+name+"我"+age+"岁了"+" 目前就职于"+workPlace+"  职务是："+workDuty);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void work(){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入工作单位：");
		String workPlace=in.next();
		System.out.print("请输入工作职务：");
		String workDuty=in.next();
		
		show(workPlace,workDuty);
		
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}

	public String getTechnicalDirection() {
		return technicalDirection;
	}

	public Employee(String name, int age, String technicalDirection, int workAge) {
		super();
		this.name = name;
		this.technicalDirection = technicalDirection;
		this.workAge = workAge;
		if(age>=15){
			this.age = age;
		}else{
			System.out.println("输入得年龄不合法，已默认设置为15岁！");
		}
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


