package inClass;

import java.util.LinkedList;

public class DuiZhan {
	public static void main(String[] args) {
//		zhan();
		
		LinkedList li = new LinkedList();
		
		
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		
		
		li.pollFirst();//获取并移除第一个元素
		li.pollFirst();
		
		for (Object object : li) {
			System.out.println(object);
		}
	}

	public static void zhan() {
		LinkedList list = new LinkedList();
		
		list.offerFirst("a");//在开头插入该数据
		list.offerFirst("b");
		list.offerFirst("c");
		list.offerFirst("d");
		list.offerFirst("e");
		list.offerFirst("f");

		list.pollFirst();
		list.pollFirst();
		list.pollFirst();
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}