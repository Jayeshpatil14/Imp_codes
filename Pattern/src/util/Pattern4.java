package util;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no_rows, row, col;
		System.out.print("Enter Number of Rows : ");
		no_rows = sc.nextInt();

		for (row = 1; row <= no_rows; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (row = no_rows - 1; row >= 1; row--) {
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
