package stacks;

public class DynamicQueue extends linearqueue {
	@Override
	public void enqueue(int item) throws Exception
	{
		if(this.isfull())
		{
		int arr [] = new int [2*this.data.length] ;
		for (int i = 0; i < this.data.length; i++) {
			int idx = (this.front+i)%this.data.length;
			arr[i] = data[idx];
		}
		this.data = arr;
		this.front = 0; 
		}
		super.enqueue(item);
	}	
}
