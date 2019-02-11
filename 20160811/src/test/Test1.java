package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
	/**
	 * 去除相同元素的测试
	 * @param args
	 */
	public static void main(String[] args) {
		List li = new ArrayList();

		li.add("12");
		li.add("23");
		li.add("12");
		li.add("34");


//		// 方法一：采用集合变换方式
//		Set s = new HashSet();
//
//		s.addAll(li);
//		for (Object object : s) {
//			System.out.println(object);
//		}

		
		//方法二：当新集合中没有该元素时就把集合中的当前元素添加到新集合中
		for (Object object : qwe(li)) {
			System.out.println(object);
		}

	}

	static ArrayList qwe(List li) {
		ArrayList al=new ArrayList();
		for (int i = 0; i < li.size(); i++) {
			if(!al.contains(li.get(i))){
				al.add(li.get(i));
			}
		}
		return al;
	}

}