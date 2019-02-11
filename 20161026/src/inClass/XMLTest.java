package inClass;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 shengChengXml();
		jieXiXml();
	}

	// 生成并保存xml
	public static void shengChengXml() throws Exception {
		Document document = DocumentHelper.createDocument();
		Element students = document.addElement("students");
		// 根节点下添加第一个Student节点
		Element studentOne = students.addElement("student");
		studentOne.addAttribute("id", "1");
		Element name1 = studentOne.addElement("name");
		name1.setText("xiaohei");
		Element age1 = studentOne.addElement("age");
		age1.setText("10");
		// 根节点下添加第2个Student节点
		Element studentTwo = students.addElement("student");
		studentTwo.addAttribute("id", "2");
		Element name2 = studentTwo.addElement("name");
		name2.setText("xiaobai");
		Element age2 = studentTwo.addElement("age");
		age2.setText("20");
		System.out.println(document.asXML());

		// 将xml数据保存到xml文件中
		XMLWriter xmlWriter = null;
		OutputFormat outFormat = OutputFormat.createPrettyPrint();
		outFormat.setEncoding("UTF-8");
		outFormat.setTrimText(false);
		xmlWriter = new XMLWriter(
				new FileOutputStream("E:\\Eclipse\\20161026\\src\\inClass\\data\\Students.xml"), outFormat);
		xmlWriter.write(document);
		xmlWriter.close();

	}

	// 解析XML
	public static void jieXiXml() throws Exception {
		// 创建Document对象
		SAXReader saxReader = new SAXReader();
		Document document = saxReader
				.read(new File("E:\\Eclipse\\20161026\\src\\inClass\\data\\Students.xml"));
		Element students = document.getRootElement();// 获取xml的根节点
		List<Element> studentList = students.elements();// 获取根节点的子节点集合
		List<Student> myStudents = new ArrayList<Student>();
		for (Element e : studentList) {
			Student s = new Student();
			s.setId(Integer.parseInt(e.attributeValue("id")));
			List<Element> studentaList = e.elements();
			for (Element e1 : studentaList) {
				if (e1.getName().equals("name")) {
					s.setName(e1.getText());
				} else {
					s.setAge(Integer.parseInt(e1.getText()));
				}
			}
			myStudents.add(s);
		}
		System.out.println(myStudents);
	}
}

