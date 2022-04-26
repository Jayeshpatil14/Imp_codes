package util;

public class CommonElementsInArrays {

	public static void printCommonElements(int[] arr1, int[] arr2) {
		System.out.print("Common elements : ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j] ) {
					System.out.print(arr1[i] + "  ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 55, 70, 40, 20 };
		int[] arr2 = new int[] { 10, 30, 43, 65, 70, 20, 50 };
		printCommonElements(arr1, arr2);
	}
}
