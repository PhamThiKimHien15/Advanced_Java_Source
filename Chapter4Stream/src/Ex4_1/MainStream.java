package Ex4_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Author: Pham Thi Kim Hien
 * Date: 12/09/2016
 * Version: 1.0
 */
public class MainStream {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("happy", "sad", "happy", "",
				"oil", "av", "sad", "oil", "happy", "interesting", "sad", "interesting", "abc");
		System.out.println("--------List 1------------");
		// Count the empty strings
		long count = (long) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Element null = " + count);
		
		// Count number of strings with length greater than or equal 5
		int countLenght = (int) strings.stream().filter(n -> n.length() >= 5).count();
		System.out.println("Count number element have length >= 5:  " + countLenght);
		
		// Count number of strings which startswith "a"
		count = strings.stream().filter(n -> n.startsWith("a")).count();		
		System.out.println("Count number element have value beginning with a: " + count);
		
		//Count number of strings which equal "happy"
		count = strings.stream().filter(n -> n.equalsIgnoreCase("happy")).count();		
		System.out.println("Count number element have value equal \"happy\": " + count);
		
		// create List 2 from List 1 have value # null
		List<String> list2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("--------List 2------------");
		System.out.println("List 2: " + list2);
		
		// create List 3 from List 1 have length >= 3 && <= 6
		String list3 = strings.stream().filter(n -> n.length() >= 3 && n.length() <= 6 ).collect(Collectors.joining(", "));
		System.out.println("--------List 3------------");
		System.out.println("List 3: " + list3);
		
		// create List 4 from List 1 have add value "happy" after each strings
		List<String> list4 = strings.stream().map(n -> n + " happy").collect(Collectors.toList());
		System.out.println("--------List 4------------");
		System.out.println("List 4: " + list4);
	}
}
