package leetcode;

import java.util.Scanner;

public class rotatearrayaroundK {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		System.out.println("enter the k value:");
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		rotate(arr, k);
	}
	//reversal algorithm

	static void rotate(int arr[], int k) {
		k = k % arr.length;
		int n = arr.length;
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - k - 1);
		reverse(arr, 0, n - 1);
		display(arr);
	}

	public static void reverse(int arr[], int i, int j) {
		int start = i;
		int end = j;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
