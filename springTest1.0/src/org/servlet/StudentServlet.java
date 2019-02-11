package org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.service.StudentService;
import org.serviceImpl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;


/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 放在post方法的第一行
				// 放在post方法的第一行
				// 放在post方法的第一行
				request.setCharacterEncoding("utf-8");

				// StudentService ss = new StudentServiceImpl();
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				/*方法一采用实现类*/
				StudentService ss = context.getBean("service", StudentServiceImpl.class);
				/*方法二采用接口*/
				// StudentService ss = context.getBean("service", StudentService.class);

				// 针对增删改查Student的业务逻辑
				// handle=selectOne/selectAll/insert/delete/update
				String handle = request.getParameter("handle");
				if (handle == null) {// 没有请求时，查询全部
					List<Student> studentList = ss.selectAllStudents();
					request.setAttribute("studentList", studentList);
					request.getRequestDispatcher("Index.jsp").forward(request, response);
				} else if ("update".equals(handle)) {// 修改请求
					int studentId = Integer.parseInt(request.getParameter("studentId"));
					String studentName = request.getParameter("studentName");
					int studentAge = Integer.parseInt(request.getParameter("studentAge"));
					// 性别
					char studentSex = request.getParameter("studentSex").toCharArray()[0];
					String studentContent = request.getParameter("studentContent");
					int clzssId = Integer.parseInt(request.getParameter("clzssId"));
					ss.updateStudent(new Student(studentId, studentName, studentAge, studentSex, studentContent, clzssId));
					PrintWriter out = response.getWriter();
					out.write("1");
					out.close();
				} else if ("delete".equals(handle)) {
					int studentId = Integer.parseInt(request.getParameter("studentId"));
					ss.deleteStudent(studentId);
					response.sendRedirect("StudentServlet");
				} else if ("add".equals(handle)) {
					int studentId = Integer.parseInt(request.getParameter("studentId"));
					String studentName = request.getParameter("studentName");
					int studentAge = Integer.parseInt(request.getParameter("studentAge"));
					String studentContent = request.getParameter("studentContent");
					// 性别
					char studentSex = request.getParameter("studentSex").toCharArray()[0];
					int clzssId = Integer.parseInt(request.getParameter("clzssId"));
					ss.insertStudent(new Student(studentId, studentName, studentAge, studentSex, studentContent, clzssId));
					response.sendRedirect("StudentServlet");
				}
	}

}
