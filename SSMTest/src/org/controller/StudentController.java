package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bean.Student;
import org.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Controller是springMVC的注解*/
@Controller
public class StudentController {
	private StudentService ss;
	public StudentService getSs() {
		return ss;
	}
	/*@Autowired是spring的注解		实现service的自动填充*/
	@Autowired
	public void setSs(StudentService ss) {
		this.ss = ss;
	}
	
	@RequestMapping("student")
	public String student(String handle, HttpServletRequest request, HttpServletResponse response){
		if (handle == null) {// 没有请求时，查询全部
			List<Student> studentList = ss.selectAllStudents();
			request.setAttribute("studentList", studentList);
			/*request.getRequestDispatcher("Index.jsp").forward(request, response);*/
			return "Index";
		} else if ("update".equals(handle)) {// 修改请求
			int studentId = Integer.parseInt(request.getParameter("studentId"));
			String studentName = request.getParameter("studentName");
			int studentAge = Integer.parseInt(request.getParameter("studentAge"));
			// 性别
			char studentSex = request.getParameter("studentSex").toCharArray()[0];
			String studentContent = request.getParameter("studentContent");
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			ss.updateStudent(new Student(studentId, studentName, studentAge, studentSex, studentContent, clzssId));
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.write("1");
			out.close();
			return "Index";
		} else if ("delete".equals(handle)) {
			int studentId = Integer.parseInt(request.getParameter("studentId"));
			ss.deleteStudent(studentId);
			/*response.sendRedirect("StudentServlet");*/
			return "redirect:student.do";
		} else if ("add".equals(handle)) {
			int studentId = Integer.parseInt(request.getParameter("studentId"));
			String studentName = request.getParameter("studentName");
			int studentAge = Integer.parseInt(request.getParameter("studentAge"));
			String studentContent = request.getParameter("studentContent");
			// 性别
			char studentSex = request.getParameter("studentSex").toCharArray()[0];
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			ss.insertStudent(new Student(studentId, studentName, studentAge, studentSex, studentContent, clzssId));
			/*response.sendRedirect("StudentServlet");*/
			return "redirect:student.do";
		}else{
			return "Index";
		}
	}
}
