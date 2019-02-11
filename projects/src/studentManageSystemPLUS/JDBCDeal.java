package studentManageSystemPLUS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库操作类
 * @author Blood Moon
 * 
 */
public class JDBCDeal {
	/**
	 * 建立与数据库的连接
	 * @return
	 * @throws Exception
	 */
	public static Connection connect_it() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "hr";
		String password = "000000";
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	/**
	 * 断开与数据库的连接
	 * @param conn
	 * @throws Exception
	 */
	public static void break_it(Connection conn) throws Exception{
		if(conn != null){
			conn.close();
		}
	}
}
