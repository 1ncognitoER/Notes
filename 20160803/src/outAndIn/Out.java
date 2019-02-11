package outAndIn;
/**
 * 静态内部类测试
 * @author Blood Moon
 *
 */
public class Out {
	static String name="a";
//	String name="a";
	static class In{
		static String name= "b";
		public void show(){
			System.out.println(name+"+");// 此处调用内部类的属性
			System.out.println(new Out().name+"+");
		}
	}
	
	
	public static void main(String[] args) {
		new In().show();
	}
}
/**
 * 非静态内部类
 */
//public class Out {
//	String name="a";
//	class In{
//		String name= "b";
//		public void show(){
//			System.out.println(this.name+"+");
//			System.out.println(new Out().name+"+");
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		Out.In z = new Out().new In();
//		z.show();
//	}
//}