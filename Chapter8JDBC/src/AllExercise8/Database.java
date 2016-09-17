package AllExercise8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * author: Pham Thi Kim Hien
 * Date: 17/9/2016
 * Version: 1.0
*/
public class Database {
	private final static String username = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://127.0.0.1/store?useUnicode=true&characterEncoding=utf8";
	private final static String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
