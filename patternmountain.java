package Pattern;
import java.util.*;

public class patternmountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int sp = n + 1;
		while (row <= n) {
			int k = 1;
			int j = 1;
			while (j <= star) {
				System.out.print(k + " ");
				j++;
				k++;
			}
			int i = 1;
			while (i <= sp) {
				System.out.print("  ");
				i++;
			}
			j = 1;
			k--;
			if (row == n) {
				j = 2;
				k--;
			}
			while (j <= star) {
				System.out.print(k + " ");
				j++;
				k--;
			}
			sp -= 2;
			star++;
			row++;
			System.out.println();

		}

	}

}
