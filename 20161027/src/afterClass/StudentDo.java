package afterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import studentsManageSystem.FileHandle;
//import studentsManageSystem.Students;

public class StudentDo {

	static Scanner input = new Scanner(System.in);

	/**
	 * 添加数据
	 * 
	 * @throws Exception
	 */
	public String add(String data) throws Exception {
		// 将String数据转换成students对象
		String[] newData = data.split(",");
		long idNumber = Integer.parseInt(newData[0]);
		String name = newData[1];
		int age = Integer.parseInt(newData[2]);
		String remarks = newData[3];
		// 创建集合
		List<Students> LData = new ArrayList<Students>();
		LData = (List<Students>) FileDeal.readFile();
		LData.add(new Students(idNumber, name, age, remarks));
		FileDeal.writeFile(LData);
		return "添加成功！";
	}

	public String search(String name) throws Exception {
		String newData = null;
		List<Students> LData = new ArrayList<Students>();
		LData = (List<Students>) FileDeal.readFile();
		for (int index = 0; index < LData.size(); index++) {
			if (name.equals(LData.get(index).getName())) {
				newData = LData.get(index).getIdNumber() + "," + LData.get(index).getName() + ","
						+ LData.get(index).getAge() + "," + LData.get(index).getRemarks();
			} else {
				continue;
			}
		}
		if (newData != null) {
			return newData;
		} else {
			return "查无此人！";
		}
	}

	public String modify(String data) throws Exception {
		// 将String数据转换成students对象
		String[] newData = data.split(",");
		long idNumber = Integer.parseInt(newData[0]);
		String name = newData[1];
		int age = Integer.parseInt(newData[2]);
		String remarks = newData[3];

		List<Students> LData = new ArrayList<Students>();
		LData = (List<Students>) FileDeal.readFile();
		
		int number= 0;//记录下标
		
		for (int index = 0; index < LData.size(); index++) {
			if (idNumber==LData.get(index).getIdNumber()) {
				LData.get(index).setIdNumber(idNumber);
				LData.get(index).setName(name);
				LData.get(index).setAge(age);
				LData.get(index).setRemarks(remarks);
				number=index;//记录下标
				FileDeal.writeFile(LData);
				break;
			} else {
				continue;
			}
		}
		if(number!=LData.size()){
			return "修改成功！";
		}else{
			return "查无此人！无法修改！";
		}
	}

	public String delete(long idNumber) throws Exception {
		int number= 0;//记录下标
		List<Students> LData = new ArrayList<Students>();
		LData=(List<Students>)FileDeal.readFile();
		for(int index = 0; index<LData.size();index++){
			if(idNumber==LData.get(index).getIdNumber()){
				LData.remove(index);
				number=index;
				FileDeal.writeFile(LData);
				break;
			}else{
				continue;
			}
		}
		if(number!=LData.size()){
			return "删除成功！";
		}else{
			return "查无此人！无法删除！";
		}
	}
	
}