package List;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Deque<Character> stk = new ArrayDeque<Character>();
		//Stack<Character> stk = new Stack<Character>();
		String str = "aabbccd";
		for (int i = 0; i < str.length(); i++) {
			stk.push(str.charAt(i));
		}
		//Character[] arr = new Character[str.length()];
		int acnt = 0, bcnt = 0, ccnt = 0, dcnt = 0;
		while (!(stk.isEmpty())) {
			if (stk.pop() == 'a') {
				acnt++;
			} else if (stk.pop() == 'b') {
				bcnt++;
			} else if (stk.pop() == 'c') {
				ccnt++;
			} else {
				dcnt++;
			}
		}
		System.out.println("A : " + acnt);
		System.out.println("B : " + bcnt);
		System.out.println("C : " + ccnt);
		System.out.println("D : " + dcnt);
	}
}
