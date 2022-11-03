package lecture_9;

import java.util.Scanner;

public class normalreverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		int[] arr = new int[n];
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		reverse(arr,i,j);
	}

	public static void reverse(int arr[],int i,int j) {
		int start = i;
		int end = j;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
