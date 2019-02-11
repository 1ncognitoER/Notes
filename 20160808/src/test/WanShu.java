package test;

public class WanShu {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int number=0;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					number+=j;
				}
			}
			if(i==number){
				System.out.println(i+" ");
			}
		}
	}
}
