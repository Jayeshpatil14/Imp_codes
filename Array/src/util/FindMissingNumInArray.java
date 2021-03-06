package util;

/*
 Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be 
 calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it
 from the sum of first n natural numbers, it will be the value of the missing element.
 */
public class FindMissingNumInArray {

	private static int missingNumber(int[] arr) {
		// size + 1 => 4 + 1=5
		// means original size is 5 but one element is missing so provides size is 4
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		int restSum = 0;
		for (int i = 0; i < arr.length; i++) {
			restSum = restSum + arr[i];
		}
		return sum - restSum;
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, 2, 3 };
		missingNumber(arr);
		System.out.println("Missing no of an array is : " + missingNumber(arr));// output:2

	}
}
