package Hackerblocksquestions;
import java.util.Scanner;
public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		print(s);
	}
	public static void print(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(uppercase(ch)==true)
			{
				System.out.println();
			}
			System.out.print(s.charAt(i));
		}
	}
	public static boolean uppercase(char ch)
	{
		char [] arr= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				return true;
			}
		}
		return false;
	}
}
