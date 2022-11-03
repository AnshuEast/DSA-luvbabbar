package stacks;

public class dynamicstack extends stack {
	@Override 
	public void push(int item)throws Exception
	{
		if(this.isfull())
		{
			int [] arr = new int [2*this.data.length];
			for(int i = 0 ; i< data.length;i++)
			{
				arr[i]=this.data[i];
			}
			this.data = arr;// assigning the address of the  arr Array to data Array 
		}
		super.push(item);// it call the function of the parent class otherwise it becomes the recursive one 
	}
}
