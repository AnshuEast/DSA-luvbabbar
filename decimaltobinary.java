package lecture_6;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int mul = 1;
		while (n != 0) {
			int rem = n % 8;
			ans = ans + rem * mul;
			n=n/8;
			mul = mul * 10;
		}
		System.out.println(ans);
	}

}
