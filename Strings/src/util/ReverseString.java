package util;

import java.util.Scanner;
/*
public class ReverseString {

	static Scanner sc = new Scanner(System.in);
	
	public static String reverseString(String str) {
		String rstr = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			rstr=c+rstr;
		}
		return rstr;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		
		//String rstr = reverseString(str);
	
		//Stringbuider and Stringbuffer class both have reverse() method
		StringBuilder rstr = new StringBuilder(str);
		//rstr.append(str);
		rstr.reverse();
		System.out.println(rstr);
	}
}
*/

import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str="";
        char ch;
        for(int i=A.length()-1;i>0;i--){
            ch=A.charAt(i);
            str=ch+str;
        }
        
        if(A==str)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



