package Ex6_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * author: Pham Thi Kim Hien
 * date: 14/09/2016
 * Version: 1.0
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int ans;
		String content = "";
		Diary diary;
		while (true){
			while (true) {
				System.out.println("==================================");
				System.out.println("1.View diary");
				System.out.println("2.Write new diary");
				System.out.println("3.Exit");
				ans = Integer.parseInt(input.readLine());
				if (ans >= 1 && ans <=3)
					break;
			}
			if (ans == 3)
				break;
			switch (ans) {
			case 1:
				diary = new Diary();
				viewDiary();
				break;
			case 2:
				System.out.println("Enter content: ");
				content = input.readLine();
				diary = new Diary(content);
				writeNewDiary(diary, content);
				break;
			}
		}				
	}

	private static void writeNewDiary(Diary diary, String content) {
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/Ex6_1/daily.txt", true)))){
			Date date1 = new Date(System.currentTimeMillis());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			String date = sdf.format(date1.getTime());
			out.writeUTF(date);
			out.writeUTF(content);
			out.close();
			System.out.println("Diary has been written");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void viewDiary() {
		String diary1 = "";
		String date,  content;
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/Ex6_1/daily.txt")))) {
			while (in.available()>0) {
				date = in.readUTF();
				content = in.readUTF();
				diary1 += date + "\n" + content + "\n\n";				
			}			
		} catch ( IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(diary1);
	}
}
