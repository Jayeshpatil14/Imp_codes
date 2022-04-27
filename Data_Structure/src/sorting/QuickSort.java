package sorting;

import java.util.Arrays;

public class QuickSort {

	/*
	 * function that consider last element as pivot, place the pivot at its exact
	 * position, and place smaller elements to left of pivot and greater elements to
	 * right of pivot.
	 */
	public static int partition(int[] a, int first, int last) {
		int temp, pivot = first;
		int i = first;
		int j = last;
		while (i < j) {
			// keep all smaller elements on left side
			if (i < last && a[i] < a[pivot]) {
				i++;
			}
			// keep all larger elements on right side
			if (j > i && a[j] > a[pivot]) {
				j--;
			}
			// swap i with j
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		// swap pivot with j
		temp = a[pivot];
		a[pivot] = a[j];
		a[j] = temp;
		System.out.println("Pivot is placed : " + a[i]);
		System.out.println(Arrays.toString(a));
		return j;
	}

	public static void quickSorting(int[] arr, int start, int end) {
		if (start < end) {
			int p = partition(arr, start, end);// p is partitioning index
			quickSorting(arr, start, p - 1);
			quickSorting(arr, p + 1, end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 100, 30, 20, 50 };
		System.out.println("Before sorting : " + Arrays.toString(arr));
		quickSorting(arr, 0, arr.length - 1);
		System.out.println("After sorting : " + Arrays.toString(arr));

	}
}
