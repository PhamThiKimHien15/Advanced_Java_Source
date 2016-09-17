package AllExercise8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
 * author: Pham Thi Kim Hien
 * Date: 17/9/2016
 * Version: 1.0
*/
public class CategoryController {
	Database db = new Database();
	
	//  get data from database to the list
	public ArrayList<Category> getCategory(){
		ArrayList<Category> list = new ArrayList<Category>();
		try (Connection conn = db.connect()){
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM category";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Category cate = new Category(Integer.parseInt(rs.getString("id")), rs.getString("name"), rs.getString("description"), 
						rs.getString("image"));
				list.add(cate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		}
		return list;
	}
	
	
}
