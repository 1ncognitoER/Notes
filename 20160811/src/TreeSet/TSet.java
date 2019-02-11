package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TSet {
	public static void main(String[] args) {
		Set s = new TreeSet();
		
		s.add(new Students("a",90));
		s.add(new Students("a",30));
		s.add(new Students("b",78));
		s.add(new Students("c",59));
		s.add(new Students("d",99));
		s.add(new Students("d",99));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}
}
