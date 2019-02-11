package afterClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileDeal {
	
	private static final String PATH = "E:\\Eclipse\\20161027\\src\\afterClass\\data";
	//将数据写入文件
	public static void writeFile(List<Students> data) throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
		oos.writeObject(data);
		oos.close();
	}
	//将数据从文件读出
	public static List<Students> readFile() throws Exception{
		List<Students> data = new ArrayList<Students>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
		data=(List<Students>)(ois.readObject());
		ois.close();
		return data;
	}
}
