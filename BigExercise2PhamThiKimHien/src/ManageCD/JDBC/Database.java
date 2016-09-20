package ManageCD.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: use to connect to database
 */
public class Database {
	private final static String username = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://127.0.0.1/cdstore?useUnicode=true&characterEncoding=utf8";
	private final static String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}