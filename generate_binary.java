package RECURSION;

import java.util.*;

public class generate_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			String s = sc.next();
			generate(s,0,"",s.length());
			t--;
			System.out.println();
		}
	}
	public static void generate(String s ,int idx,String ans,int t) {

		if(ans.length()==t)
		{
			System.out.print(ans+" ");
		}
		if(idx<t&&s.charAt(idx)=='?')
		{
			generate(s, idx+1, ans.concat("0"), t);
			generate(s, idx+1, ans.concat("1"), t);
		}
		else if(idx<t)
		{
			generate(s, idx+1, ans.concat(String.valueOf(s.charAt(idx))), t);
		}
	}
}
