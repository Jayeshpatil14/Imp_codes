package util;

import java.util.Arrays;

public class FindMaxAndMinNumber {

	public static void main1(String[] args) {
		int[] arr = new int[] { 10, 55, 70, 40, 20 };

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Maximun element : " + max);
		System.out.println("Minimum element : " + min);

	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 55, 70, 40, 20 };

		Arrays.sort(arr);
		System.out.println("Maximun element : " + arr[arr.length-1]);
		System.out.println("Minimum element : " + arr[0]);

	}
}
