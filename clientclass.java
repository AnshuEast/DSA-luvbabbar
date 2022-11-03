package OOPS;

public class clientclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case 1
		childclass obj = new childclass();
		System.out.println(obj.d);
		System.out.println(obj.d2);
		//case 2
		parentclass p = new childclass();
		System.out.println(p.d);
		
	}

}
