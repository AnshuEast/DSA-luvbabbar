package Pattern;
import java.util.*;

public class patternwithzeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				if (j == 1 || j == i) {
					System.out.print(i+ " ");
				} else {
					System.out.print("0" + " ");
				}

				j++;

			}
			i++;
			System.out.println();
		}

	}

}
