package inClass;

import java.util.HashMap;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap ha = new HashMap();
		
		ha.put("zhang3", 800);
		ha.put("li4", 1500);
		ha.put("wang5", 3000);
		System.out.println(ha);		
		
		ha.put("zhang3", 2600);
		System.out.println(ha);
		
//		System.out.println(ha.get("zhang3"));
		
//		System.out.println(ha);
//		System.out.println(ha.values());
//		System.out.println(ha.keySet());
		
		for (Object object : ha.keySet()) {
			if(!(object==null)){
				int num = (int)(ha.get(object));
				ha.put(object,num+100 );
			}
		}
		System.out.println(ha);
		
		System.out.println();
		for (Object object : ha.keySet()) {
			System.out.println(object);
		}
		System.out.println();
		for (Object object : ha.values()) {
			System.out.println(object);
		}
		
	}
}
