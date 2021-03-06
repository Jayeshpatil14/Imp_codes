package LinkedList;

public class SinglyLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}// end of node class

	public SinglyLinkedList() {
		head = null;
	}

	public void addNodeAtEnd(int data) {
		// create new node
		Node newNode = new Node(data);
		if (head == null)// list is empty so add at 1st pos
			head = newNode;
		// list is not empty
		else {
			Node temp = head;
			while (temp.next != null) {// place temp at last node
				temp = temp.next;
			}
			// add after last node
			temp.next = newNode;
		}
	}

	public void addByPosition(int val, int pos) {
		// create new node
		Node newNode = new Node(val);
		if (head == null)// list is empty
			System.out.println("list is empty");
		else {
			Node prev = head;
			if (pos == 1) {// add at 1st position
				newNode.next = head;
				head = newNode;
			} else {// in between and add at end
				for (int i = 1; prev != null && i <= pos - 2; i++) {
					prev = prev.next;
				}
				if (prev != null) {
					newNode.next = prev.next;
					prev.next = newNode;
				} else {// wrong position
					System.out.println("position is wrong");
				}
			}
		}
	}

	public void deleteByKey(int key) {
		if (head == null) {// list empty
			System.out.println("List is empty");
		} else {
			Node temp = head;
			Node prev = null;
			while (temp != null && temp.data != key) {
				prev = temp;
				temp = temp.next;
			}
			if (head == temp) {// delete first node
				head = temp.next;
				temp.next = null;
			} else {// in between or delete from end
				if (temp != null) {
					prev.next = temp.next;
					temp.next = null;
				} else {
					System.out.println("key not found");
				}
			}
		}
	}

	public void displayList() {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node temp = head;
			System.out.println("list is : ");
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addNodeAtEnd(10);
		slist.addNodeAtEnd(20);
		slist.addNodeAtEnd(30);
		slist.addByPosition(32, 4);
		slist.displayList();
		slist.deleteByKey(30);
		slist.displayList();
	}
}
