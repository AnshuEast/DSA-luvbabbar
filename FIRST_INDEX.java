package RECURSION;

import java.util.*;

public class FIRST_INDEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item=sc.nextInt();
		System.out.println(firstindex(arr,arr.length-1, item));
	
	}

	public static int  firstindex(int arr[],int i,int item) {
		if(i==arr.length)
		{
			return -1;
		}
		if(arr[i]==item)
		{
			return i;
		}
		int index = firstindex(arr, i-1, item);
		return index;
	}
}
