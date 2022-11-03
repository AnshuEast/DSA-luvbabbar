package stacks;
public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.enqueue(60);
		dq.display();
		System.out.println("************");
		reverse(dq);
		dq.display();
	}
	private static void reverse(DynamicQueue dq) throws Exception {
		
		
		if(dq.isempty())
		{
			return ;
		}
		int x = dq.dequeue();
		reverse(dq);
		dq.enqueue(x);
	}
}
