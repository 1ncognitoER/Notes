package test;

public class Case6 {

	public static void main(String[] args) {
		// System.out.print("请输入行数：");
		// int num = new Scanner(System.in).nextInt();
		// printS(num);

		// sayHi();

		Case6 ca = new Case6();
		ca.printS();
		//

	}

	private static void sayHi() {
		System.out.println("hello,how are you?");
	}

	public void printS() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
