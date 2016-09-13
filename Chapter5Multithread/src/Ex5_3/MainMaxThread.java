package Ex5_3;

import java.util.Random;
import java.util.Scanner;
/*
 * Author: Pham Thi Kim Hien
 * Date: 13/9/2016
 * Version: 1.0
 */
public class MainMaxThread {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			arr[i]= random.nextInt(100);
		}
		
		System.out.println("Input num of Threads: ");
		int numThreads = input.nextInt();
		int max = max(arr, numThreads);
		
		String strArr ="";
		for (int i : arr) {
			strArr += i + " ";
		}
		System.out.println("Array: " + strArr);
		System.out.println("Max: " + max);
	}

	private static int max(int[] arr, int numThreads) throws InterruptedException {
		int len = arr.length;
		int max = -1;
		
		//create and start numThreads
		MaxThread[] st = new MaxThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			st[i] = new MaxThread((i*len)/numThreads,((i+1)*len/numThreads), arr);
			st[i].start();		
		}
		
		// wait for the threads to finish and sum  their results
		for (int i = 0; i < numThreads; i++) {
			st[i].join();
			if(st[i].getMax() > max)
				max = st[i].getMax();
		}		
		return max;
	}
	
}
