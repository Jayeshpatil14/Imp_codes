package util;

public class INITCapOfWordInString {
	public static String capitaliseWord(String str) {
		String[] words = str.split("\\s");
		String capword = "";
		for (String w : words) {
			if (!(w.equals("for") || w.equals("of") || w.equals("to"))) {
				String first = w.substring(0, 1);
				//String remfirst = w.substring(1);
				capword += first.toUpperCase() + /* remfirst + */"";
			}
		}
		return capword;
	}

	public static void main(String[] args) {
		String str = "I am sonoo for to of jaiswal";
		System.out.println(capitaliseWord(str));
	}
}
