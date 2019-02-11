package afterClass;

public class Case7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println("haha");
//			} else if (i % 5 == 0) {
//				System.out.println("heihei");
//			} else if (i % 15 == 0) {
//				System.out.println("hahaheihei");
//			} else {
//				System.out.println(i);
//			}
			
			if (i % 15 == 0) {
				System.out.println("haha");
			} else if (i % 5 == 0) {
				System.out.println("heihei");
			} else if (i % 3 == 0) {
				System.out.println("hahaheihei");
			} else {
				System.out.println(i);
			}

		}
	}

}
