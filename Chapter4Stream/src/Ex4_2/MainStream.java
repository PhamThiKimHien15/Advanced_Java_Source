package Ex4_2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
/*
 * Author: Pham Thi Kim Hien
 * Date: 12/09/2016
 * Version: 1.0
 */
public class MainStream {
	public static void main(String[] args) {
		Random random = new Random();
		// create list 1 by random
		List<Integer> list = new ArrayList<Integer>();
		random.ints(0, 10).limit(15).forEach(i -> list.add(i));
		System.out.println("-------------List 1-------------");
		System.out.print("List 1: ");
		list.forEach(i -> System.out.print(i + " "));
		
		// create list 2 from list 1
		System.out.println("\n-------------List 2-------------");
		List<Integer> list2 = list.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.print("List 2: " );
		list2.forEach(i -> System.out.print(i + " "));
		
		//Get min, max, sum, and average for numbers of list 2
		IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x).summaryStatistics(); 
		System.out.println("\nHighest list2 number in List : " + stats.getMax()); 
		System.out.println("Lowest list2 number in List : " + stats.getMin()); 
		System.out.println("Sum of all list2 numbers : " + stats.getSum()); 
		System.out.println("Average of all list2 numbers : " + String.format("%.2f", stats.getAverage()));
		
		// create list 3 from list which the elements is prime number
		System.out.println("\n-------------List 3-------------");
		List<Integer> list3 = list.stream().filter(i -> checkPrimes(i) == 1).collect(Collectors.toList());
		System.out.print("List 3: " );
		list3.forEach(i -> System.out.print(i + " "));
		
		// create list 4 from list 2 which the elements is square number
		System.out.println("\n-------------List 4-------------");
		List<Integer> list4 = list2.stream().filter(i -> checkSquare(i) == 1).collect(Collectors.toList());
		System.out.print("List 3: " );
		list4.forEach(i -> System.out.print(i + " "));
		
	}
	// check square number of list 2 before adding to the list 4
	private static int checkSquare(int i) {
		if (Math.pow(Math.sqrt(i), 2) == i)
			return 1;
		return 0;
	}
	// check primes number of list  before adding to the list 3
	public static int checkPrimes(int i) {
		int result = -1;
		int count = 0;
		for (int j = 1; j <= Math.sqrt(i); j++) {
			if (i == 1)
				return result;
			else if (i % j == 0)
				count++;
		}
		if (count == 1)
			return 1;
		return result;
	}
}
