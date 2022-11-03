package Hackerblocksquestions;

import java.util.Scanner;

public class chewbaaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = n;
		long ans = 0;
		long count = 0;
		long mul = 1;
		while (m != 0) {
			long rem = m % 10;
			count++;
			m = m / 10;
		}
		while (count > 0&&n!=0) {
			long r = n % 10;
			if (count == 1 && r == 9) {
				ans = ans + mul * r;
				break;
			} else {
				if (r >= 5 && r <= 9) {
					r = 9-r;
				}
				ans = ans + mul * r;
				n = n / 10;
			}
			mul=mul*10;
			count--;
		}
		System.out.println(ans);
	}

}
