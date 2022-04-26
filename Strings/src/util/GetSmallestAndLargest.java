package util;

import java.util.Scanner;

/*
 Complete the getSmallestAndLargest function in the editor below.

 getSmallestAndLargest has the following parameters:

 string s: a string
 int k: the length of the substrings to find
 Returns

 string: the string ' + "\n" + ' where and are the two substrings
*/
public class GetSmallestAndLargest {

	public static String getSmallestAndLargest(String s, int k) {

		String sequence = s.substring(0, k);
		String smallest = sequence;
		String largest = sequence;
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		for (int i = 1; i <= (s.length() - k); i++) {
			sequence = s.substring(i, (i + k));

			if (sequence.compareTo(smallest) < 0) {
				smallest = sequence;
			}
			if (sequence.compareTo(largest) > 0) {
				largest = sequence;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String s = scan.next();
		System.out.print("Enter size of sub strings : ");
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
