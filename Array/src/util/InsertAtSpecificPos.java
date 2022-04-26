package util;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtSpecificPos {

	public static void deleteAtSpecificPosition(int[] arr, int pos, int element) {
		int size = arr.length - 1;
		int[] narr = new int[size];
		System.out.println("Before delete : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (i < pos - 1) {
				narr[i] = arr[i];
			} else if (i == pos - 1) {
				continue;
			} else {
				narr[i - 1] = arr[i];
			}
		}
		System.out.println("After delete : " + Arrays.toString(narr));
	}

	public static void insertAtSpecificPosition(int[] arr, int pos, int element) {
		int size = arr.length + 1;
		int[] narr = new int[size];
		System.out.println("Before insert : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length + 1; i++) {
			if (i < pos - 1) {
				narr[i] = arr[i];
			} else if (i == pos - 1) {
				narr[i] = element;
			} else {
				narr[i] = arr[i - 1];
			}
		}
		System.out.println("After insert : " + Arrays.toString(narr));
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pos at which to insert : ");
		int pos1 = sc.nextInt();
		System.out.print("Enter element to insert : ");
		int element1 = sc.nextInt();
		insertAtSpecificPosition(arr, pos1, element1);
		System.out.print("Enter pos at which delete : ");
		int pos = sc.nextInt();
		System.out.print("Enter element to delete : ");
		int element = sc.nextInt();
		deleteAtSpecificPosition(arr, pos, element);
	}

}
