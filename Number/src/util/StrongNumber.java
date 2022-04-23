package util;

import java.util.Scanner;

/*
 Strong number : Are numbers whose sum of factorial of digits 
 				 is equal to the original number. 
 */
public class StrongNumber {

	static Scanner sc = new Scanner(System.in);

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int n = num;
		int sum=0;
		while(num != 0) {
			int r = num%10;
			sum = sum+factorial(r);
			num=num/10;
		}
		
		if (sum == n)
			System.out.println(n + " is Strong number");
		else
			System.out.println(n + " is not a strong number");
	}

}
