package Pattern;

import java.util.Scanner;

public class hollowdiamod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n / 2 + 1;
		int sp = -1;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j++;
			}
			j = 1;
			while (j <= sp) {
				System.out.print("  ");
				j++;
			}
			j = 1;
			if (i == 1 || i == n) {
				j = 2;
			}
			while (j <= nst) {
				System.out.print("*" + " ");
				j++;
			}
			if (i < (n / 2) + 1) {
				sp += 2;
				nst--;
			} else {
				sp -= 2;
				nst++;
			}
			i++;
			System.out.println();
		}
	}
}
