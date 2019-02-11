package inClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Blood Moon
 * 
 *         对象流测试类
 */
public class TestS {
	public static void main(String[] args) throws Exception {
		String pathName = "E:\\Eclipse\\20161025\\src\\inClass\\data\\testData";
		write(pathName);
		System.out.println(read(pathName));
	}

	private static Student read(String pathName) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathName));
		Student student = (Student) ois.readObject();
		return student;
	}

	private static void write(String pathName) throws Exception {
		// TODO Auto-generated method stub
		Student stu = new Student(1234, "Noname");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathName));
		oos.writeObject(stu);
		oos.close();
	}
}
