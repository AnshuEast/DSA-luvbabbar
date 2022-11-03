package LINKED_LIST;

public class LL {
	private Node head;
	private Node tail;
	protected int size;

	public LL() {
		this.size = 0;// Initially the size of the linked list will be zero
	}

	private class Node {
		private int val;
		private Node next;

		private Node(int val) {
			this.val = val;
		}

		private Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public void insertATfirst(int val) {
		Node newnode = new Node(val);
		newnode.next = head;
		head = newnode;

		if (tail == null) {
			tail = head; // it means the linked list is empty;
		}
		size += 1;
	}

	public void insertATlast(int val) {
		if (tail == null) {
			insertATfirst(val);
			return;
		}
		Node newnode1 = new Node(val);
		tail.next = newnode1;
		tail = newnode1;
		size++;
	}

	public void insertATanywhere(int val, int index) {
		if (index == 0) {
			insertATfirst(val);
			return;

		}
		if (index == size) {
			insertATlast(val);
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node newnode2 = new Node(val, temp.next);
		temp.next = newnode2;
		size++;
	}

	// add at any index using recursion
	public void rec(int val, int index) {
		head= insert_rec(val, index, head);
		return;
	}

	private Node insert_rec(int val, int index, Node curr_node) {
		if (index == 0) {
			Node node1 = new Node(val, curr_node);
			size++;
			return node1;
		}
		curr_node.next = insert_rec(val,index-1,curr_node.next);
		return curr_node;
	}

	public int deletefirst() {
		int val = head.val;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		this.size--;
		return val;
	}

	public int deletelast() {
		Node secondlast = get(this.size - 2);
		int val = tail.val;
		tail = secondlast;
		tail.next = null;
		size--;
		return val;
	}

	public int deleteATindex(int index) {
		Node last = get(index - 1);
		last.next = last.next.next;
		this.size--;
		return last.next.val;
	}

	public Node get(int index) {
		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("End");
		System.out.println();
	}
}
