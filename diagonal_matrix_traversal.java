package Hackerblocksquestions;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class diagonal_matrix_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		traverse(arr, n, m);
	}

	public static void traverse(int arr[][], int n, int m) {
		int[] ans = new int[m * n];
		int i = 0;
		for (int d = 0; d < n + m - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < m) {
				r = 0;
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> result = new ArrayList<>();
			while (r < n && c >= 0) {
				result.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(result);
			}
			for (int val : result) {
				ans[i] = val;// storing the list items in the array;
				i++;
			}
		}
		for(int val:ans)
		{
			System.out.print(val+" ");
		}
	}

}
