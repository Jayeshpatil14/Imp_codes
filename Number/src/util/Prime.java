package util;

import java.util.Scanner;

public class Prime {

	private static boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private static int sumOfPrimeNum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int num = sc.nextInt();

		boolean flag = isPrime(num);
		if (flag)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");

		System.out.print("Sum of prime numbers is : " + sumOfPrimeNum(num));
	}
}
