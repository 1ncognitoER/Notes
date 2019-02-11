package test;

/**
 * 猴子吃桃算法
 * @author Blood Moon
 *
 */
public class ChiTao {

	public static void main(String[] args) {
		int flag=10;
		int finNum=1;
		
		System.out.println(calculate(flag,finNum));
	}
	static int calculate(int flag,int finNum){
		if(flag==1){
			return finNum;
		}else{
			flag=flag-1;
			finNum=(finNum+1)*2;
			return calculate(flag,finNum);
		}
	}
}