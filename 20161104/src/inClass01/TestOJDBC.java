package inClass01;

import java.util.Scanner;

public class TestOJDBC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	/**
	 * 选择菜单
	 */
	public static void menu(){
		//实例化输入对象
		Scanner input = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("\t\t1.查询信息");
		System.out.println("\t\t2.添加信息");
		System.out.println("\t\t3.修改信息");
		System.out.println("\t\t4.删除信息");
		System.out.println("\t\t0.退出系统");
		System.out.println("==========================================");
		System.out.print("请选择：");
		try {
			switch (input.nextInt()) {
			case 0:
				System.exit(0);
				 break;
			case 1:
				search();
				break;
			case 2:
				add();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			default:
				System.out.println("选择错误！");
				System.exit(0);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 根据班级号删除数据
	 */
	private static void delete() {
		// TODO Auto-generated method stub
		try {
			CRUD crud = new CRUD();
			int classID = 7;
			crud.delete(classID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 数据修改
	 */
	private static void modify() {
		// TODO Auto-generated method stub
		try {
			CRUD crud = new CRUD();
			crud.modify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 根据班级名增加数据
	 */
	private static void add() {
		// TODO Auto-generated method stub
		try {
			CRUD crud = new CRUD();
			crud.add(new ClassInf("classA"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 数据查询
	 */
	private static void search() {
		// TODO Auto-generated method stub//实例化CRUD
		try {
			CRUD crud = new CRUD();
			crud.search();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}