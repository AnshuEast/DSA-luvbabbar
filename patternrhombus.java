package Pattern;
import java.util.Scanner;

public class patternrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = (2 * n - 1);
		int sp = k / 2;
		int nst = 1;
		int i = 1;
		int val = 1;
		while (i <= k) {
			int r = val;
			int j = 1;
			while (j <= sp) {
				System.out.print("  ");
				j++;
			}
			j = 1;
			while (j <= nst) {
				System.out.print(r + " ");
				if (j < (nst / 2) + 1) {
					r++;
				} else {
					r--;
				}
				j++;
			}
			if (i < (k / 2) + 1) {
				sp--;
				nst += 2;
				val++;
			} else {
				sp++;
				nst -= 2;
				val--;
			}
			i++;
			System.out.println();
		}

	}

}
