package util;

import java.util.Arrays;
import java.util.Scanner;

//anagram is a word or phrase formed by rearranging the letters of a different word or phrase
public class Anagram {

	public static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		a = Arrays.toString(arr1);
		b = Arrays.toString(arr2);

		if (a.equals(b))
			return true;
		return false;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first string : ");
			String a = sc.next();
			System.out.print("Enter second string : ");
			String b = sc.next();
			boolean ret = isAnagram(a, b);
			System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		}
	}

}
