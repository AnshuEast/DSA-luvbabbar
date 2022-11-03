package LINKED_LIST;

public class circularlinkedlistMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_linkedlist cl = new circular_linkedlist();
		cl.addatlast(10);
		cl.addatlast(20);
		cl.addatlast(30);
		cl.addatlast(40);
		cl.addatlast(50);
		cl.display();
		cl.addatlast(33);
		cl.display();
		cl.deletion(33);
		cl.display();

	}

}
