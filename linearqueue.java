package stacks;

//this is the implementation of linear queue.
public class linearqueue {
	protected int data[];
	protected int front = 0; // it keeps the track of the position of the element
	public int size = 0; // it is pointer track of the element

	public linearqueue() {
		this.data = new int[5];
	}

	public linearqueue(int cap) {
		this.data = new int[cap];
	}

	public boolean isfull() {
		return this.size == this.data.length;
	}

	public boolean isempty() {
		return this.size == 0;
	}

//	public void enqueue(int item) throws Exception {
//		if (isfull()) {
//			throw new Exception("error");
//
//		}
//		this.data[size] = item;
//		this.size++;
//	}

	// circular queue implementation
	public void enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("error");

		}
		int  i = (this.size+this.front)%this.data.length;
		this.data[i] = item;
		this.size++;
	}
//	public int dequeue() throws Exception {
//		if (isempty()) {
//			throw new Exception("error");
//
//		}
//
//		int temp = this.data[this.front];
//		this.front++;
//		this.size--;
//		return temp;
//	}
	// circular queue implementation
	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("error");
		}
		int temp = this.data[this.front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return temp;
	}

	public int getfront() {
		return this.data[this.front];
	}

	public int size() {
		return this.size;
	}

//	public void display() {  
//		for (int i = this.front; i < this.data.length; i++) {
//			System.out.print(this.data[i] + " ");
//		}
//		System.out.println();
//	}

	// circular queue implementation
	public void display() {
		for (int i = 0; i < this.size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println();
	}

}
