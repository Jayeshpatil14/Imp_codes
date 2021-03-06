package search;

import java.util.Arrays;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 29, 49, 58, 35, 67 };
		int key = 35;
		System.out.println("Array elements are : " + Arrays.toString(arr));

		int pos = linearSearch(arr, key);
		if (pos == -1)
			System.out.println(key + " not found");
		else
			System.out.println(key + " found at " + pos + " position");

	}

}
