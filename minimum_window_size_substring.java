package SLIDING_WINDOW;

import java.util.Scanner;

public class minimum_window_size_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(minwindow(s1, s2));
	}

	public static String minwindow (String s,String t) {
		boolean visited[] = new boolean[256];// it stores the presence of the element
		int count[] = new int[256];
		int not = 0;
		for (int i = 0; i < t.length(); i++) {
			if (!visited[t.charAt(i)]) {
				visited[t.charAt(i)] = true;
			}
			not++;
			count[t.charAt(i)]++;
		}
		int i = 0;
		int j = 0;
		int no = 0;
		int start = 0;
		int len = Integer.MAX_VALUE;
		while (j < s.length()) {
			if (visited[s.charAt(j)]) {
				if (count[s.charAt(j)] >= 1) {
					no++;// window increase;
				}
				count[s.charAt(j)]--;// decrease the count of the element
			}
			while (no == not) {
				if (visited[s.charAt(i)]) {
					if (count[s.charAt(i)] == 0) {
						no--;
					}
					count[s.charAt(i)]++;
				}
				//update the answer
                if(len>j-i+1)
                {
					len=Math.min(len, j-i+1);
					start=i;
                }
				i++;//shrink the window 
			}
			j++;
		}
         if(len==Integer.MAX_VALUE) return "";
        return s.substring(start,start+len);
    }
}
