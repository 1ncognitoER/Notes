package inClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 加载驱动（加载到jvm,每种数据库的值不同）
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 提供url(本地：@127.0.0.1或@localhost)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		// 获取数据库连接
		String user = "hr";
		String password = "000000";
		Connection con = DriverManager.getConnection(url, user, password);
		// 创建Statement实例
		Statement sta = con.createStatement();
		// 执行sql并获取返回结果
		ResultSet rs = sta.executeQuery("select * from employees");
		// 处理返回的结果
		while (rs.next()) {
			// 方案一
			// int employee_id = rs.getInt(1);
			// String first_name = rs.getString(2);
			// System.out.print(employee_id+" ");
			// System.out.println(first_name);
			// 方案二
			System.out.print(rs.getInt("employee_id") + " ");
			System.out.println(rs.getString("first_name"));
		}
	}

}
