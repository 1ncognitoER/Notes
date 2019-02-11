//package test;
//
//import java.util.Scanner;
//
//public class Case4 {
//
//	public static void main(String[] args) {
//		int rows = input();
//		output(rows);
//	}
//
//	public static int input() {
//		Scanner In = new Scanner(System.in);
//		System.out.print("请输入打印菱形的行数：");
//		int Rows = In.nextInt();
//		Rows = Rows / 2 + 1;// 输入偶数时向上变为基数（如输入六就 打印七行）
//		return Rows;
//	}
//
//	public static void output(int n) {
//		
//		
//		for (int x = 1; x <= 2 * n - 1; x++) {
//			for (int y = 1; y <= 2 * n - 1; y++) {
//				// 在八条直线上的点都打印*，其余的都打印空格
//				if (	(y - n) * (n - 1) == (x - 1) * (1 - n)
//						|| (y - (2 * n - 1)) * (1 - n) == (x - n) * (n - (2 * n - 1))
//						|| (y - n) * (n - (2 * n - 1)) == (x - (2 * n - 1)) * (1 - n)
//						|| (y - n) * (n - (2 * n - 1)) == (x - (2 * n - 1)) * (2 * n - 1 - n)
//					
//						||(y - n) * (n - 2) == (x - 2) * (2 - n)
//						||(y - n) * (n - 2) == (x - 2) * ((2 * n - 2) - n)
//						||(y - 2) * ((2 * n - 2) - n) == (x - n) * (n - 2)
//						||(y - (2 * n - 2)) * ((2 * n - 2) - n) == (x - n) * (n - (2 * n - 2))	){
//					
////					if( (x==(n-1))&&(y==1) ){
////						System.out.println("  ");
////					}else if((x==(n+1))&&(y==1)){
////						System.out.println("  ");
////					}else if(x==1&&(y==(n-1))){
////						System.out.println("  ");
////					}else if(x==1&&(y==(n+1))){
////						System.out.println("  ");
////					}else if((x==(2*n-1))&&(y==(n-1))){
////						System.out.println("  ");
////					}else if((x==(2*n-1))&&(y==(n+1))){
////						System.out.println("  ");
////					}else if((x==(n-1))&&(y==(2*n-1))){
////						System.out.println("  ");
////					}else if((x==(n+1))&&(y==(2*n-1))){
////						System.out.println("  ");
////					}else
//						System.out.print("*");
//				}
//				
//
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
//
//
//	}
//}
