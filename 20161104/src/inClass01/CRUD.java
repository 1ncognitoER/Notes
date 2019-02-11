package inClass01;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Blood Moon
 * 
 * 实现增删改查
 * 
 * Statement对象会导致SQL注入攻击
 * Statement对象会导致SQL注入攻击
 * Statement对象会导致SQL注入攻击
 * 
 */
public class CRUD {
	public void search(){
		System.out.println("search successful!");
	}
	/**
	 * 数据添加
	 * @param cinf
	 * @throws Exception
	 */
	public void add(ClassInf cinf) throws Exception{
		System.out.println("开始建立数据库连接……");
		Connection con = JDBC_do.connent_it();
		System.out.println("数据库连接成功！");
		Statement stmt = con.createStatement();
		stmt.execute("insert into classinf(classname) values('"+cinf.getClassName()+"')");
		System.out.println("add successful!");
		JDBC_do.break_it(con);
		System.out.println("成功关闭数据库连接！");
	}
	public void modify(){
		System.out.println("modify successful!");
	}
	/**
	 * 数据删除
	 * @param classID
	 * @throws Exception
	 */
	public void delete(int classID) throws Exception{
		System.out.println("开始建立数据库连接……");
		Connection conn = JDBC_do.connent_it();
		System.out.println("数据库连接成功！");
		Statement stmt = conn.createStatement();
		stmt.execute("delete from classinf where classID="+classID);
		System.out.println("delete successful!");
		JDBC_do.break_it(conn);
		System.out.println("成功关闭数据库连接！");
	}
}

