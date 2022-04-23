package util;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptPrint {

	static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter array elemet : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(" ");

	}

	public static void printRecord(int[] arr) {
		/*
		 * for(int element : arr) { System.out.println(element); }
		 */
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		acceptRecord(arr);
		printRecord(arr);
	}
}
