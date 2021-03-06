package util;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {

	public static void charWithFrequency(String str) {
		/*
		int [] freq = new int[str.length()];
		
		//accumulate frequency of each character in str
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(freq[str.charAt(i)-'a'] != 0) {
				System.out.println(str.charAt(i));
				System.out.println("--"+freq[str.charAt(i)-'a']+"  ");
				freq[str.charAt(i)-'a']=0;
			}
		}
		*/
		Map<Character, Integer> d = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(d.containsKey(str.charAt(i))) {
				d.put(str.charAt(i), d.get(str.charAt(i))+1);
			}
			else {
				d.put(str.charAt(i),1);
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(d.get(str.charAt(i)) != 0)
            {
                System.out.print(str.charAt(i));
                System.out.print(d.get(str.charAt(i)) + " ");
                d.put(str.charAt(i), 0);
            }  
		}
	}
	
	public static int noOfChar(String str) {
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		String str = "aabbccd";
		System.out.println("No of char in string are : "+noOfChar(str));
		charWithFrequency(str);
	}

}
