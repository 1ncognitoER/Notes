package studentManageSystemPLUS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDDeal {
	/**
	 * 查询administrators表，用以管理员登录验证
	 * 
	 * @return list<Administrators>
	 * @throws Exception
	 */
	public boolean adminLogin(String account, String password) throws Exception {
		// 取出数据库的数据存入缓冲区（集合）
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sql = "select * from administrators";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Administrators> li = new ArrayList<Administrators>();
		while (rs.next()) {
			Administrators admin = new Administrators(rs.getString(1), rs.getString(2));
			li.add(admin);
		}
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		// 登陆验证
		int index;
		for (index = 0; index < li.size(); index++) {
			// 账号验证
			if (account.equals(li.get(index).getA_account())) {
				// 密码验证
				if (password.equals(li.get(index).getA_password())) {
					break;
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
		// index小于等于集合的下标，表示循环提前结束，即找到用户信息
		if (index <= (li.size() - 1)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 查询students表，用以学生登录验证
	 * 
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public boolean studentLogin(String account, String password) throws Exception {
		// 取出数据库的数据存入缓冲区（集合）
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sql = "select * from students";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<StudentsInf> li = new ArrayList<StudentsInf>();
		while (rs.next()) {
			StudentsInf sinf = new StudentsInf(rs.getString(2), rs.getString(3));
			li.add(sinf);
		}
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		// 登陆验证
		int index;
		for (index = 0; index < li.size(); index++) {
			// 账号验证
			if (account.equals(li.get(index).getName())) {
				// 密码验证
				if (password.equals(li.get(index).getS_password())) {
					break;
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
		// index小于等于集合的下标，表示循环提前结束，即找到用户信息
		if (index <= (li.size() - 1)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 用名字和密码来注册
	 * 
	 * @param account
	 * @param password
	 * @throws Exception
	 */
	public void register(String account, String password) throws Exception {
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sqlS = "insert into students(s_password,s_name) values(?,?)";
		PreparedStatement pstmtS = conn.prepareStatement(sqlS);
		pstmtS.setString(1, password);
		pstmtS.setString(2, account);
		pstmtS.executeUpdate();// 上传到数据库
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
	}

	/**
	 * 管理员查询
	 * 
	 * @return
	 * @throws Exception
	 */
	public String adminSearch() throws Exception {
		// 申明返回值变量
		String finalString = null;
		// 取出数据库的数据存入缓冲区（集合）
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sql = "select * from students join classinformation on s_classid=c_id";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<StudentsInf> li = new ArrayList<StudentsInf>();
		while (rs.next()) {
			StudentsInf stuinf = new StudentsInf(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getInt(5), rs.getString(6), rs.getString(8), rs.getString(9));
			li.add(stuinf);
		}
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		for (int index = 0; index < li.size(); index++) {
			StudentsInf si = new StudentsInf(li.get(index).getS_account(), li.get(index).getS_password(),
					li.get(index).getName(), li.get(index).getSex(), li.get(index).getAge(),
					li.get(index).getS_classid(), li.get(index).getS_classname(), li.get(index).getS_classcontent());
			if (finalString == null) {
				finalString = si.toString();
			} else {
				finalString = finalString + "\n" + si.toString();
			}
		}
		return finalString;
	}

	/**
	 * 根据姓名查询
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public String search(String name) throws Exception {
		// 申明返回值变量
		String finalString = null;
		// 取出数据库的数据存入缓冲区（集合）
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sql = "select * from students where s_name=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		List<StudentsInf> li = new ArrayList<StudentsInf>();
		while (rs.next()) {
			StudentsInf stuinf = new StudentsInf(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getInt(5), rs.getString(6));
			li.add(stuinf);
		}
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		for (int index = 0; index < li.size(); index++) {
			StudentsInf si = new StudentsInf(li.get(index).getS_account(), li.get(index).getS_password(),
					li.get(index).getName(), li.get(index).getSex(), li.get(index).getAge(),
					li.get(index).getS_classid());
			if (finalString == null) {
				finalString = si.toStringPlus();
			} else {
				finalString = finalString + "\n" + si.toStringPlus();
			}
		}
		return finalString;
	}

	/**
	 * 根据学号修改学生信息
	 * 
	 * @param strData
	 * @return
	 * @throws Exception
	 */
	public String modify(String strData) throws Exception {
		// 拆分strData信息
		String[] newData = strData.split(" ");
		int account = Integer.parseInt(newData[0]);
		String password = newData[1];
		String name = newData[2];
		String sex = newData[3];
		int age = Integer.parseInt(newData[4]);
		String classid = newData[5];
		// 将数据添加到数据库
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sqlS = "update students set s_password=?,s_name=?,s_sex=?,s_age=?,s_classid=? where s_account=?";
		PreparedStatement pstmtS = conn.prepareStatement(sqlS);
		pstmtS.setString(1, password);
		pstmtS.setString(2, name);
		pstmtS.setString(3, sex);
		pstmtS.setInt(4, age);
		pstmtS.setString(5, classid);
		pstmtS.setInt(6, account);
		pstmtS.executeUpdate();// 上传到数据库
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		return "成功修改数据！";
	}

	/**
	 * 添加数据(学号由数据库生成)
	 * 
	 * @param strData
	 *            文本框取得的数据
	 * @return
	 * @throws Exception
	 */
	public String add(String strData) throws Exception {
		// 拆分strData信息
		String[] newData = strData.split(" ");
		// int account = Integer.parseInt(newData[0]);
		String password = newData[0];
		String name = newData[1];
		String sex = newData[2];
		int age = Integer.parseInt(newData[3]);
		String classid = newData[4];
		// String classname = newData[5];
		// String classcontent = newData[6];
		// 将数据添加到数据库
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sqlS = "insert into students(s_password,s_name,s_sex,s_age,s_classid) values(?,?,?,?,?)";
		PreparedStatement pstmtS = conn.prepareStatement(sqlS);
		// pstmtS.setInt(1, account);
		pstmtS.setString(1, password);
		pstmtS.setString(2, name);
		pstmtS.setString(3, sex);
		pstmtS.setInt(4, age);
		pstmtS.setString(5, classid);
		pstmtS.executeUpdate();// 上传到数据库
		// String sqlC = "insert into classinformation(c_id,c_name,c_content)
		// values(?,?,?)";
		// PreparedStatement pstmtC = conn.prepareStatement(sqlC);
		// pstmtC.setString(1, classid);
		// pstmtC.setString(2, classname);
		// pstmtC.setString(3, classcontent);
		// pstmtC.executeUpdate();// 上传到数据库
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		return "成功添加数据！";
	}

	/**
	 * 根据学号删除学生数据
	 * 
	 * @param strData
	 * @return
	 * @throws Exception
	 */
	public String delete(String strData) throws Exception {
		// 转换strData数据类型
		int account = Integer.parseInt(strData);
		// 将数据添加到数据库
		System.out.println("正在与数据库建立连接……");
		Connection conn = JDBCDeal.connect_it();
		System.out.println("连接成功！");
		String sqlS = "delete students where s_account=?";
		PreparedStatement pstmtS = conn.prepareStatement(sqlS);
		pstmtS.setInt(1, account);
		pstmtS.executeUpdate();// 上传到数据库
		JDBCDeal.break_it(conn);
		System.out.println("成功关闭数据库连接！");
		return "成功删除数据！";
	}

}
