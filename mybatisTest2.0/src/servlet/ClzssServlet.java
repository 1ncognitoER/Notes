package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Service;
import bean.Clzss;
import serviceImpl.ServiceImpl;

/**
 * Servlet implementation class ClzssServlet
 */
@WebServlet("/ClzssServlet")
public class ClzssServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClzssServlet() {
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
		request.setCharacterEncoding("utf-8");
		Service ss = new ServiceImpl();
		String handle = request.getParameter("handle");
		if(handle == null){
			List<Clzss> clzssList = ss.selectAllClzss();
			request.setAttribute("clzssList", clzssList);
			request.setAttribute("all", true);
			request.getRequestDispatcher("ClzssInf.jsp").forward(request, response);
		}else if ("select".equals(handle)) {
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			Clzss clzss = ss.selectClzssById(clzssId);
			request.setAttribute("clzss", clzss);
			request.setAttribute("one", true);
			request.getRequestDispatcher("ClzssInf.jsp").forward(request, response);
		} else if("update".equals(handle)) {
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			String clzssName = request.getParameter("clzssName");
			String clzssContent = request.getParameter("clzssContent");
			ss.updateClzss(new Clzss(clzssId, clzssName, clzssContent, null));
			PrintWriter out = response.getWriter();
			out.write("1");
			out.close();
		}else if("delete".equals(handle)){
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			ss.deleteClzssById(clzssId);
			response.sendRedirect("ClzssServlet");
		}else if("add".equals(handle)){
			int clzssId = Integer.parseInt(request.getParameter("clzssId"));
			String clzssName = request.getParameter("clzssName");
			String clzssContent = request.getParameter("clzssContent");
			ss.insertClzss(new Clzss(clzssId, clzssName, clzssContent, null));
			response.sendRedirect("ClzssServlet");
		}
	}

}
