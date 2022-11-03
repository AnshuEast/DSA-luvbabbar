package SLIDING_WINDOW;

import java.util.Scanner;

public class Longest_K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int n = sc.nextInt();
			length(s, n);
		}
		// hence the length of substring is not fixed so its variable size sliding
		// window question
	}

	public static void length(String s, int k) {
		int vis[] = new int[256];
		int si = 0;
		int ei = 0;
		int ans = -1;
		int unique = 0;
		while (ei < s.length()) {
			char ch = s.charAt(ei);
			if (vis[ch] == 0) {
				unique++;
			}
			vis[ch]++;
			while (unique > k) {
				char c = s.charAt(si);
				vis[c]--;
				if (vis[c] == 0) {
					unique--;
				}
				si++;
			}
			if (unique == k) {
				ans = Math.max(ans, ei - si + 1);
			}
			ei++;
		}
		System.out.println(ans);

	}
}
