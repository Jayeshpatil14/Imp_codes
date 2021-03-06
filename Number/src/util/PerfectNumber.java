package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Perfect number :  a positive integer that is equal to the sum of its	
proper	divisors. The smallest perfect number is 6,	which is the sum of	1,2 and	3.
*/
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number : ");
		int num = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
				list.add(i);
			}
		}
		if (sum == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");

		System.out.print("Factors of " + num + " are : ");
		System.out.println(list);
	}

}
