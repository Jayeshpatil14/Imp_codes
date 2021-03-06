package LinkedList;

public class DoublyLinkedList {

	Node head;
	
	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int d) {
			data = d;
			next = null;
			prev = null;
		}
	}// end of node class

	public DoublyLinkedList() {
		head=null; ///intitialize the liked list
	}

	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) { // place the temp at the last node
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}

	}

	public void addNodeByKeyAfter(int val, int key) {
		Node newNode = new Node(val);
		if (head == null) { // list is empty
			System.out.println("the list is empty");
		}
		Node temp = head;
		while (temp != null && temp.data != key) { /// place the temp at the key position
			temp = temp.next;
		}
		if (temp != null) { /// if key is found
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			if (newNode.next != null)
				newNode.next.prev = newNode;
		} else {
			System.out.println("key not found" + key);
		}
	}

	public void addNodeByKeyBefore(int val, int key) {
		Node newNode = new Node(val);
		if (head == null) { // list is empty
			System.out.println("the list is empty");
		}
		Node temp = head;
		while (temp != null && temp.data != key) { /// place the temp at the key position
			temp = temp.next;
		}
		if (temp == head) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {
			if (temp != null) { // if key found
				newNode.next = temp;
				newNode.prev = temp.prev;
				temp.prev.next = newNode;
				temp.prev = newNode;
			} else {
				System.out.println("key not found" + key);
			}
		}
	}

	public void deleteByposition(int pos) {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node temp = head;
			if (pos == 1) {
				head = temp.next;
				temp.next.prev = null;
				temp.next = null;
			} else {
				for (int i = 1; temp != null && i <= pos - 1; i++) { /// place temp at the node which you want to delete
					temp = temp.next;
				}
				if (temp != null) {
					System.out.println(temp.data);
					temp.prev.next = temp.next;
					if (temp.next != null) { // node is not the last node
						temp.next.prev = temp.prev;
					}
					temp.next = null;
					temp.prev = null;
				} else {
					System.out.println("position is wrong");
				}
			}
		}
	}
	/// insert by position
	public void displayList() {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node temp = head;
			System.out.println("The list is: ");
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNodeAtEnd(12);
		dlist.addNodeAtEnd(13);
		dlist.addNodeAtEnd(15);
		dlist.addNodeAtEnd(16);
		dlist.displayList();
		dlist.addNodeByKeyBefore(100, 13);
		dlist.displayList();
		dlist.addNodeByKeyBefore(200, 12);
		dlist.displayList();
		dlist.addNodeByKeyBefore(50, 300);
		dlist.addNodeByKeyAfter(50, 13);
		dlist.displayList();
		dlist.addNodeByKeyAfter(60, 16);
		dlist.displayList();
		dlist.addNodeByKeyAfter(50, 300);
		dlist.displayList();
		dlist.deleteByposition(1); /// delete 200
		dlist.displayList();
		dlist.deleteByposition(4); // delete 50
		dlist.displayList();
		dlist.deleteByposition(10);
		dlist.displayList();
	}
}
