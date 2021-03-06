package util;

public class SubArrayFromArray {
	// print all sub arrays between arr[0.....n-1]
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int subArr(int[] arr) {
		// pick starting point
		int count = 0;
		int min = findMin(arr);
		for (int i = 0; i < arr.length; i++) {
			// pick end point
			for (int j = i; j < arr.length; j++) {
				// print sub array between current starting and ending point
				System.out.print("[ ");
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					if (arr[k] == min) {
						count++;
					}
				}
				System.out.println(" ]");
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 55, 70, 70, 70, 40, 20 };
		// subArr(arr);
		System.out.println("count : " + subArr(arr));
	}
}
