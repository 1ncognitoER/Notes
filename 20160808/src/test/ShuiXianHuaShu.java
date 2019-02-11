package test;

public class ShuiXianHuaShu {
	/**
	 * 水仙花数
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 100; i <= 1000; i++) {
			int geWei = i%10;
			int shiWei = (i/10)%10;
			int baiWei = (i/100)%10;
			
			if (i==(geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei)) {
				System.out.print(i+" ");
			}else{
				continue;
			}
		}
	}

}
