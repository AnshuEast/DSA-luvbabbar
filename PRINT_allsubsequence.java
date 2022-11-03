package RECURSION;

import java.util.Scanner;

public class PRINT_allsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = print(s, "");
		System.out.println();
		System.out.println(n);
	}

	public static int print(String s, String ans) {
		int count = 0;
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = s.charAt(0);
		count += print(s.substring(1), ans);// ek baar hum add nhi krenge
		count += print(s.substring(1), ans + ch);// el baar humne add kiya h
		return count;
	}

}
