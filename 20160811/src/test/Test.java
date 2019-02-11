package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 集合测试
 * @author Blood Moon
 *
 */
public class Test {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add("qwer");
		s.add(123);
		s.add('t');
		s.add(2.0);
		
		//返回元素数
		System.out.println(s.size());
		
//		//foreach打印集合数据
//		for (Object object : s) {
//			System.out.println(object);
//		}
		
//		//将集合转变成数组，打印
//		Object[]obj = s.toArray();
//		for (int i = 0; i < obj.length; i++) {
//			System.out.println(obj[i]);
//		}
		
		//迭代打印
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}