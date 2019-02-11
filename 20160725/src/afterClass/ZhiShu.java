package afterClass;

/**
 * @author Blood Moon
 * 1-100
 */
public class ZhiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int number = 1; number <= 100; number++) {
			if( testIsPrime(number) ){
				System.out.print(number+" ");
			}
		}
	}

	public static boolean testIsPrime(int number) {
		if (number <= 3) {
			return number > 1;
		}
		for (int i = 2; /*i*i<=number*/ i <= Math.sqrt(number); i++) {// Math.sqrt()返回正确舍入值的正平方根。
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
