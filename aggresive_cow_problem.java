package Hackerblocksquestions;

import java.util.Arrays;
import java.util.Scanner;

public class aggresive_cow_problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int arr[] = new int[nos];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		search(arr, noc);
	}

	public static void search(int arr[], int noc) {
		int result = 0;
		int low = 1;// search space
		int high = arr[arr.length - 1];// search space
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ispossible(arr, noc, mid) == true) {
				result = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(result);
	}

	public static boolean ispossible(int arr[], int noc, int mid) {
		int cows = 1;
		int pos = arr[0];
		int i = 1;
		while (i < arr.length) {
			if (arr[i] - pos >= mid) {
				cows++;
				pos = arr[i];
			}
			if (cows == noc) {
				return true;
			}
			i++;
		}
		return false;
	}
}
