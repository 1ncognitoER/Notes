package test;

public class No_1 {

	public static void main(String[] args) {
		chenFaKeJueBiao();
	}
	
	public static void chenFaKeJueBiao() {
		for (int i = 1; i <= 9; i++) {// 控制第一个数的循环
			for (int j = 1; j <= i; j++) {// 控制第二个数的循环
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
