package stacks;

 // or if it is present in the same package then  no need to import to use the function and data members of the previous Stack class we have to import the class 
public class stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack s = new stack(); // here the object creation has been started;
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		s.display();
		s.push(60);
		System.out.println(s.pop());
	}

}
