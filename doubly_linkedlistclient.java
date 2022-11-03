package LINKED_LIST;

public class doubly_linkedlistclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_linkedlist dl = new doubly_linkedlist();
		dl.Addatfirst(10);
		dl.Addatfirst(20);
		dl.Addatfirst(30);
		dl.Addatfirst(40);
		dl.Addatfirst(50);
		dl.Addatfirst(60);
		dl.Addatfirst(80);
		dl.Addatfirst(90);
		dl.reversal();
		dl.addatlast(23);
		dl.addatparticularafter(83, 3);
		dl.display();
	}

}
