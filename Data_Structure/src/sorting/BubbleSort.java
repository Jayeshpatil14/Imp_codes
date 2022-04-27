package sorting;

import java.util.Arrays;

public class BubbleSort {

	private static void sortByBubble(int[] arr) {
		for (int it = 0; it < arr.length; it++) {
			for (int pos = 0; pos < arr.length - it - 1; pos++) {
				if (arr[pos] > arr[pos + 1]) {
					int temp = arr[pos];
					arr[pos] = arr[pos + 1];
					arr[pos + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 10, 100, 30, 20, 50 };
		sortByBubble(arr);

	}

}
