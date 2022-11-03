package stacks;

// it is example of the pop efficient 
public class Stacks_using_Queue {
	private DynamicQueue data;

	public Stacks_using_Queue() {
		this.data = new DynamicQueue();
	}

	public boolean isempty() {
		return this.data.isempty();
	}

	public int size() {
		return this.data.size;
	}

	public void push(int item) throws Exception {
		DynamicQueue temp = new DynamicQueue();
		while (!this.data.isempty()) {
			temp.enqueue(data.dequeue());
		}
		this.data.enqueue(item);
		while (!temp.isempty()) {
			data.enqueue(temp.dequeue());
		}
	}

	public int popeff() throws Exception {
		return this.data.dequeue();
	}

	// it is an example of push efficient
	
	public void  pusheff(int item) throws Exception
	{
		this.data.enqueue(item);
	} 
	public int pop() throws Exception {
		
		DynamicQueue temp1 = new DynamicQueue();
		while(this.data.size!=1)
		{
			temp1.enqueue(this.data.dequeue());
		}
		int x = this.data.dequeue();
		while(!temp1.isempty())
		{
			data.enqueue(temp1.dequeue());
		}
		return x;

	}

}
