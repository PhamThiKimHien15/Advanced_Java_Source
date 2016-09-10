package Ex1_31;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 3:12:39 PM
 */
public class AoDaiStylizedFactory extends AoDaiFactory {

	public IAoDai getAoDai(){
		return new AoDaiStylized();
	}

}