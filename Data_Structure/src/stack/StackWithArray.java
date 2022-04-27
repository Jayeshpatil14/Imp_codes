package stack;

import java.util.Scanner;

class MyStack {
	private int[] arr;
	private int top;
	private int size;

	public MyStack() {
		arr = new int[5];
		top = -1;
		size = 5;
	}

	public MyStack(int n) {
		arr = new int[n];
		top = -1;
		size = n;
	}

	public boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean push(int n) {
		if (isFull()) { // if(top==-1)
			System.out.println("Stack overflow");
			return false;
		} else {
			top++;
			arr[top] = n;
			return true;
		}
	}

	public int pop() {
		if (isEmpty()) { // if(top==-1)
			System.out.println("stack is Empty, underflow");
			return -1;
		} else {
			int n = arr[top];
			top--;
			return n;
		}
	}
}

public class StackWithArray {

	public static void main(String[] args) {
		MyStack stk = new MyStack(3);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.push element \n2. pop element\n3. check empty ");
			System.out.println("4. check full\n5. exit\n");
			System.out.println(" Enter choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter element");
				int num = sc.nextInt();
				boolean status = stk.push(num);
				if (status) {
					System.out.println("number added");
				} else {
					System.out.println("number not added");
				}
				break;
			case 2:
				num = stk.pop();
				if (num != -1) {
					System.out.println("number found" + num);
				} else {
					System.out.println("number not found");
				}
				break;
			case 3:
				if (stk.isEmpty()) {
					System.out.println("empty");
				} else {
					System.out.println("not empty");
				}
				break;
			case 4:
				if (stk.isFull()) {
					System.out.println("Full");
				} else {
					System.out.println("not Full");
				}
				break;
			case 5:
				System.out.println("thank you for using the program....");
			}
		} while (choice != 5);
	}
}
