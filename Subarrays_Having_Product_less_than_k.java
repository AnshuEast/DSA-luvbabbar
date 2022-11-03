package SLIDING_WINDOW;

import java.util.Scanner;

public class Subarrays_Having_Product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		product(arr, k);
	}
	public static void product(int arr[],int k) {
		int i=0;
		int j=0;
		int len=0;
		int p=1;
		while(j<arr.length)
		{
			p=p*arr[j];
			while(p>=k&&i<=j)
			{
				p=p/arr[i];
				i++;
			}
			len=len+j-i+1;
			j++;
		}
		System.out.println(len);
	}
}
