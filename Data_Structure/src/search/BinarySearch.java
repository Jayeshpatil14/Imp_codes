package search;

/*
	This algorithm follows divide-and-conquer approach.
	To apply binary search on an array prerequisite is that array elements must be in a sorted manner.
	In this algorithm, in first iteration, by means of calculating mid position big size array gets divided into 
two subarray?s, left subarray and right subarray, key element gets compared with element which is at mid 
position, if key is found at mid position in very first iteration in only 1 no. of comparison, then it is considered 
as a best case and in this case an algorithm takes O(1) time.
	If key is not found in the first iteration then either it will get searched into left subarray or into the right 
subarray by applying same logic repeatedly till either key is not found or till max the size of any subarray is valid 
i.e. size of subarray is greater or equal to 1.
 */
public class BinarySearch {

	private static void binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		while (left <= right) {
			if (key == arr[mid]) {
				System.out.println(key + " is found at index " + mid);
				break;
			} else if (key > arr[mid])// right sub-array
				left = mid + 1;
			else // left sub-array
				right = mid - 1;
			mid = (left + right) / 2;
		}
	}

	public static void main(String[] args) {
		// array must be in sorted order
		int[] arr = new int[] { 11, 22, 33, 44, 55 };
		int key = 44;
		binarySearch(arr, key);
	}
}
