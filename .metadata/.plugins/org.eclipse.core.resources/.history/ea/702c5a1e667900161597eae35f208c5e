package Ex5_2;

import java.util.Random;
import java.util.Scanner;

/*
 * Author: Pham Thi Kim Hien
 * Date: 13/9/2016
 * Version: 1.0
 */
public class MainSumThread {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i]= random.nextInt(10);
		}
		
		System.out.println("Input num of Threads: ");
		int numThreads = input.nextInt();
		int sum = sum(arr, numThreads);
		
		String strArr ="";
		for (int i : arr) {
			strArr += i + " ";
		}
		System.out.println("Array: " + strArr);
		System.out.println("Sum: " + sum);
	}

	private static int sum(int[] arr, int numThreads) throws InterruptedException {
		int len = arr.length;
		int sum = 0;
		
		//create and start numThreads
		SumThread[] st = new SumThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			st[i] = new SumThread((i*len)/numThreads,((i+1)*len/numThreads), arr);
			st[i].start();		
		}
		
		// wait for the threads to finish and sum  their results
		for (int i = 0; i < numThreads; i++) {
			st[i].join();
			System.out.println(i);
			sum += st[i].getSum();
		}		
		return sum;
	}	
}
