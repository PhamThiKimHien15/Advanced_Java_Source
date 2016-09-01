package Ex1_31;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 3:12:40 PM
 */
public class CheongsamFactory extends AoDaiFactory {

	public IAoDai getAoDai(){
		return new Cheongsam();
	}

}