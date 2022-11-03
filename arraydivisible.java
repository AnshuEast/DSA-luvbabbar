package Hackerblocksquestions;

import java.util.Scanner;

public class arraydivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int T = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		divisible(arr);
	}

	public static void divisible(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int prev = 0;
			for (int j = i; j < arr.length; j++) {
				prev = prev + arr[j];
				if (prev % arr.length == 0) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}
