package util;

import java.util.Scanner;

public class FibonacciSeries {
	static Scanner sc = new Scanner(System.in);

	public static int fibonacci(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		System.out.print("Enter range : ");
		int num = sc.nextInt();

		//System.out.println("sum of all numbers is " + fibonacci(num));

		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i <= num; i++) {
			c = a + b;
			if (c <= num) {
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}

	}

}
