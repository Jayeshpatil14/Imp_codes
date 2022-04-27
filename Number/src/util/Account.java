package util;

import java.util.regex.*;

public class Account {

	public static void main(String[] args) {

		//String pattern = "^[cC]...[0-9]";
		if(Pattern.matches("^[cC][a-zA-Z0-9]{1,}\\d$", "ctdfg54645r86")) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}
}
