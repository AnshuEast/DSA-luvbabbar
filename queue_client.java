package stacks;

import java.util.Scanner;

public class queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		linearqueue l = new linearqueue(n);
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			l.enqueue(t);
		}
		l.display();
		System.out.println(l.dequeue());
		l.display();
		System.out.println(l.getfront());
	}

}
