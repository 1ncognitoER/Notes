package inClass1;

public class StudentTest {
/**
 * 有个小bug 修改学生信息时查找不到需要修改人时，程序会死
 * @param args
 */
	public static void main(String[] args) {
		StudentAdmin sa = new StudentAdmin();
		sa.start();
	}

}