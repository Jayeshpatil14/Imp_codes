package util;

public class FirstAndSecondBig {

	private static void printFirstAndSecondBig(int[] arr) {
		int fbig = arr[0];
		int sbig = arr[1];
		if (arr.length < 2)
			System.out.println("Inavlid array");
		for (int i = 1; i < arr.length; i++) {
			if (fbig < arr[i]) {
				sbig = fbig;
				fbig = arr[i];
			} else if (sbig < arr[i] && arr[i] != fbig) {
				sbig = arr[i];
			}
		}
		System.out.println("Fisrt big : " + fbig);
		System.out.println("Second big : " + sbig);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 55, 70, 70, 70, 40, 20 };
		printFirstAndSecondBig(arr);
	}

}
