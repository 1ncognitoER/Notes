package serviceImpl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Service.Service;
import bean.Clzss;
import bean.Student;
import dao.Dao;

public class ServiceImpl implements Service {
//	StudentDao studentDao = new StudentDaoImpl();
	private Dao dao = null;
	
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	
	public ServiceImpl() {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//设置自动提交
			sqlSession = sqlSessionFactory.openSession(true);
			dao = sqlSession.getMapper(Dao.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*处理student业务*/
	@Override
	public Student selectStudent(int studentId) {
		// TODO Auto-generated method stub
		return dao.selectStudent(studentId);
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return dao.selectAllStudents();
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		dao.deleteStudent(studentId);
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		dao.insertStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.updateStudent(student);
	}
	/*处理clzss业务*/
	@Override
	public Clzss selectClzssById(int clzssId) {
		// TODO Auto-generated method stub
		return dao.selectClzssById(clzssId);
	}
	@Override
	public List<Clzss> selectAllClzss() {
		// TODO Auto-generated method stub
		return dao.selectAllClzss();
	}
	@Override
	public void deleteClzssById(int clzssId) {
		// TODO Auto-generated method stub
		dao.deleteClzssById(clzssId);
	}
	@Override
	public void insertClzss(Clzss clzss) {
		// TODO Auto-generated method stub
		dao.insertClzss(clzss);
	}
	@Override
	public void updateClzss(Clzss clzss) {
		// TODO Auto-generated method stub
		dao.updateClzss(clzss);
	}
}
