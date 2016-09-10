package Ex1_31;


/**
 * @author Pham Thi Kim Hien
 * @version 1.0
 * @created 01-Sep-2016 3:12:38 PM
 */
public class AoDaiTraditionalFactory extends AoDaiFactory {

	public IAoDai getAoDai(){
		return new AoDaiTraditional();
	}

}