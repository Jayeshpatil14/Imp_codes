package util;

import java.util.Arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 5, 4, 3, 8, 8 };
		System.out.println("Array elements are : " + Arrays.toString(arr));
		System.out.print("Duplicate elements in given array : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + "  ");
				}
			}
		}
	}
}
