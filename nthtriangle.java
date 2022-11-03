package RECURSION;

import java.util.Scanner;

public class nthtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(print(n));
	}
	public static int  print(int n) {
		int sum;
		if(n==0)
		{
			return 0;
		}
		sum = n+print(n-1);
		return sum;
	}

}
