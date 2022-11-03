package Pattern;
import java.util.*;

public class patterndoublesidearrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;
		int sp = n - 1;
		int spb = -1;
		int nst = 1;
		int val=1;
		while (i <= n) {
			int r=val;
			int j = 1;
			while (j <= sp) {
				System.out.print("  ");
				j++;
			}
			j = 1;
			while (j <= nst) {
				System.out.print(r+" ");
				j++;
				r--;
			}
			j = 1;
			while (j <= spb) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (i == 1 || i == n) {
				k=2;
			}
			r=1;
				while (k <= nst) {
					System.out.print(r+" ");
					k++;
					r++;
				}
			if (i < (n / 2) + 1) {
				sp -= 2;
				spb += 2;
				nst++;
				val++;
			} else {
				sp += 2;
				spb -= 2;
				nst--;
				val--;
			}
			i++;
			System.out.println();
		}

	}

}
