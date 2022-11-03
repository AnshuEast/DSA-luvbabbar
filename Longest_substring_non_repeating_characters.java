package SLIDING_WINDOW;

import java.util.*;

public class Longest_substring_non_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		String s = sc.next();
		length(s);
		}
		// hence the length of substring is not fixed so its variable size sliding
		// window question
	}

	public static void length(String s) {
		int n = s.length();
		int i = 0;
		int result = 0;

		while (i < n) {
			boolean visited[] = new boolean[256];// default visited is false for every character;
			int j = i;
			while (j < s.length()) {
				if (visited[s.charAt(j)] == true)// agar elememt pehle se visited hoga toh usko hata denge or loop ko
													// break kr denge
				{
					break;
				} else {
					result = Math.max(result, j - i + 1);
					visited[s.charAt(j)] = true;
				}
				j++;
			}
			i++;
		}
		System.out.println(result);
	}

}
