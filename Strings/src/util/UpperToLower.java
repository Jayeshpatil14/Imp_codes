package util;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			}
			if (ch[i] >= 97 && ch[i] <= 122) {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		str = new String(ch);
		System.out.println("converted string : " + str);
	}
}
