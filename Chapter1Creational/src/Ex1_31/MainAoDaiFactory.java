package Ex1_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 3:12:34 PM
 */
public class MainAoDaiFactory {
	public static void main(String[] args) {
		BufferedReader input= new BufferedReader( new InputStreamReader(System.in));
		try {
			IAoDai iAoDai;
			int choose;
			while (true) {
				System.out.println("1. Ao Dai Traditional");
				System.out.println("2. Ao Dai Stylized");
				System.out.println("3. Cheongsam");
				System.out.println("Choose: ");
				choose = Integer.parseInt(input.readLine());
				if (choose == 1 || choose == 2 || choose == 3)
					break;
			}
			if (choose == 1){
				AoDaiTraditionalFactory tra = new AoDaiTraditionalFactory();
				iAoDai = tra.getAoDai();
				iAoDai.sew();
			}
			else if (choose == 2){
				AoDaiStylizedFactory sty =new AoDaiStylizedFactory();
				iAoDai = sty.getAoDai();
				iAoDai.sew();
			}else{
				CheongsamFactory che = new CheongsamFactory();
				iAoDai = che.getAoDai();
				iAoDai.sew();
			}			
		} catch (NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}


}