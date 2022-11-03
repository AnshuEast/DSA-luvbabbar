package Pattern;
import java.util.Scanner;
public class pascaltraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			int val = 1;
			int j = 0;
			while (j <= i) {
				System.out.print(val + "\t");
				val = val * (i - j) / (j + 1);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
