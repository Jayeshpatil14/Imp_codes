package util;

public class OccurenceOfMaximum {

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int countOccurence(int[] arr) {
		int cnt = 0;
		int max=findMax(arr);
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 55, 70, 70, 70, 40, 20 };
		
		System.out.println("Occurence of max element is : "+countOccurence(arr));
	}

}
