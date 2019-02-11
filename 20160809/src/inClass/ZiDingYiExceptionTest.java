package inClass;

public class ZiDingYiExceptionTest {

//	// 1.用try-catch来接收从其它方法抛出的异常
//	public static void main(String[] args) {
//		try {
//			double a = 0.0, b = 2.0;
//			System.out.println(show(a, b));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	// 2.用再抛出异常的方式来处理从其它方法抛出的异常
	public static void main(String[] args) throws Exception {
		// 在调用的show方法内抛出的是ZiDingYiException时则该处可以继续抛出ZiDingYiException或Exception
		double a = 2.0, b = 0.0;
		System.out.println(show(a, b));
	}

	public static double show(double a, double b) throws ZiDingYiException {
		// 此处再次抛出的异常必须是该异常类或其父类；如果该处抛出的是Exception异常则主方法不能抛出ZiDingYiException
		if (b == 0) {
			throw new ZiDingYiException("除数不能为零！");// 抛出自定义的异常
		} else {
			return a / b;
		}

	}

}
