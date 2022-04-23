package util;

import java.util.Scanner;

public class ReverseNumber {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		int rnum = 0;
		while (num != 0) {
			int rem = num % 10;
			rnum = rnum * 10 + rem;
			num = num / 10;
		}
		
		System.out.print("reverse number : " + rnum);
	}

}
