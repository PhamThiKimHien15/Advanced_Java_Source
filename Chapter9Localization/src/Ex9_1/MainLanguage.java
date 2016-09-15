package Ex9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
/*
 * author: Pham Thi Kim Hien
 * Date: 13/09/2016
 * version: 1.0
 */
public class MainLanguage {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			int ans;
			while (true){
				System.out.println("1. Viet Nam");
				System.out.println("2. English");
				ans = Integer.parseInt(input.readLine());
				if (ans == 1 || ans == 2)
					break;
			}
			Locale curr;
			ResourceBundle message;
			switch (ans) {
			case 1:
				curr = new Locale("vi", "VN");
				message = ResourceBundle.getBundle("Ex9_1/resource_vi_VN", curr);
				list(message);
				break;
			case 2:
				curr = new Locale("en", "EN");
				message = ResourceBundle.getBundle("Ex9_1/resource_en_US", curr);
				list(message);
				break;
			default:
				break;
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}		
	}
	public static void list(ResourceBundle message) {
		List<String> list = new ArrayList<String>();
		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.add(value);
		}
		for (String value : list) {
			System.out.println(value);
		}
	}
}
