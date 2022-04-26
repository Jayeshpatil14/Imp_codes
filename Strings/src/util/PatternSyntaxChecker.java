package util;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of testcases to check : ");
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			System.out.println("Enter pattern to check : ");
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
