package RECURSION;

import java.util.Scanner;

public class recursion_twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		countwins(s, 0);
	}

	public static void countwins(String s, int count) {
		
		if(s.length()==2)
		{
			System.out.println(count);
			return ;
		}
		char ch1=s.charAt(0);
		char ch2=s.charAt(2);
		String rem=s.substring(1);
		if(ch1==ch2)
		{
			count++;
		}
		countwins(rem, count);
	}
}
