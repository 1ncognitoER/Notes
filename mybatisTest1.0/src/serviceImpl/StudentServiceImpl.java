package serviceImpl;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Student;
import dao.StudentDao;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
//	StudentDao studentDao = new StudentDaoImpl();
	private StudentDao studentDao = null;
	
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	
	public StudentServiceImpl() {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//设置自动提交
			sqlSession = sqlSessionFactory.openSession(true);
			studentDao = sqlSession.getMapper(StudentDao.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Student selectStudent(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.selectStudent(studentId);
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.selectAllStudents();
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(studentId);
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.insertStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
	}

}
