package check;

import java.util.LinkedList;

public class Check {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();

		for (int i = 10; i <= 100; i += 10) {
			l.add(i);
		}

		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println("poll : " + l.poll());
			System.out.println(i);
		}

		for (int i = 0; i < l.size(); i++) {
			System.out.println("poll : " + l.poll());
			System.out.println(i);
		}

		for (int i = 0; i < l.size(); i++) {
			System.out.println("poll : " + l.poll());
			System.out.println(i);
		}

		for (int i = 0; i < l.size(); i++) {
			System.out.println("poll : " + l.poll());
			System.out.println(i);
		}

		/*
		 * while(!l.isEmpty()) 
		 * { System.out.println("poll : "+l.poll()); }
		 */
		System.out.println(l.size());

	}

}
