package util;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	static Scanner sc = new Scanner(System.in);
	/*
	static void reverse(int a[], int n) {
		
		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		// printing the reversed array
		System.out.println("Reversed array is: \n");
		for (int k = 0; k < n; k++) {
			System.out.println(a[k]);
		}
	}
	*/

	private static void accepRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter array elements : ");
			arr[i] = sc.nextInt();
		}
	}

	private static void reverseArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		accepRecord(arr);
		reverseArray(arr);
		// System.out.println(Arrays.toString(reverseArray(arr)));
	}
}
