package org.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bean.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.gson.Gson;

@Controller
public class IndexController {
	/* 1.1 转发到页面 */
	@RequestMapping("firstOne")
	public String firstOne() {
		System.out.println("test data");
		return "Index";
	}

	/* 1.2 转发到页面 */
	@RequestMapping("firstTwo")
	public ModelAndView firstTwo() {
		return new ModelAndView("Index");
	}

	/* 2.1 重定向到页面 */
	@RequestMapping("secondOne")
	public String secondOne() {
		return "redirect:Index.jsp";
	}

	/* 2.2 重定向到页面 */
	@RequestMapping("secondTwo")
	public ModelAndView secondTwo() {
		return new ModelAndView(new RedirectView("Index.jsp"));
	}

	/* 3.1 重定向到处理器 */
	@RequestMapping("thirdOne")
	public String thirdOne() {
		return "redirect:firstOne.do";
	}

	/* 3.2 重定向到处理器 */
	@RequestMapping("thirdTwo")
	public ModelAndView thirdTwo() {
		return new ModelAndView("redirect:firstOne.do");
	}

	/* 4.1 转发到处理器 */
	@RequestMapping("fourOne")
	public String fourOne() {
		return "forward:firstOne.do";
	}

	/* 4.2转发 到处理器 */
	@RequestMapping("fourTwo")
	public ModelAndView fourTwo() {
		return new ModelAndView("forward:firstOne.do");
	}

	/** 5 请求中的参数 **/
	/* 5.1 自动填充 */
	// http://localhost:8080/20161214springMVC/fiveOne.do?id=1&name=萧炎
	@RequestMapping("fiveOne")
	public String fiveOne(int id, String name) {
		System.out.println(id + "--" + name);
		return "Index";
	}

	/* 5.2 自动填充 */
	// http://localhost:8080/20161214springMVC/fiveTwo.do?name=萧炎
	@RequestMapping("fiveTwo")
	public String fiveTwo(@RequestParam(required = false) Integer id, String name) {
		System.out.println(id + "--" + name);
		return "Index";
	}

	/* 5.3 自动填充与形参名称不同的参数 */
	// http://localhost:8080/20161214springMVC/fiveThird.do?id=1&username=萧炎
	@RequestMapping("fiveThird")
	public String fiveThird(Integer id, @RequestParam(required = true, name = "username") String name) {
		System.out.println(id + "--" + name);
		return "Index";
	}

	/*** 5.4 自动填充对象属性 ***/
	// 表单中的name值必须与实体类中的属性相同，否则不会自动填充
	@RequestMapping("fivefour")
	public String fivefour(Student student) {
		System.out.println(student);
		return "Index";
	}

	/*** 设置日期格式自动填充 ***/
	@InitBinder
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// setLenient用于设置Calendar是否宽松解析字符串，如果为false，则严格解析；默认为true，宽松解析
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	/** 6 手动传参方法 **/
	// http://localhost:8080/20161214springMVC/six.do?studentName=FireIt
	@RequestMapping("six")
	public String six(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
		String name = request.getParameter("studentName");
		// System.out.println(name);
		request.setAttribute("name1", name + " from request");
		session.setAttribute("name2", name + " from session");
		return "Index";
	}

	/* 7 json：独立于任何语言的一种数据格式，以大括号代表对象，中括号代表数组 */
	/* 7.1 json 方法一 */
	// http://localhost:8080/20161214springMVC/Index.jsp
	@RequestMapping("sevenOne")
	public void sevenOne(HttpServletResponse response) throws Exception {
		PrintWriter pw = response.getWriter();
		pw.write("{\"studentId\":\"1\",\"studentName\":\"cailin\"}");
	}

	/* 7.2 json 方法二 */
	// http://localhost:8080/20161214springMVC/Index.jsp
	@RequestMapping("sevenTwo")
	public void sevenTwo(HttpServletResponse response) throws Exception {
		PrintWriter pw = response.getWriter();
		Student s = new Student(101, "萧炎", "noname", new Date());
		//gson把对象转化成字符串
		pw.write(new Gson().toJson(s));
	}
	
	/* 7.3 json 方法三	需要更改spring-servlet.xml */
	// http://localhost:8080/20161214springMVC/Index.jsp
	//@ResponseBody用于json
	@RequestMapping("sevenThird")
	@ResponseBody
	public Object sevenThird() throws Exception {
		List<Student> ss = new ArrayList<Student>();
		ss.add(new Student(101, "xiaoyan", "noname", new Date()));
		ss.add(new Student(102, "熏儿", "noname", new Date()));
		return ss;
	}
}