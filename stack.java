package stacks;
public class stack {
	protected int[] data;
	private int top = 0;

	public stack()// default constructor
	{
		this.data = new int[5];
	}

	public stack(int num) {
		this.data = new int[num];
	}

	public boolean isempty() {
		return this.top == 0;
	}

	public void push (int item) throws Exception{
		if(isfull())
		{
			throw new Exception("error");
		}
		this.data[this.top] = item;
		this.top++;
	}
	public boolean isfull() {
		return this.top == this.data.length;
	}
	// pop 
	public int pop()throws Exception
	{
		if(isempty())
		{
			throw new Exception("error");
		}
		return this.data[--top];
	}
	public int peek() throws Exception
	{
		if(isempty())
		{
			throw new Exception("error");
		}
		return this .data[this.top-1];
	}
	public int size()
	{
		return top ; 
	}
	public void display()
	{
		for (int i = 0; i < top ; i++) {
			System.out.print(this.data[i]);
		}
		System.out.println();
	}
}