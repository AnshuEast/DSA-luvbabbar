package Pattern;
import java.util.Scanner;

public class hollowrhombuspattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			if (i == 1 || i == n) {
				int k = 1;
				while (k <= n) {
					System.out.print("*");
					k++;
				}
			} else {
				j = 1;
				while (j <= n) {
					if (j == 1 || j == n) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					j++;
				}
			}
			i++;
			System.out.println();
		}
	}

}
