package Hackerblocksquestions;

import java.util.Scanner;

public class count_of_palindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if(palindrome(s,i,j-1))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean palindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
