package selfstudy;

import java.util.Scanner;

public class buildarrayfrompermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		arrangement(arr);
	}
	//O(1) space allocated

	public static void arrangement(int arr[]) {
		int length = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = length*(arr[arr[i]] % length) + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / length;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}