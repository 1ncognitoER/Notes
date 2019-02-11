package afterClass1;

import java.util.ArrayList;

public class JiaLiTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(new JiaLi("皇后", 28 , "1"));
		al.add(new JiaLi("华妃", 19 , "3"));
		al.add(new JiaLi("珍妃", 20 , "2"));
		al.add(new JiaLi("研妃", 23 , "1"));
		
		JiaLi ji = new JiaLi();
		ji.menu(al);
		
	}

}
