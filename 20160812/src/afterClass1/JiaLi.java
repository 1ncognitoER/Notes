package afterClass1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class JiaLi {

	private String name;
	private int age;
	private String level;

	static Scanner in = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public JiaLi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JiaLi(String name, int age, String level) {
		super();
		this.name = name;
		this.age = age;
		this.level = level;
	}

	@Override
	public String toString() {
		return "JiaLi [name=" + name + ", age=" + age + ", level=" + level + "]";
	}

	/**
	 * 主菜单
	 */
	public void menu(ArrayList al) {
		System.out.println("=====================================");
		System.out.println("\t\t1.登录");
		System.out.println("\t\t0.推出");
		System.out.println("=====================================");
		System.out.print("请选择：");
		switch (in.nextInt()) {
		case 0:
			System.exit(0);
			break;
		case 1:
			login(al);
			break;
		default:
			menu(al);
			break;
		}
	}

	public void login(ArrayList al) {
		System.out.println("=====================================");
		System.out.print("请选择佳丽：");
		String name = in.next();
		for (int i = 0; i < al.size(); i++) {
			if(name.equals(((JiaLi)al.get(i)).getName())){
				System.out.println("=====================================");
				System.out.println("\t\t欢迎登录选秀系统！");
				System.out.println("=====================================");
				
				select(al);
				
				break;
			}
		}
	}

	public void select(ArrayList al) {
		System.out.println("\t\t1.选秀");
		System.out.println("\t\t0.返回首页");
		System.out.println("=====================================");
		System.out.print("请选择：");
		switch (in.nextInt()) {
		case 0:
			menu(al);
			break;
		case 1:
			
			System.out.println("=====================================");
			System.out.print("请输入等级：");
			String num = in.next();
			for (int j = 0; j < al.size(); j++) {
				if(num.equals(((JiaLi)al.get(j)).getLevel())){
					System.out.println(al.get(j));
				}
			}
			
			break;

		default:
			select(al);
			break;
		}
	}

}