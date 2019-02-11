package inClass02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDHandle {
	/**
	 * 添加班级名称来添加数据（班级号有SQL序列生成）
	 * @param classname
	 * @throws Exception
	 */
	public void add(String classname) throws Exception{
		System.out.println("与数据库建立连接中……");
		Connection conn = JdbcDo.connent_it();
		System.out.println("成功建立连接！");
//		String inData = "class002";
		PreparedStatement pstmt = conn.prepareStatement("insert into classinf(classname) values(?)");
		pstmt.setString(1, classname);
		pstmt.executeUpdate();
		System.out.println("添加成功！");
		JdbcDo.break_it(conn);
		System.out.println("成功关闭数据库连接！");
	}
	/**
	 * 根据班级号来删除相关数据
	 * @param classid
	 * @throws Exception
	 */
	public void delete(int classid) throws Exception{
		System.out.println("与数据库建立连接中……");
		Connection conn = JdbcDo.connent_it();
		System.out.println("成功建立连接！");
		PreparedStatement pstmt = conn.prepareStatement("delete classinf where classid=?");
		pstmt.setInt(1, classid);
		pstmt.executeUpdate();
		System.out.println("删除成功！");
		JdbcDo.break_it(conn);
		System.out.println("成功关闭数据库连接！");
	}
	/**
	 * 根据班级号来修改班级名称
	 * @throws Exception
	 */
	public void modify(int classid,String classname) throws Exception{
		System.out.println("与数据库建立连接中……");
		Connection conn = JdbcDo.connent_it();
		System.out.println("成功建立连接！");
		PreparedStatement pstmt = conn.prepareStatement("update classinf set classname=? where classid=?");
		pstmt.setString(1, classname);
		pstmt.setInt(2, classid);
		pstmt.executeUpdate();
		System.out.println("修改成功！");
		JdbcDo.break_it(conn);
		System.out.println("成功关闭数据库连接！");
	}
	/**
	 * 根据班级名来查询该班的信息
	 * @param classname
	 * @throws Exception
	 */
	public void search(String classname) throws Exception{
		System.out.println("与数据库建立连接中……");
		Connection conn = JdbcDo.connent_it();
		System.out.println("成功建立连接！");
		PreparedStatement pstmt = conn.prepareStatement("select * from classinf where classname=?");
		pstmt.setString(1, classname);
		ResultSet rs = pstmt.executeQuery();
		List<ClassInf> li = new ArrayList<ClassInf>();
		while(rs.next()){
			ClassInf ci = new ClassInf(rs.getInt(1),rs.getString(2));
			li.add(ci);
		}
		System.out.println(li);
		System.out.println("查询完成！");
		System.out.println("成功关闭数据库连接！");
	}
}
