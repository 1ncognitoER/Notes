package afterClass1_test;

import afterClass1.Inform;

public class Test {

	public static void main(String[] args) {
		
		Inform inf = new Inform("011","外星人笔记本电脑",2,8889,"笔记本电脑","001");
		inf.show();
		Inform inf1 = new Inform("011","外星人笔记本电脑",0,8889,"笔记本电脑","001");
		inf1.show();
	}

}
