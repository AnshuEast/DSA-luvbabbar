package Hackerblocksquestions;

import java.util.Scanner;

public class anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int num = sc.nextInt();
		int first = decimal(sb, num);
		int second = any(db, first);
		System.out.println(second);
	}

	public static int decimal(int sb, int num) {
		int ans = 0;
		int mul = 1;
		while (num != 0) {
			int rem = num % 10;
			ans = ans + rem * mul;
			mul = mul * sb;
			num = num / 10;
		}
		return ans;
	}

	public static int any(int db, int num) {
		int ans = 0;
		int mul = 1;
		while (num != 0) {
			int rem = num % db;
			ans = ans + rem * mul;
			mul = mul * 10;
			num = num / db;
		}
		return ans;
	}

}
