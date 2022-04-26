package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokeniser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Line :");
		String s = sc.nextLine();
		// Write your code here.
		String delim = " ,'? !";
	
		StringTokenizer stk = new StringTokenizer(s, delim);

		int count = stk.countTokens();
		System.out.println(count);

		String token = null;
		while (stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
		}
		sc.close();
	}
}
