package Hackerblocksquestions;
import java.util.*;

public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(function(n, d));

	}

	static int function(int n, int d) {
		int count = 0;
		int r;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			if (r == d) {
				count++;
			}

		}
		return count;
    	

	}

}
