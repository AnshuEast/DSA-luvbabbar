package Pattern;
import java.util.*;

public class patterninvertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int sp = 2 * n - 1;
		while (row <= 2 * n + 1) {
			int val = n;
			int j = 1;
			while (j <= star) {
				System.out.print(val + " ");
				j++;
				val=val-1;
			}
			int k = 1;
			while (k <= sp) {
				System.out.print("  ");
				k++;
			}
			j = 1;
			val++;
			if (row == n + 1) {
				j = 2;
				val=val+1;
			}
			while (j <= star) {

				System.out.print(val + " ");
				j++;
				val++;
			}
			if (row < n + 1) {
				star++;
				sp -= 2;
			} else {
				star--;
				sp += 2;
			}
			row++;
			System.out.println();
		}
	

    }
}
