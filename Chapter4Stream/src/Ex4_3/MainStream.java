package Ex4_3;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Author: Pham Thi Kim Hien
 * Date: 12/09/2016
 * Version: 1.0
 */
public class MainStream {
	public static void main(String[] args) {
		List<Student> list= Arrays.asList(new Student("Le Phuong Thanh", 28, 7d, 8d),
				new Student("Le Nghia", 20, 8d, 10d),
				new Student("Nha Phuong", 25, 10d, 8d),
				new Student("Tran Thanh", 28, 8.5d, 9.5d));
		// show information of Student
		list.forEach(i -> System.out.println(i.toString()));
		
		// count number student have age >= 18
		
		int count = (int) list.stream().filter((Student a) -> 18 <= a.age).count();
		System.out.println("Number student have age >= 18: " + count);
		
		// Count student have FirstName start 'H'
		long countFirsNameH = list.stream()
				.filter(e -> e.getName().startsWith("H")).count();
		System.out.println("Numder of Student have FistName start 'H': "
				+ countFirsNameH);

		// Create list contain name start 'H'
		List<Student> nameStartH = list.stream()
				.filter(e -> e.getName().startsWith("H"))
				.collect(Collectors.toList());
		nameStartH.forEach(System.out::print);
		
		//Get Highest average, Lowest average for numbers of list 2
		DoubleSummaryStatistics statisticsStudent = list.stream()
				.mapToDouble((e) -> e.calAverage()).summaryStatistics();
		System.out.println("Highest Avg Mark in List: "
				+ statisticsStudent.getMax());
		System.out.println("Lowest Avg Mark in List: "
				+ statisticsStudent.getMin());
		
		System.out.println("Sum of all Ag Mark: " + statisticsStudent.getSum());
		System.out.println("Average of all Avg Marks: "
				+ statisticsStudent.getAverage());
		System.out.println("List of Very Good Students");
		
		// create list contain average >= 8
		List<Student> listGoodStudent = list.stream()
				.filter(e -> e.calAverage() >= 8).collect(Collectors.toList());
		listGoodStudent.forEach(System.out::print);
	}
}
