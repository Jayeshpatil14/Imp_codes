package sorting;

import java.util.Arrays;

public class SelectionSort {

	private static void sortBySelectionSort(int[] arr) {
		for (int sel_pos = 0; sel_pos < arr.length - 1; sel_pos++) {
			for (int pos = sel_pos + 1; pos < arr.length; pos++) {
				if (arr[sel_pos] > arr[pos]) {
					int temp = arr[sel_pos];
					arr[sel_pos] = arr[pos];
					arr[pos] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5, 4, 6 };

		System.out.println("Array elements are : " + Arrays.toString(arr));

		sortBySelectionSort(arr);
		System.out.println("After sorting : ");
		System.out.println("Array elements are : " + Arrays.toString(arr));
	}

}
