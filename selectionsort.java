package selfstudy;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		selection(arr);
	}

	public static void selection(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minidx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minidx]) {
				minidx = j;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
