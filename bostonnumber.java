package Hackerblocksquestions;

import java.util.Scanner;

public class bostonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    check(n);
	}

	public static int prime(int n) {
		int ans = 0;
		int i = 2;
		while (n != 1) {
			if (n % i == 0) {
				int rem=sumdigit(i);
				ans = ans + rem;
				n = n / i;
			} else {
				i++;
			}
		}
		return ans;
	}

	public static int sumdigit(int n) {
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem;
			n = n / 10;
		}
		return ans;
	}
	public static void check(int n)
	{
		if(sumdigit(n)==prime(n))
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
