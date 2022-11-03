package Hackerblocksquestions;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		wave(arr);
	}

	public static void wave(int arr[][]) {
		int col = 0;
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] +","+" ");
				}
			} else {
				for (col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + ","+" ");
				}
			}
		}
		System.out.println("END");
	}

}
