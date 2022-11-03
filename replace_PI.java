package RECURSION;

import java.util.Scanner;

public class replace_PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			replace(s);
			System.out.println();
		}
	}
	public static void  replace(String s)
	{
		if(s.length()==0)
		{
			return ;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i')
		{
			System.out.print(3.14);
			replace(s.substring(2));
		}
		else
		{
			System.out.print(s.charAt(0));
			replace(s.substring(1));
		}
	}
}
