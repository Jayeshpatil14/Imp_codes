package queue;

public class LinearQueue {
	int[] arr;
	int front, rear, size;

	public LinearQueue() {
		arr = new int[10];
		front = 0;
		rear = 0;
		size = 10;
	}

	public LinearQueue(int n) {
		arr = new int[n];
		front = 0;
		rear = 0;
		size = n;
	}

	public boolean isEmpty() {
		if (front == rear) {
			// System.out.println("queue is empty");
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == size) {
			System.out.println("queue is full");
			return true;
		}
		return false;
	}

	public boolean enqueue(int n) {
		if (isFull()) {
			// System.out.println("queue is full");
			return false;
		} else {
			arr[rear] = n;
			rear++;
			return true;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		} else {
			int n = arr[front]; // copy the first element to return front=0
			// shift elements one location to the left
			for (int i = 0; i < rear - 1; i++) {
				arr[i] = arr[i + 1];
			}
			if (rear < size) {
				arr[rear] = 0;
			}
			rear--;
			return n;
		}

	}

	public static void main(String[] args) {
		LinearQueue ob = new LinearQueue(3);
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
		ob.enqueue(20); // queue is full
		System.out.println("The value is :" + ob.dequeue());
		System.out.println("The value is :" + ob.dequeue());
		System.out.println("The value is :" + ob.dequeue());
		System.out.println("The value is :" + ob.dequeue()); // queue is empty
	}
}
