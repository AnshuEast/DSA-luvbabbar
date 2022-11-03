package LINKED_LIST;

public class doubly_linkedlist {

	private node head;
	private node tail;

	private class node {
		private int val;
		private node next;
		private node prev;

		public node(int val) {
			this.val = val;
		}
	}

	public void Addatfirst(int val) {
		node add1 = new node(val);
		add1.next = head;
		add1.prev = null;
		if (head != null) {
			head.prev = add1;
		}
		head = add1;
	}

	public void addatlast(int val) {
		node newnode = new node(val);
		node temp = head;
		if (head == null) {
			head.prev = null;
			head = newnode;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		newnode.prev = temp;
	}

	public void addatparticularafter(int val, int n) {
		node add = new node(val);
		node prevnode = get(n);
		if (prevnode == null) {
			System.out.println("does not exist");
			return;
		}
		add.next = prevnode.next;
		prevnode.next = add;
		add.prev = prevnode;
		if (prevnode.next != null) {
			prevnode.next.prev = add;
		} 
	}

	public node get(int index) {
		node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			tail = temp;
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reversal() {
		node last = tail;
		while (last != null) {
			System.out.print(last.val + "->");
			last = last.prev;
		}
		System.out.println("END");
	}
}
