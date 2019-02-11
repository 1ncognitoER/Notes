package hashSet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentsTest {

	/**
	 * 新建一个 set ，将学生的实例存入
	 * 通过 能否存入 set 判断学生是否重复
	 * 然后 将学生存入数组 成绩排序
	 * 迭代输出
	 * @param args
	 */
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(new Students("a",23));
		s.add(new Students("a",23));
		s.add(new Students("b",60));
		s.add(new Students("c",49));
		s.add(new Students("d",99));
		
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println();
		
		Object[]obj = s.toArray();
//		Arrays.sort(obj);
		
		for (Object object : obj) {
			System.out.println(object);
		}
	}

}