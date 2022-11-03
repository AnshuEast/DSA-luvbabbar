package Pattern;
import java.util.Scanner;

public class patternmagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = ((2 * n) - 1);
		int sp = -1;
		int nst = ((k / 2) + 1);
		int i = 1;
		while (i <= k) {
			int j = 1;
			while (j <= nst) {
				System.out.print("*");
				j++;
			}
			j = 1;
			while (j <= sp) {
				System.out.print(" ");
				j++;
			}
			int r = 1;
			if (i == 1 || i == k) {
				r = 2;
			}
			while (r <= nst) {
				System.out.print("*");
				r++;
			}
			if (i < ((k / 2) + 1)) {
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
