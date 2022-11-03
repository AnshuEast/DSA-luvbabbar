package selfstudy;

import java.util.Scanner;

public class leetcode69sqrtX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = checksqrt(n);
		System.out.println(ans);
	}

	public static int checksqrt(int x) {
		//System.out.println(binary(x));
		return (int) binary(x);
	}

	public static long binary(int x) {
		int s = 0;
		int e = x;
		long mid = s + (e - s) / 2;
		long ans = -1;
		while (s <= e) {
			long square = mid * mid;
			if (square == x) {
				return mid;
			} else if (square < x) {
				ans = mid;
				s = (int) (mid + 1);
			} else {
				e = (int) (mid - 1);
			}
			mid = s + (e - s) / 2;
		}
		return ans;
	}

}
