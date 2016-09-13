package Ex3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Author: Pham Thi Kim Hien
 * Date: 09/09/2016
 * Version: 1.0
 */
public class MainLamda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.forEach(n -> System.out.println(n));
	}
}
