package Hackerblocksquestions;

import java.util.Scanner;

public class celsiustofahre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int step = sc.nextInt();
		for (int i = minf; i <= maxf; i = i + step) {
			int C = (int) ((5.0 / 9.0) * (i - 32));
			System.out.print(i);
			System.out.print("\t");
			System.out.print(C);
			System.out.println();
		}

	}

}
