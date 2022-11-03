package LINKED_LIST;

public class circular_linkedlist {
	private Node head;
	private Node tail;

	public circular_linkedlist() {
		this.head = null;
		this.tail = null;
	}

	private class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public void addatlast(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	public void deletion(int l)
	{
		if(head.val == l)
		{
			head = head.next;
			tail.next = head;
		}
		Node temp = head;
		Node nextnode =  head.next;
		while(nextnode!=head)
		{
			if(nextnode.val==l)
			{
				temp.next = nextnode.next;
				break;
			}
			temp=temp.next;
			nextnode = nextnode.next;
		}
	}

	public void display() {
		Node node = head;
		if (head != null) {
			do {
				System.out.print(node.val + "->");
				node = node.next;
			} while (node != head);
		}
		System.out.println("END");
	}
}
