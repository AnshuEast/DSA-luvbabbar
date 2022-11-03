package Hackerblocksquestions;

import java.util.Scanner;

public class book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			int arr[] = new int[nob];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			search(arr, nos);
		}
	}
	public static void search(int arr[], int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			hi += arr[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (ispossible(arr, nos, mid) == true) {
				ans = mid;
				System.out.println(mid);
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean ispossible(int arr[], int nos, int mid) {
		int student = 1;
		int page = 0;
		int i = 0;
		while (i <= arr.length - 1) {
			if (page + arr[i] <= mid) {
				page += arr[i];
				i++;
			} else {
				student++;
				page = 0;
			}
			if (student > nos) {
				return false;
			}
		}
		return true;
	}
}
