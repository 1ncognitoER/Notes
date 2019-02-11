package afterClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	/**
	 * 1) 创建一个List，在List 中增加三个工人，基本信息如下： 姓名 年龄 工资 zhang3 18 3000 li4 25 3500
	 * wang5 22 3200 zhang3 18 3000
	 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
	 * 3) 删除wang5 的信息
	 * 4) 利用for 循环遍历，打印List 中所有工人的信息
	 * 5)利用迭代遍历，对List 中所有的工人调用work方法。
	 * 6)为Worker 类添加equals 方法
	 * 7)去除List的重复的工人 
	 * 8)将li4的工资修改为2300。
	 * 9)判断List集合中是否有工资3200的工人，如果有输出该工人信息
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List li = new ArrayList();
		li.add(new Worker("zhang3", 18, 3000));
		//添加数据
		addData(li);
//		for (Object object : li) {
//			System.out.println(object);
//		}
		//插入数据
		System.out.println();
		Insert(li);
//		for (Object object : li) {
//			System.out.println(object);
//		}
		//删除数据
		System.out.println();
		RemoveData(li);
//		for (Object object : li) {
//			System.out.println(object);
//		}
		//显示信息
		System.out.println();
		ShowData(li);
		//展示工作
		System.out.println();
//		ShowWork(li);
		//去除重复工人
		System.out.println();
		Set s = RemoveRepetition(li);
		for (Object object : s) {
			System.out.println(object);
		}
		
		List li1 = new ArrayList();
		li1.addAll(s);
		//修改
		System.out.println();
		Modify(li1);
		//薪水判断
		System.out.println();
		JudgeSalary(li1);

	}
/**
 * 去除重复的工人
 * @param li
 */
	public static Set RemoveRepetition(List li) {
		Set s = new HashSet();
		s.addAll(li);
//		for (Object object : s) {
//			System.out.println(object);
//		}
		return s;
	}

	/**
	 * 判断薪水
	 * 
	 * @param li
	 */
	public static void JudgeSalary(List li) {
		for (int i = 0; i < li.size(); i++) {
			if (((Worker) li.get(i)).getSalary() == 3300) {
				System.out.println(li.get(i));
			}
		}
	}

	/**
	 * 修改数据
	 * 
	 * @param li
	 */
	public static void Modify(List li) {
		for (int i = 0; i < li.size(); i++) {
			if ("li4".equals(((Worker)li.get(i)).getName())){
//				index=i;
				((Worker)li.get(i)).setSalary(2300);
				break;
			}
		}
		
//		li.set(2, new Worker("li4", 25, 2300));
		
		for (Object object : li) {
			System.out.println(object);
		}
	}

	/**
	 * 查看工作
	 * 
	 * @param li
	 */
	public static void ShowWork(List li) {
		Iterator it = li.iterator();
		while (it.hasNext()) {
			((Worker) it.next()).work();
		}
	}

	/**
	 * 显示信息
	 * 
	 * @param li
	 */
	public static void ShowData(List li) {
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

	/**
	 * 删除数据
	 * 
	 * @param li
	 */
	public static void RemoveData(List li) {
		int index=0;
		for (int i = 0; i < li.size(); i++) {
			if ("wang5".equals(((Worker)li.get(i)).getName())){
				index=i;
//				System.out.println(i);
				break;
			}
		}
		li.remove(index);
	}

	/**
	 * 插入数据
	 * 
	 * @param li
	 */
	public static void Insert(List li) {
		int index=0;
		for (int i = 0; i < li.size(); i++) {
			if ("li4".equals(((Worker)li.get(i)).getName())){
				index=i;
//				System.out.println(i);
				break;
			}
		}
		li.add(index, new Worker("zhao6", 24, 3300));
	}

	/**
	 * 添加数据
	 * 
	 * @param li
	 */
	public static void addData(List li) {
		// no.1
		li.add(new Worker("li4", 25, 3500));
		li.add(new Worker("wang5", 22, 3200));
		li.add(new Worker("zhang3", 18, 3000));
	}
}