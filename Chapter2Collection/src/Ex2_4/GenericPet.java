package Ex2_4;

import java.util.List;

/*
 * author: Pham Thi Kim Hien
 * Date : 7/9/2016
 * Version : 1.0
 * Class about information Cat
 */
public class GenericPet<T> {

	List<T> list;

	public GenericPet() {
		super();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
