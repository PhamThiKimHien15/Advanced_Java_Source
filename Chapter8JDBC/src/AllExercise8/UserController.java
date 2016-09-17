package AllExercise8;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * author: Pham Thi Kim Hien
 * Date: 17/9/2016
 * Version: 1.0
*/
public class UserController {
	Database db = new Database();
	
	// check user account
	public User loginUser(String username, String password) throws ClassNotFoundException {
		User user = null;
		try (Connection conn = db.connect()){
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM user WHERE username like '" + username 
					+ "' and password like '"+ password +"';";
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				user = new User();
				user.setUsername(result.getString("username"));
				user.setPassword(result.getString("password"));	
				conn.close();
				break;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}
	
	// add user account
	public void addUser(User user) {
		try (Connection conn = db.connect()){
			String sql = "INSERT INTO user values (NULL, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prestmt = conn.prepareStatement(sql);
			prestmt.setString(1, user.getUsername());
			prestmt.setString(2, user.getPassword());
			prestmt.setString(3, user.getEmail());
			prestmt.setString(4, user.getPhone());
			prestmt.setString(5, user.getAddress());
			prestmt.setString(6, user.getRole());
			prestmt.execute();
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
