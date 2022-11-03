package stacks;

// hence this enqueue efficient of queue using stack
public class queue_usingstack {
	public dynamicstack data;

	public queue_usingstack() {
		this.data = new dynamicstack();
	}

	public boolean isempty() {
		return this.data.isempty();
	}

	public int size() {
		return this.data.size();
	}

	// hence this enqueue efficient of queue using stack
//	public void enqueueEff(int x) throws Exception {
//		this.data.push(x);
//	}
//
//	public int dequeue() throws Exception {
//		dynamicstack temp = new dynamicstack();
//		while (this.data.size() != 1) {
//			temp.push(data.pop());
//		}
//		int x = this.data.pop();
//		while (temp.size() != 0) {
//			this.data.push(temp.pop());
//		}
//		return x;
//	}
//	...................................................................................................
//	public void disp()
//	{
//		this.data.display();
//	}
	// here we just implement the reverse of the stack.
	public void enqueueEff(int x) throws Exception {
		dynamicstack temp = new dynamicstack();
		while (!this.data.isempty()) {
			temp.push(this.data.pop());
		}
		this.data.push(x);
		while (!temp.isempty()) {
			this.data.push(temp.pop());
		}
	}
	public void disp() {
		this.data.display();
	}

	public int dequeueEff() throws Exception {
		return this.data.pop();
	}
//	public void disp1()
//	{
//		this.data.display();
//	}

}
