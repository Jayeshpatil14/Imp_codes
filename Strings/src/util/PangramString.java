package util;

public class PangramString {
	private static void containAllLetters(String s) {
		s = s.toLowerCase();
		boolean allLetterPresent = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!(s.contains(String.valueOf(ch)))) {
				allLetterPresent = false;
				break;
			}
		}
		if (allLetterPresent)
			System.out.println("String is panagram string");
		else
			System.out.println("String is not a panagram string");
	}

	public static void main(String[] args) {
		String string = "Abcdefghijklmnopqrstuvwxyz12";
		containAllLetters(string);
	}
}
