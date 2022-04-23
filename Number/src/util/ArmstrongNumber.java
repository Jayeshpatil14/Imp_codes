package util;

import java.util.Scanner;

/*
An armstrong number is a number such that sum of the power of its digits is
equal to number itself.
 */
public class ArmstrongNumber {

	private static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	public static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	private static boolean isArmstrong(int x) {
		int nd = countDigit(x);
		int t = x;
		int sum = 0;
		while (t > 0) {
			int r = t % 10;
			sum = sum + pow(r, nd);
			t = t / 10;
		}
		if (sum == x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		boolean r = isArmstrong(num);
		if (r)
			System.out.println(num + " is armstrong number");
		else
			System.out.println(num + " is not an armstrong number");
	}
}
