package RECURSION;

import java.util.Scanner;

public class keypad_problem {
	static int count=0; 
	static String key[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		possible(s,"");
		System.out.println("\n"+count);
	}
	public static void possible(String ques,String ans)
	{
		if(ques.length()==0)
		{
			count++;
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		String presskey = key[ch-48];
		for (int i = 0; i <presskey.length(); i++) {
			possible(ques.substring(1), ans+presskey.charAt(i));
			
		}
	}
}
