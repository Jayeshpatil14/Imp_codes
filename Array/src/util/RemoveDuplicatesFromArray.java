package util;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static int removeDuplicate(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1)
			return n;

		int j = 0;
		int[] temp = new int[n];
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];

		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5, 4, 6 };

		System.out.println("Array elements are : " + Arrays.toString(arr));

		int n = removeDuplicate(arr);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

}
