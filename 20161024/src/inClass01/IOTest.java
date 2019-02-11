package inClass01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Blood Moon 
 * 
 * 输入输出流
 */
public class IOTest {
	public static void main(String[] args) {
		try {
			method01();
//			method02();
//			method03();
//			method04();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 * 
	 *             节点流->字节流
	 */
	public static void method01() throws Exception {
		FileInputStream fis = new FileInputStream("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test01");
		FileOutputStream fos = new FileOutputStream("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test02");
		int number = 0;
		while ((number = fis.read()) != -1) {
			fos.write(number);
		}
		fis.close();
		fos.close();
		System.out.println("复制成功！");
	}

	/**
	 * 
	 * @throws Exception
	 * 
	 *             节点流->字符流
	 */
	public static void method02() throws Exception {
		FileReader fr = new FileReader("E:\\Eclipse\20161024\\src\\inClass01\\testData\\01\\test05");
		FileWriter fw = new FileWriter("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test03");
		int number = 0;
		while ((number = fr.read()) != -1) {
			fw.write(number);
		}
		fr.close();
		fw.close();
		System.out.println("复制成功！");
	}

	/**
	 * 
	 * @throws Exception
	 * 
	 *             缓冲流可以和字符流或字符流来合用
	 */
	public static void method03() throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\01\\test05"));
		bw.write("asdfghjkl");
		bw.close();
		System.out.println("写入成功！");
		BufferedReader br = new BufferedReader(new FileReader("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\01\\test05"));
		System.out.println(br.readLine());
		br.close();
		System.out.println("读取成功！");
	}

	/**
	 * 
	 * @throws Exception
	 * 
	 *             处理流->字符流的缓冲流（即字符流结合缓冲流来使用）
	 */
	public static void method04() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test01"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Eclipse\\20161024\\src\\inClass01\\testData\\test04"));
		char[] c = new char[10];
		int number = 0;
		while ((number = br.read(c)) != -1) {
//			System.out.println(number);
			bw.write(c, 0, number);
		}
		br.close();
		bw.close();
		System.out.println("复制成功！");
	}
	public static void method05() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(""/*填字符串*/)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("")));
		/**
		 * ……
		 * ……
		 *
		 */
	}
	
}