package inClass;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		
		HashMap ha = new HashMap();
		
		ha.put(1, "value_1");
		ha.put(2, "value_2");
		ha.put(3, "value_3");
		ha.put(4, "value_4");
		
		System.out.println(ha);
		
		System.out.println(ha.keySet());
		
		System.out.println(ha.values());
		
		System.out.println();
		for (Object object : ha.keySet()) {
			System.out.println(object);
		}
		System.out.println();
		for (Object object : ha.keySet()) {
			System.out.println(ha.get(object));
		}
		System.out.println();
		for (Object object : ha.values()) {
			System.out.println(object);
		}
		
	}
}
