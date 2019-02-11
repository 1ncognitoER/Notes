package inClass02;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Blood Moon
 * 与数据库建立连接和断开连接的类
 */
public class JdbcDo {
	/**
	 * 建立与数据库的连接
	 * @return
	 * @throws Exception 
	 */
	public static Connection connent_it() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "hr";
		String password = "000000";
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	/**
	 * 关闭与数据库的连接
	 * @param conn
	 * @throws Exception
	 */
	public static void break_it(Connection conn) throws Exception{
		if(conn != null){
			conn.close();
		}
	} 
}
