package inClass01;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Blood Moon
 *
 * 对数据库的操作
 */
public class JDBC_do {
	//与数据库建立连接
	public static Connection connent_it() throws Exception{
		//加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//提供URL,user,password
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String user = "hr";
		String password = "000000";
		//建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	//关闭数据库连接
	public static void break_it(Connection conn) throws Exception{
		if(conn != null){
			conn.close();
		}
	}
}
