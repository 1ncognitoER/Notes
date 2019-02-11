package inClass;

import java.io.File;

/**
 * @author Blood Moon
 *
 * File类的使用
 * 
 */
public class Test {
	public static void main(String[] args) {

		String name = "E:\\Eclipse\\20161024\\src\\inClass01\\testData";
		File file = new File(name);

//		 Method01(file);

//		 Method02();

		Method03(file);
	}

	/**
	 * @param file
	 */
	public static void Method03(File file) {
		if (file.isFile()) {
			System.out.println(file.getAbsolutePath());
		} else {
			File[] fs = file.listFiles();
			for (File f : fs) {
				if (f.isFile()) {
					System.out.println(f.getAbsolutePath());
				} else {
					Method03(f);
				}
			}
		}
	}

	/**
	 * 判断是文件还是文件夹
	 */
	public static void Method02() {
		File file01 = new File("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test01");
		File file02 = new File("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\01");
		System.out.println(file01.getName() + ":" + file01.isFile());
		System.out.println(file02.getName() + ":" + file02.isFile());
	}

	/**
	 * 
	 * @param file
	 *            File类的应用
	 */
	public static void Method01(File file) {

		// String[] nameList = file.list();
		// for (String fName : nameList) {
		// System.out.println(fName);
		// }

		File[] nameList = file.listFiles();
		for (File fName : nameList) {
			System.out.println(fName);
		}
	}
}
