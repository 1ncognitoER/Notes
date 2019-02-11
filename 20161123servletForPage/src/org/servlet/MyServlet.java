package org.servlet;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.employee.Employee;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 当前页
			int currentPage = 1;
			// 运用Java命名和目录接口（JNDI）用于连接数据源
			Context context = new InitialContext();
			// 连接数据源
			DataSource ds = (DataSource) context.lookup("java:comp/env/dataSource");
			// 创建连接
			Connection conn = ds.getConnection();

			// 获取数据总数
			PreparedStatement psOne = conn.prepareStatement("select count(*) from employees");
			ResultSet rset = psOne.executeQuery();
			rset.next();
			int total = rset.getInt(1);

			// 最大页码
			int maxPage = 0;
			if (total % 10 == 0) {
				maxPage = total / 10;
			} else {
				maxPage = total / 10 + 1;
			}
			// 首次访问该页面 request.getParameter("currentPage")为空
			if (request.getParameter("currentPage") != null) {
				currentPage = Integer.parseInt(request.getParameter("currentPage"));
			}

			if (currentPage < 1) {
				currentPage = 1;
			}
			if (currentPage > maxPage) {
				currentPage = maxPage;
			}
			// 数据库中当前页的最后一条数据的序号
			int end = currentPage * 10 + 1;
			// 数据库中当前页的第一条数据的序号
			int start = (currentPage - 1) * 10;
			// 申明集合用于缓存查询结果
			List<Employee> employee = new ArrayList<Employee>();
			// 查询员工信息
			PreparedStatement psTwo = conn.prepareStatement(
					"select * from (select employees.*,rownum as r from employees where rownum<?) e where e.r>?");
			psTwo.setInt(1, end);
			psTwo.setInt(2, start);
			ResultSet rs = psTwo.executeQuery();
			while (rs.next()) {
				employee.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(8)));
			}
			conn.close();
			//给jsp传参
			request.setAttribute("employee", employee);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("maxPage", maxPage);
			//请求跳转jsp页面
			request.getRequestDispatcher("test.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}