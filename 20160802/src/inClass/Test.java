package inClass;

public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*测试重写方法*/
//		Man m = new Man();
//		System.out.println(m.show());
		
		/*测试两个对象的比较*/
		Man m1 = new Man("小楠","男",170);
		Man m2 = new Man("小楠","男",170);
//		if(m1==m2){
//			System.out.println("true");
//		}else{
//			System.out.println("false");
//		}
		System.out.println(m1.equals(m2));
	}
}