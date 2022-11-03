package lecture_9;

import java.util.Scanner;

public class rotatearray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		rotate(arr, k);
	}

	static void rotate(int arr[], int k) {
		k = k % arr.length;
		for (int i = 1; i <= k; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		display(arr);
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
