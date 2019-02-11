package afterClass;

public class Case5 {
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=50;i++){
			if(i%7==0){
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("1至50中是7的倍数的数值之和为："+sum);
	}
}
