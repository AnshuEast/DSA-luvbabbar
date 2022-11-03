package Hackerblocksquestions;

import java.util.*;

public class fanny_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char  ch = sc.next().charAt(0);
		System.out.println(s.length());
		int i = 0;
		String ans="";
		while (i<= s.length()-1) {
			if (s.charAt(i)==ch) {
				ans= ans+"";
			}
			else
			{
			ans = ans+s.charAt(i);
			}
			i++;
		}
		System.out.println(ans);
	}
}
