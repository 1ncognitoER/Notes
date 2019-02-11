package studentsManageSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileDeal {
	
	private static final String PATH = "E:\\Eclipse\\projects\\src\\studentsManageSystem\\data\\studentsInformation";
	/**
	 * 将数据写入文件
	 * @param student
	 * @throws Exception
	 */
	public static void writeFile(List<Students> student) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
		oos.writeObject(student);
		oos.close();
	}
	/**
	 * 将数据从文件中读出
	 * @return
	 * @throws Exception
	 */
	public static List<Students> readFile() throws Exception {
		List<Students> LStudent = new ArrayList<Students>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
		LStudent = (List<Students>) (ois.readObject());
		ois.close();
		return LStudent;
	}
	/**
	 * 清除文件内容
	 * @throws Exception
	 */
	public static void clearFile() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
		oos.writeObject(null);
		oos.close();
	}
}
