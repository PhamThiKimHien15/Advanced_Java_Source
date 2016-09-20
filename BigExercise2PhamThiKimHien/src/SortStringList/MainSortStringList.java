package SortStringList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 	Author: Pham Thi Kim Hien
 *	Date: 19/09/2016
 *	Version: 1.0
 *  Description: this class is used to sort a string list by lambda expressions
 */
public class MainSortStringList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Nguyen Van A", "Tran Nghia", "Le Phuong Thanh", "Lan Phuong", "Huynh Tan Hoa", "Tran Ngoc Dan");
		
		// show String list
		System.out.println("-----------------String List----------------");
		list.forEach(s -> System.out.println(s));
		
		// the list is sorted from the shortest String to the longest string
		System.out.println("------The list is sorted from the shortest String to the longest string---------");
		Collections.sort(list, (String s1, String s2) -> s1.length() - s2.length());
		list.forEach(s -> System.out.println(s));
		
		// the list is sorted from the longest String to the shortest string
		System.out.println("------The list is sorted from the longest String to the shortest string---------");
		Collections.sort(list, (String s1, String s2) -> s2.length() - s1.length());
		list.forEach(s -> System.out.println(s));
		
		// the list is sorted by Alphabet
		System.out.println("------The list is sorted by Alphabet---------");
		Collections.sort(list, (String s1, String s2) -> s1.compareTo(s2));
		list.forEach( e -> System.out.println(e));		
	}
}
