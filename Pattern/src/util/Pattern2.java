package util;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int no_rows, row, col;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		no_rows = sc.nextInt();

		for(row=no_rows;row>=1;row--) {
			for(col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
