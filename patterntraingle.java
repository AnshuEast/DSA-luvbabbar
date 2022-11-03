package Pattern;
import java.util.*;

public class patterntraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sp = n - 1;
		int i = 1;
		int nst = 1;
		while (i <= n) {
			int val = i;
			int j = 1;
			while (j <= sp) {
				System.out.print("  ");
				j++;
			}
			j = 1;
			while (j <= nst) {
				System.out.print(val + " ");
				if (j < (nst / 2) + 1) {
					val++;
				} else {
					val--;
				}
				j++;
			}
			i++;
			sp--;
			nst += 2;
			System.out.println();
		}

    }
}

	


