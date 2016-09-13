package Ex3_2;

import java.util.Arrays;
import java.util.List;
/*
 * Author: Pham Thi Kim Hien
 * Date: 09/09/2016
 * Version: 1.0
 */
public class MainAmount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{1, 2, 4, 6,});
		int price = 5200;
		list.forEach(n -> System.out.println("Amount = " + price*n));
	}
}
