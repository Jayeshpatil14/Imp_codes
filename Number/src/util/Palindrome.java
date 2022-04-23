package util;

import java.util.Scanner;
/*
 * Definition of palindrome
 * : a word, verse, or sentence (such as "Able was I ere I saw Elba") 
 * or a number (such as 1881) that reads the same backward or forward.
 */

public class Palindrome {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int t = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}

		if (t == rev)
			System.out.println(t + " is Palindrome");
		else
			System.out.println(t + " is not a palindrome");
	}

	public static void main2(String[] args) {
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder(str).reverse();
		String rstr = sb.toString();

		int rnum = Integer.parseInt(rstr);
		System.out.println("Reversed number is : " + rnum);

		if (str.equals(rstr))
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}

	public static void main1(String[] args) {
		System.out.print("Enter String : ");
		String str = sc.nextLine();

		// str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str).reverse();
		String rstr = sb.toString();
		System.out.println("Reversed string is : " + rstr);

		if (str.equals(rstr))
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}
}
